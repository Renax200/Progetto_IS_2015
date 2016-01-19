/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.GestioneAccount;

import entità.Account;
import exception.*;
import manager.AccountManager;
import manager.MagazzinoManager;
import com.sun.mail.iap.ConnectionException;
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
        String indirizzo = request.getParameter("indirizzo");
        String partitaIva=request.getParameter("partita_iva");
        String pass=request.getParameter("pass2");
        String passDiConferma = request.getParameter("pass3");
        String tipo="Cliente";
        
        if(pass.equals(passDiConferma)){
                try{  
                     Account account  = AccountManager.getInstance().creaAccount(nome,cognome,email,pass,societa,indirizzo,tipo,partitaIva); 
                     HttpSession session = request.getSession(true);    
                     session.setAttribute("account", account);
                     session.setAttribute("lista",MagazzinoManager.getInstance().listaProdotti());
                     RequestDispatcher rd=request.getRequestDispatcher("ClienteLoginHome.jsp");    
                     rd.forward(request,response);
                    }
                catch (SQLException | ConnectionException | ClassNotFoundException |
                        EmailException | PasswordException | NullAccountException |
                        NameException | SocietaException | PIvaException |MagazzinoException |
                        InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(CreateAccountServlet.class.getName()).log(Level.SEVERE, null, ex);
                    out.print("<SCRIPT id=\"al\" TYPE=\"text/javascript\">\n" +
                          "alert(\""+ex.getLocalizedMessage()+"\");</SCRIPT>");
                    RequestDispatcher rd=request.getRequestDispatcher("index.jsp");    
                    rd.forward(request,response);
                } 
            }
            else{ 
                out.print("<SCRIPT id=\"al\" TYPE=\"text/javascript\">\n" +
                          "alert(\"Le due password non sono uguali\");" +
                          "</SCRIPT>");
                RequestDispatcher rd=request.getRequestDispatcher("index.jsp");    
                rd.forward(request,response);
            }
        out.close();
    }    

}
