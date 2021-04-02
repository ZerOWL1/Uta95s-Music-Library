/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UserDAO;
import Entity.Account;
import Entity.Mail;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "EditProfileControl", urlPatterns = {"/editPro"})
public class EditProfileControl extends HttpServlet {

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
        UserDAO userDAO = new UserDAO();
        HttpSession session = request.getSession();
        HttpSession mailSes = request.getSession();

        Account a = (Account) session.getAttribute("acc");
        int uid = a.getUid();
        Mail mChange = (Mail) mailSes.getAttribute("mailSes");

        String inputCode = request.getParameter("inputCode");
        String proImg = mChange.getImg();
        String proName = mChange.getName();
        String proMail = mChange.getMail();
        String proPass = mChange.getPass();
        String rePass = mChange.getRepass();

        if (inputCode.equals(mChange.getCode())) {
            userDAO.editAccountByPassword(proName, proPass, proMail, proImg, uid, rePass);
            request.setAttribute("warningPass", "5");
            request.getRequestDispatcher("manage").forward(request, response);
        } else {
            request.setAttribute("warningPass", "4");
            request.getRequestDispatcher("manage").forward(request, response);
        }

//        Account checkMail = userDAO.checkUserExistMail(proMail);
//        if (!rePass.equals(proPass)) {
//            request.setAttribute("warningPass", "1");
//        }
//        if (checkMail != null) {
//            request.setAttribute("warningPass", "2");
//            request.getRequestDispatcher("manage").forward(request, response);
//        } else {
////            userDAO.editAccountByPassword(proName, proPass, proMail, proImg, uid, rePass);
//            response.sendRedirect("manage");
//        }

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
