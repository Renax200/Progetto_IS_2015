/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.GestioneMagazzino;

import exception.MagazzinoException;
import exception.NameException;
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
 * @author carfo
 */
public class InsertProdottoServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)    
            throws ServletException, IOException {    
  
        response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
          
        String idProdotto=request.getParameter("idProdotto");    
        String nome=request.getParameter("nome"); 
        String descrizione=request.getParameter("descrizione");
        String numero_Pezzi=request.getParameter("numero_pezzi");
        String prezzo=request.getParameter("prezzo");
        String categoria=request.getParameter("categoria");
      
       try{
                int idP = Integer.parseInt(idProdotto);
                int numPz = Integer.parseInt(numero_Pezzi);
                float prz = Float.parseFloat(prezzo);
                MagazzinoManager.getInstance().inserisciProdotto(idP,nome,descrizione,numPz,prz,categoria);
                HttpSession session = request.getSession(true);   
                session.setAttribute("account", session.getAttribute("account"));  
                session.setAttribute("lista", MagazzinoManager.getInstance().listaProdotti());
                RequestDispatcher rd=request.getRequestDispatcher("InsertProdottoServlet.jsp");    
                rd.forward(request,response); 
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException |
                    MagazzinoException | NameException ex) {
            Logger.getLogger(InsertProdottoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            
        
    }    

}
