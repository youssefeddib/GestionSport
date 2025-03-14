package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import DAO.DBconnexion;
import Model.EntraineurModel;

public class EntraineurDAO {
    public void ajouterEntraineur(EntraineurModel entraineur) throws SQLException {
        String sql = "INSERT INTO Entraineur (nom, prenom, specialite, telephone, email) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBconnexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entraineur.getNom());
            stmt.setString(2, entraineur.getPrenom());
            stmt.setString(3, entraineur.getSpecialite());
            stmt.setString(4, entraineur.getTelephone());
            stmt.setString(5, entraineur.getEmail());
            stmt.executeUpdate();
        }
    }

    public List<EntraineurModel> getAllEntraineurs() throws SQLException {
        List<EntraineurModel> entraineurs = new ArrayList<>();
        String sql = "SELECT * FROM Entraineur";
        try (Connection conn = DBconnexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                entraineurs.add(new EntraineurModel(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"),
                        rs.getString("specialite"), rs.getString("telephone"), rs.getString("email")));
            }
        }
        return entraineurs;
    }
}
