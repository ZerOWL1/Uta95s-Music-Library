/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.SongDAO;
import Entity.Song;
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
@WebServlet(name = "AddSongControl", urlPatterns = {"/addS"})
public class AddSongControl extends HttpServlet {

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
        SongDAO sDAO = new SongDAO();
        
        String idS = request.getParameter("idS");
        String nameS = request.getParameter("nameS");
        String relS = request.getParameter("releaseS");
        String idAlbS = request.getParameter("idAlbumS");
        String idArtS = request.getParameter("idArtistS");
        String genS = request.getParameter("genreS");
        String mv_pathS = request.getParameter("mv_path");
        String song_path = request.getParameter("song_path");
        String img_path = request.getParameter("img_path");
        
        Song checkSID = sDAO.checkSongByID(idS);
        if(checkSID == null){
            sDAO.insertSong(idS, nameS, relS, idAlbS, idArtS, genS, mv_pathS, song_path, img_path);
            request.getRequestDispatcher("manage").forward(request, response);
        }else{
            request.setAttribute("checkS", "SongID enter already exist!! Please check again.");
            request.getRequestDispatcher("manage").forward(request, response);
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
