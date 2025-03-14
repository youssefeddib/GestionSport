package Servlet;

import DAO.MembreDAO;
import Model.MembreModel;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.Servlet.ServletException;
import javax.Servlet.annotation.WebServlet;
import javax.Servlet.http.HttpServlet;
import javax.Servlet.http.HttpServletRequest;
import javax.Servlet.http.HttpServletResponse;

@WebServlet("/MembreServlet")
public class MembreServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private MembreDAO membreDAO;

    public void init() {
        membreDAO = new MembreDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<MembreModel> membres = membreDAO.getAllMembres();
        request.setAttribute("membres", membres);
        request.getRequestDispatcher("membres.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");

        MembreModel membre = new MembreModel(0, nom, prenom, email, telephone);
        membreDAO.ajouterMembre(membre);

        response.sendRedirect("MembreServlet");
    }
}
