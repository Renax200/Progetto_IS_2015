/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.GestioneMagazzino;

import entità.Account;

import exception.MagazzinoException;
import manager.MagazzinoManager;
import java.io.IOException;
import java.io.PrintWriter;
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
public class VisualizzaMagazzinoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();    
        response.setContentType("text/html;charset=UTF-8");
      
        try {
             HttpSession session = request.getSession(true);
                Account a = (Account) session.getAttribute("account");
                String cat=request.getParameter("categoria");
                session.setAttribute("account", a);
                session.setAttribute("lista", MagazzinoManager.getInstance().listaProdotti());
                RequestDispatcher rd=request.getRequestDispatcher("GestioneMagazzinoVenditore.jsp");    
                rd.forward(request,response);
        } 
        catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException |
                MagazzinoException ex) {
            Logger.getLogger(VisualizzaMagazzinoServlet.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        out.close();
     }
 }


