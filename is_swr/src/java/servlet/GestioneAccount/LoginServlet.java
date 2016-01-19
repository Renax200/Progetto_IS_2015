/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.GestioneAccount;

import entità.Account;
import exception.EmailException;
import exception.MagazzinoException;
import exception.NullAccountException;
import exception.PasswordException;
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
 *
 * @author carfo
 */
public class LoginServlet extends HttpServlet {

 
     private static final long serialVersionUID = 1L;  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)    
            throws ServletException, IOException {    
  
        response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
          
        String n=request.getParameter("email");    
        String p=request.getParameter("pass"); 
        
       
         Account account = null;
         
         try {
            account = AccountManager.getInstance().logIn(n,p);
             System.out.println("Ho effettuato il logIn");
            HttpSession session = request.getSession(true);  
            session.setAttribute("account", account);  
            System.out.println("Ho avviato la sessione");
            switch (account.getTipo()) {
                case "Venditore":
                    {
                        RequestDispatcher rd=request.getRequestDispatcher("AdminLoginHome.jsp");
                        rd.forward(request,response);
                        break;
                    }
                case "Cliente":
                    {
                        session.setAttribute("lista", MagazzinoManager.getInstance().listaProdotti());
                        RequestDispatcher rd=request.getRequestDispatcher("ClienteLoginHome.jsp");
                        rd.forward(request,response);
                        break;
                    }
            }
         } catch (SQLException | ConnectionException | ClassNotFoundException |
                 InstantiationException | IllegalAccessException| MagazzinoException|
                 EmailException | PasswordException | NullAccountException ex) {
             Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
             out.print("<SCRIPT id=\"al\" TYPE=\"text/javascript\">\n" +
                          "alert(\""+ex.getLocalizedMessage()+"\");</SCRIPT>");
             RequestDispatcher rd=request.getRequestDispatcher("index.jsp");    
             rd.include(request,response);
         }
        
        out.close();    
    }    
}



