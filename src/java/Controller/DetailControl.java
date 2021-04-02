/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.LoadDAO;
import DAO.SongDAO;
import Entity.Album;
import Entity.Artist;
import Entity.Categories;
import Entity.Song;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ryuu
 */
@WebServlet(name = "DetailControl", urlPatterns = {"/detail"})
public class DetailControl extends HttpServlet {

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
        String id = request.getParameter("aid");
        
        HttpSession albSes = request.getSession();
        
        LoadDAO dao = new LoadDAO();
        SongDAO sDAO = new SongDAO();
        
        String mv_path = sDAO.getMV_Path(id);
        Album al = dao.getAlbumByID(id);
        String album = al.getIdArtist();
        String aid = dao.getNameByID(album);
        List<Categories> gen = dao.getGenre();
        List<Song> song = dao.getMusicByIDAL(id);
        
        //display view
        int view = dao.getViewPage();
        String formatV = String.format("%05d", view);
        request.setAttribute("view", formatV);
        request.setAttribute("MVPath", mv_path);
        request.setAttribute("sByAlID", song);
        request.setAttribute("abc", aid);
        request.setAttribute("listGenre", gen);
        albSes.setAttribute("detail", al);
        request.getRequestDispatcher("details.jsp").forward(request, response);
        
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
