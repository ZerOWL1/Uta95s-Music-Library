/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AlbumDAO;
import Entity.Album;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ryuu
 */
@WebServlet(name = "ConfirmEditAlbumControl", urlPatterns = {"/confirmAlb"})
public class ConfirmEditAlbControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        AlbumDAO albumDAO = new AlbumDAO();
        String albID = request.getParameter("albID");
        String albName = request.getParameter("albName");
        String albYear = request.getParameter("albYear");
        String idArtistS = request.getParameter("idArtistS");
        String genreS = request.getParameter("genreS");
        String albPath = request.getParameter("albPath");
        
        Album checkAlb = albumDAO.checkAlbumByID(albID);
        if(checkAlb == null){
            request.setAttribute("checkAlb", "AlbumID input invalid!! Please move back Management page if you don't remember data input!");
            request.getRequestDispatcher("editAlbum.jsp").forward(request, response); 
        }else{
            albumDAO.editAlbumByID(idArtistS, albName, albYear, albPath, genreS, albID);
            response.sendRedirect("manage");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
