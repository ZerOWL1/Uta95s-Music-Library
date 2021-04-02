/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AlbumDAO;
import DAO.LoadDAO;
import Entity.Album;
import Entity.Artist;
import Entity.Categories;
import Entity.Song;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "HomeControl", urlPatterns = {"/home"})
public class HomeControl extends HttpServlet {

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
        AlbumDAO albDAO = new AlbumDAO();
        
        //Pag
        int pageSize = 12;
        int index = 1;
        if (request.getParameter("index") != null) {
            index = Integer.parseInt(request.getParameter("index"));
        }
        int size = 0;
        List<Album> listAlb = new ArrayList<>();
        if (request.getParameter("cid") != null) {
            int cateID = Integer.parseInt(request.getParameter("cid"));
            size = new AlbumDAO().getNumberAlbum(cateID);
            listAlb = new AlbumDAO().getAlbumByIDCate(cateID, index, pageSize);
            request.setAttribute("isCategory", "true");
            request.setAttribute("cid", cateID);
        } else {
            size = new AlbumDAO().getNumberAlbum(-1);
            listAlb = new AlbumDAO().getAlbumByIDCate(-1, index, pageSize);
            request.setAttribute("isCategory", "false");
        }

        int endPage = size / pageSize;
        if (size % pageSize != 0) {
            endPage++;
        }
        List<Song> list = dao.getAllSong();
        List<Categories> gen = dao.getGenre();
        List<Album> allAl = dao.getAllAlbum();
//        List<Album> alb = dao.pagAlbum(home);

        //view
        int view = dao.getViewPage();
        String formatV = String.format("%05d", view);
        request.setAttribute("view", formatV);

        //set data to jsp
//        request.setAttribute("class", home);
        request.setAttribute("index", index);
        request.setAttribute("endP", endPage);
        request.setAttribute("listSong", list);
        request.setAttribute("listGenre", gen);
        request.setAttribute("allAl", listAlb);
        request.getRequestDispatcher("home.jsp").forward(request, response);
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
