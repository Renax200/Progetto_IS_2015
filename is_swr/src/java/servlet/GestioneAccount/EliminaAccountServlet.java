/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.GestioneAccount;

import entità.Account;
import exception.EmailException;
import manager.AccountManager;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author carfo
 */
public class EliminaAccountServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            HttpSession session = request.getSession(true);
           
            Account a = (Account) session.getAttribute("account");
           
            AccountManager.getInstance().eliminaAccount(a);
            
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
            rd.forward(request,response);
        } catch (ClassNotFoundException | InstantiationException | SQLException | IllegalAccessException | EmailException ex) {
            Logger.getLogger(EliminaAccountServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    
    }

   


