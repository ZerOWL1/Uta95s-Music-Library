/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AlbumDAO;
import DAO.ArtistDAO;
import DAO.FavoritesDAO;
import DAO.LoadDAO;
import DAO.SongDAO;
import DAO.UserDAO;
import Entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ryuu
 */
public class DeleteControl extends HttpServlet {

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
        LoadDAO dao = new LoadDAO();
        UserDAO uDAO = new UserDAO();
        SongDAO sDAO = new SongDAO();
        ArtistDAO artDAO = new ArtistDAO();
        AlbumDAO albDAO = new AlbumDAO();
        FavoritesDAO faDAO = new FavoritesDAO();
        HttpSession ses = request.getSession();
        Account ac = (Account)ses.getAttribute("acc");
        
        
        //delete genre 
        String gid = request.getParameter("gid");
        dao.deleteGenre(gid);
        //delete user 
        String uid = request.getParameter("uID");
        uDAO.deleteUser(uid);
        //delete song
        String sid = request.getParameter("sid");
        sDAO.deleteSong(sid);
        //delete alb
        String alb = request.getParameter("alb");
        albDAO.deleteAlbum(alb);
        //delete art
        String art = request.getParameter("art");
        artDAO.deleteArtist(art);
        //delete favorite
        
        String favoID = request.getParameter("sFavor");
        faDAO.deleteFavor(ac.getUid(), favoID);
        
        
        response.sendRedirect("manage");
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
