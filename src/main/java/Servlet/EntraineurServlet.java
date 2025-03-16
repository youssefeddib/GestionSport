package Servlet;

import DAO.EntraineurDAO;
import Model.EntraineurModel;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EntraineurServlet")
public class EntraineurServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EntraineurDAO entraineurDAO;

    public void init() {
        entraineurDAO = new EntraineurDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<EntraineurDAO> entraineurs = entraineurDAO.getAllEntraineurs();
        request.setAttribute("entraineurs", entraineurs);
        request.getRequestDispatcher("entraineurs.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String specialite = request.getParameter("specialite");
        String telephone = request.getParameter("telephone");
        String email = request.getParameter("email");

        EntraineurDAO entraineur = new Entraineur(0, nom, prenom, specialite, telephone, email);
        entraineurDAO.addEntraineur(entraineur);

        response.sendRedirect("EntraineurServlet");
    }
}
