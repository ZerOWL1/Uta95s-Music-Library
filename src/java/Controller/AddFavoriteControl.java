/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.FavoritesDAO;
import DAO.LoadDAO;
import Entity.Account;
import Entity.Album;
import Entity.Categories;
import Entity.Favorites;
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
@WebServlet(name = "AddFavoriteControl", urlPatterns = {"/addFavol"})
public class AddFavoriteControl extends HttpServlet {

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
        Favorites f = new Favorites();
        FavoritesDAO faDAO = new FavoritesDAO();
        HttpSession ses = request.getSession();
        HttpSession albSes = request.getSession();

        String idS = request.getParameter("idS");
        Account ac = (Account) ses.getAttribute("acc");
        Album alb = (Album)albSes.getAttribute("detail");
        Album al = dao.getAlbumByID(alb.getIdAlbum());
        List<Categories> gen = dao.getGenre();
        List<Song> song = dao.getMusicByIDAL(alb.getIdAlbum());
        String aid = al.getIdArtist();
        String aidAl = dao.getNameByID(aid);
        
        
        //display view
        int view = dao.getViewPage();
        String formatV = String.format("%05d", view);
        request.setAttribute("view", formatV);
        
        f.setSid(idS);
        f.setUid(ac.getUid());
        faDAO.addFavorite(f);
        request.setAttribute("sByAlID", song);
        request.setAttribute("abc", aidAl);
        request.setAttribute("listGenre", gen);
        request.setAttribute("detail", al);
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
