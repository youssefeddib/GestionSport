package Servlet;

import DAO.MembreDAO;
import Model.MembreModel;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MembreServlet")
public class MembreServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private MembreDAO membreDAO;

    public void init() {
        membreDAO = new MembreDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<MembreModel> membres = null;
        try {
            membres = membreDAO.getAllMembres();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("membres", membres);
        request.getRequestDispatcher("membres.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");

        MembreModel membre = new MembreModel(0, nom, prenom, email, telephone);
        try {
            membreDAO.ajouterMembre(membre);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        response.sendRedirect("MembreServlet");
    }
}
