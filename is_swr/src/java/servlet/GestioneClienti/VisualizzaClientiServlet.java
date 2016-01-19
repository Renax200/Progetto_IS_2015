/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.GestioneClienti;

import exception.MagazzinoException;
import manager.ClientiManager;
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
public class VisualizzaClientiServlet extends HttpServlet {

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
        try{
        HttpSession session = request.getSession(true);  
        if(session!=null)  
        session.setAttribute("account", session.getAttribute("account"));  
        session.setAttribute("clienti", ClientiManager.getInstance().listaClienti());
        RequestDispatcher rd=request.getRequestDispatcher("GestioneClientiVenditore.jsp");    
        rd.forward(request,response);    
        } catch (MagazzinoException | SQLException | ClassNotFoundException | 
                InstantiationException | IllegalAccessException ex) {
             Logger.getLogger(VisualizzaClientiServlet.class.getName()).log(Level.SEVERE, null, ex);
             out.print("<SCRIPT id=\"al\" TYPE=\"text/javascript\">\n" +
                          "alert(\""+ex.getLocalizedMessage()+"\");</SCRIPT>");
            RequestDispatcher rd=request.getRequestDispatcher("AdminLoginHome.jsp");    
            rd.forward(request,response);
         }
        out.close();
    }
}
