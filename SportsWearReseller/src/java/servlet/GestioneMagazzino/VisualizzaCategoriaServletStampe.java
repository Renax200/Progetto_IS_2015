/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.GestioneMagazzino;

import Entità.Account;
import Managers.MagazzinoManager;
import java.io.IOException;
import java.io.PrintWriter;
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
public class VisualizzaCategoriaServletStampe extends HttpServlet {

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
        Account a = (Account) session.getAttribute("account");
        
        if(session!=null)  
        session.setAttribute("account", a);
        session.setAttribute("listaCat", MagazzinoManager.listaProdottiCatogoria("Stampe"));
        RequestDispatcher rd=request.getRequestDispatcher("GestioneMagazzinoCliente.jsp");    
        rd.forward(request,response);
    }
}