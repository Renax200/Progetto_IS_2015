/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione_autenticazione;
import Entità.Utente;
import dbMomentaneo.DB;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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
public class LoginServlet extends HttpServlet{
    
     private static final long serialVersionUID = 1L;
   
    public void init() throws ServletException{}
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException,IOException{
        
        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>FirstServlet Demo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<center>");
        out.println("<h2>Hello World!</h2>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
        out.close();
        
        
  
        
        /*
        HttpSession session = request.getSession(false);  
        if(session!=null)  
        session.setAttribute("user", username);  
        
            if(username.equals("admin") && password.equals("admin")){
                response.setContentType("text/html");
                response.sendRedirect("C:/Users/carfo/Esercizi Html/ProgettoIS/web/AdminLoginHome.jsp");
               
            }
            else  if(password.equals("cliente") && username.equals("cliente")){
                
                
            }
            else{
                
            }
          */
}
    public void destroy(){}
}