/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AlbumDAO;
import DAO.ArtistDAO;
import DAO.FavoritesDAO;
import DAO.GenreDAO;
import DAO.LoadDAO;
import DAO.SongDAO;
import DAO.UserDAO;
import Entity.Account;
import Entity.Album;
import Entity.Artist;
import Entity.Categories;
import Entity.Song;
import Entity.SongFavorites;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ryuu
 */
public class ManagementControl extends HttpServlet {

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
        FavoritesDAO faDAO = new FavoritesDAO();
        SongDAO sDAO = new SongDAO();
        ArtistDAO artDAO = new ArtistDAO();
        GenreDAO genDAO = new GenreDAO();
        AlbumDAO albDAO = new AlbumDAO();

        HttpSession session = request.getSession();
        Account a = (Account) session.getAttribute("acc");
        int uimg = a.getUid();
        String ui = dao.displayImgByUID(uimg);
        Account pro = uDAO.getUserByIDINT(uimg);

        //set list
        List<SongFavorites> sFavo = faDAO.listFa(uimg);
        List<Account> ac = dao.getAllAccount();
        List<Song> allSong = dao.getAllSong();
        List<Categories> cate = dao.getGenre();
        List<Artist> art = dao.getAllArtist();
        List<Album> alb = dao.getAllAlbum();

        //paging Favor
        String faIndex = request.getParameter("faIndex");
        if(faIndex == null){
            faIndex = "1";
        }
        int faIn = Integer.parseInt(faIndex);
        int faCount = faDAO.getTotalFavor(uimg);
        int faEnd = faCount/10;
        if(faCount % 10 != 0){
            faEnd++;
        }
        List<SongFavorites> listSFavor = faDAO.listPagingFa(uimg, faIn);
        request.setAttribute("faEnd", faEnd);
        request.setAttribute("faTag", faIndex);
        
        //paging song
        String sIndex = request.getParameter("sindex");
        if(sIndex == null){
            sIndex  = "1";
        }
        int sIn = Integer.parseInt(sIndex);
        int sCount = sDAO.getTotalSong();
        int sEnd = sCount / 10;
        if (sCount % 10 != 0) {
            sEnd++;
        }
        List<Song> listS = sDAO.pagingSong(sIn);
        request.setAttribute("sEnd", sEnd);
        request.setAttribute("sTag", sIndex);
        
        //paging artist
        String artIndex = request.getParameter("artIndex");
        if(artIndex == null){
            artIndex = "1";
        }
        int artIn = Integer.parseInt(artIndex);
        int artCount = artDAO.getTotalArtist();
        int artEnd = artCount/10;
        if(artCount % 10 != 0){
            artEnd++;
        }
        List<Artist> listArt = artDAO.pagingArtist(artIn);
        request.setAttribute("artEnd", artEnd);
        request.setAttribute("artTag", artIn);
        
        //paging genre
        String genIndex = request.getParameter("genIndex");
        if(genIndex == null){
            genIndex = "1";
        }
        int genIn = Integer.parseInt(genIndex);
        int genCount = genDAO.getTotalGenre();
        int genEnd = genCount/10;
        if(genCount % 10 != 0){
            genEnd++;
        }
        List<Categories> listCate = genDAO.pagingGenre(genIn);
        request.setAttribute("genEnd", genEnd);
        request.setAttribute("genTag", genIn);
        
        //paging alb
        String albIndex = request.getParameter("albIndex");
        if(albIndex == null){
            albIndex = "1";
        }
        int albIn = Integer.parseInt(albIndex);
        int albCount = albDAO.getTotalAlbum();
        int albEnd = albCount/10;
        if(albCount % 10 != 0){
            albEnd++;
        }
        List<Album> listAl = albDAO.pagingAlbum(albIn);
        request.setAttribute("albEnd", albEnd);
        request.setAttribute("albTag", albIn);
        
        //paging user
        String uIndex = request.getParameter("uIndex");
        if(uIndex == null){
            uIndex = "1";
        }
        int uIn = Integer.parseInt(uIndex);
        int uCount = uDAO.getTotalAccount();
        int uEnd = uCount/10;
        if(uCount % 10 != 0){
            uEnd++;
        }
        List<Account> listAC = uDAO.pagingAccount(uIn);
        request.setAttribute("uEnd", uEnd);
        request.setAttribute("uTag", uIn);
        
        
        //send tag request
        String tag = request.getParameter("tagP");
            if(tag == null){
            tag = "1";
        }
        request.setAttribute("tagT", tag);
        
        
        //send request
        request.setAttribute("accM", ac);
        request.setAttribute("genreM", cate);
        request.setAttribute("allSM", allSong);
        request.setAttribute("artM", art);
        request.setAttribute("albM", alb);
        
        request.setAttribute("allFavor", sFavo);
        request.setAttribute("sFavo", listSFavor);
        request.setAttribute("pro", pro);
        request.setAttribute("uimg", ui);
        request.setAttribute("listAC", listAC);
        request.setAttribute("listGenre", cate);
        request.setAttribute("listCate", listCate);
        request.setAttribute("listS", listS);
        request.setAttribute("listArt", listArt);
        request.setAttribute("listAl", listAl);
        request.getRequestDispatcher("user.jsp").forward(request, response);
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
