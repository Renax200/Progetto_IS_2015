/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.GestioneMagazzino;

import Entità.Account;
import Managers.AccountManager;
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
        
        int idP = Integer.parseInt(idProdotto);
        int numPz = Integer.parseInt(numero_Pezzi);
        float prz = Float.parseFloat(prezzo);
        
            int r = MagazzinoManager.inserisciProdotto(idP,nome,descrizione,numPz,prz,categoria);
            if(r==1){
                 HttpSession session = request.getSession(true);  
                    if(session!=null)  
                    session.setAttribute("account", session.getAttribute("account"));  
                    session.setAttribute("lista", MagazzinoManager.listaProdotti());
                    RequestDispatcher rd=request.getRequestDispatcher("GestioneMagazzinoVenditore.jsp");    
                      rd.forward(request,response); 
            }
            else{
                out.print("<SCRIPT TYPE=\"text/javascript\">\n" +
                          "alert(\"Errore Inserimento!\\I parametri inseriti sono errati\");\n" +
                          "</SCRIPT>");    
                RequestDispatcher rd=request.getRequestDispatcher("InserimentoProdotto.jsp");    
                rd.include(request,response);  
            }
            
        
    }    

}
