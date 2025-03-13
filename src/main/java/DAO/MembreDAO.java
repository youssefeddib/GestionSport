package DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.MembreModel;

public class MembreDAO {
    public void ajouterMembre(MembreModel membre) throws SQLException {
        String sql = "INSERT INTO Membre (nom, prenom, email, telephone) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBconnexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, membre.getNom());
            stmt.setString(2, membre.getPrenom());
            stmt.setString(3, membre.getEmail());
            stmt.setString(4, membre.getTelephone());
            stmt.executeUpdate();
        }
    }

    public MembreModel getMembreByEmail(String email) throws SQLException {
        String sql = "SELECT * FROM Membre WHERE email = ?";
        try (Connection conn = DBconnexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new MembreModel(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"),
                        rs.getString("email"), rs.getString("telephone"));
            }
        }
        return null;
    }

    public List<MembreModel> getAllMembres() throws SQLException {
        List<MembreModel> membres = new ArrayList<>();
        String sql = "SELECT * FROM Membre";
        try (Connection conn = DBconnexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                membres.add(new MembreModel(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"),
                        rs.getString("email"), rs.getString("telephone")));
            }
        }
        return membres;
    }
}