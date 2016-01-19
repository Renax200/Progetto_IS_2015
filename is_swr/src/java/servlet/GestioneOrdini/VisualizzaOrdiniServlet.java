/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.GestioneOrdini;

import entità.Account;
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
public class VisualizzaOrdiniServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);  
        if(session!=null)  
        session.setAttribute("account", session.getAttribute("account"));  
        Account account = (Account) session.getAttribute("account");
        if(account.getTipo().equals("Venditore")){
        RequestDispatcher rd=request.getRequestDispatcher("GestioneOrdiniVenditore.jsp");    
        rd.forward(request,response);
        }
        else{
            RequestDispatcher rd=request.getRequestDispatcher("GestioneOrdiniCliente.jsp");    
            rd.forward(request,response);
        }
     
    }

}
