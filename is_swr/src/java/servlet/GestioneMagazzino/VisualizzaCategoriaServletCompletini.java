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
 * @author Grappone Renato
 */
public class VisualizzaCategoriaServletCompletini extends HttpServlet {

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
        PrintWriter out = response.getWriter();    
        response.setContentType("text/html;charset=UTF-8");
         HttpSession session = request.getSession(true);
        try{
        Account a = (Account) session.getAttribute("account");  
        session.setAttribute("account", a);
        session.setAttribute("listaCat", MagazzinoManager.getInstance().listaProdottiCatogoria("Completini"));
        RequestDispatcher rd=request.getRequestDispatcher("GestioneMagazzinoCliente.jsp");    
        rd.forward(request,response);
        } catch (MagazzinoException | SQLException | ClassNotFoundException | InstantiationException | 
                IllegalAccessException ex) {
             Logger.getLogger(VisualizzaCategoriaServletTute.class.getName()).log(Level.SEVERE, null, ex);
             out.println("<script> alert(\""+ex.getLocalizedMessage()+"\");</script>");
             session.setAttribute("account", session.getAttribute("account"));
             session.setAttribute("lista", session.getAttribute("lista"));
             RequestDispatcher rd=request.getRequestDispatcher("ClienteLoginHome.jsp");
             rd.forward(request,response); 
         }
        out.close();
}
}