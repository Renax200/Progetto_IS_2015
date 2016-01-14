/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.GestioneCarrello;

import Entità.Account;
import Entità.Carrello;
import Entità.Prodotto;
import Managers.AccountManager;
import Managers.CarrelloManager;
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
public class InserimentoCarrelloServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
public void doPost(HttpServletRequest request, HttpServletResponse response)    
            throws ServletException, IOException {    
  
        response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
          
        String n=request.getParameter("aggiungi");    
        int id = Integer.parseInt(n);
        Prodotto p = CarrelloManager.getProdottoDaInserire(id);
        Carrello.InserisciNelCarrello(p);
        HttpSession session = request.getSession(true);  
        if(session!=null)  
        session.setAttribute("account", session.getAttribute("account"));   
        RequestDispatcher rd=request.getRequestDispatcher("GestioneMagazzinoCliente.jsp");    
        rd.forward(request,response);   
    }
}