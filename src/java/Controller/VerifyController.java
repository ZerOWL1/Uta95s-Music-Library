/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UserDAO;
import Entity.Account;
import Entity.Mail;
import Verification.MailVerify;
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
@WebServlet(name = "VerifyController", urlPatterns = {"/verification"})
public class VerifyController extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            UserDAO userDAO = new UserDAO();
            HttpSession session = request.getSession();
            Account a = (Account) session.getAttribute("acc");
            int uid = a.getUid();
            String proImg = request.getParameter("proImg");
            String proName = request.getParameter("proName");
            String proMail = request.getParameter("proMail");
            String proPass = request.getParameter("proPass");
            String rePass = request.getParameter("rePass");

            MailVerify mail = new MailVerify();
            String code = mail.getRandom();
            
            //ham check pass
            String uMail = userDAO.getMailByID(uid);
            String uPass = userDAO.getPassByIDMail(uid, uMail);
            
            Mail mTo = new Mail(proImg, proName, uMail, proPass, rePass, code);
            Mail mChange = new Mail(proImg, proName, proMail, proPass, rePass, code);

            Account checkMail = userDAO.checkUserExistMail(proMail);
            if (!rePass.equals(proPass) && checkMail != null) {
                request.setAttribute("warningPass", "1");
                request.getRequestDispatcher("manage").forward(request, response);
            }else if(!rePass.equals(uPass)){
                request.setAttribute("warningPass", "2");
                request.getRequestDispatcher("manage").forward(request, response);
            }else if(checkMail != null){
                request.setAttribute("warningPass", "3");
                request.getRequestDispatcher("manage").forward(request, response);
            }
             else {
//                boolean test = true;
                boolean test = mail.sendEmail(mTo);
                if (test) {
                    HttpSession mailSes = request.getSession();
                    mailSes.setAttribute("mailSes", mChange);
                    response.sendRedirect("verification.jsp");
                } else {
                    out.println("Error to send vertication");
                }
            }
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
