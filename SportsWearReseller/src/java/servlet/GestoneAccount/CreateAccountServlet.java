/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.GestoneAccount;

import Entità.Account;
import Managers.AccountManager;
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
public class CreateAccountServlet extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response)    
            throws ServletException, IOException {    
  
        response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
          
        String nome=request.getParameter("nome");    
        String cognome=request.getParameter("cognome"); 
        String email=request.getParameter("email2");
        String societa=request.getParameter("nome_società");
        String partitaIva=request.getParameter("partita_iva");
        String pass=request.getParameter("pass2");
        String passDiConferma = request.getParameter("pass3");
        String tipo="Cliente";
        
        if(pass.equals(passDiConferma)){
            
            int r = AccountManager.creaAccount(nome,cognome,email,pass,societa,partitaIva,tipo);
            
            if(r==1){
            Account account = new Account(email,pass,nome,cognome,societa,partitaIva,tipo);
            HttpSession session = request.getSession(true);    
            session.setAttribute("account", account); 
            RequestDispatcher rd=request.getRequestDispatcher("ClienteLoginHome.jsp");    
            rd.forward(request,response); 
            }
            else{ 
                out.print("<script> alert(\"Errore nei parametri\")</script>");
            }
        }
        else{
            out.print("<script> alert(\"Le due password non corrispondono\")</script>");
        }
        out.close();
    }    

}
