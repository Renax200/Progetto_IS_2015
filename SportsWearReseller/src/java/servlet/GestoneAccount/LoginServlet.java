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
import java.sql.SQLException;
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
        
        AccountManager accountManager = new AccountManager();
        Account account = accountManager.logIn(n, p);
          
        HttpSession session = request.getSession(true);  
        if(session!=null)  
        session.setAttribute("account", account);  
  
        if(account.getTipo().equals("Venditore")){    
            RequestDispatcher rd=request.getRequestDispatcher("AdminLoginHome.jsp");    
            rd.forward(request,response);    
        }    
        else if(account.getTipo().equals("Cliente")){    
            RequestDispatcher rd=request.getRequestDispatcher("ClienteLoginHome.jsp");    
            rd.forward(request,response); 
        }
        else{    
            out.print("<p style=\"color:green\">Sorry username or password error</p>");    
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");    
            rd.include(request,response);    
        }    
  
        out.close();    
    }    
}



