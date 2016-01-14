<%@page import="java.util.ArrayList"%>
<%@page import="Managers.MagazzinoManager"%>
<%@page import="Entità.Prodotto"%>
<%@page import="Entità.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<% Account a = (Account) session.getAttribute("account"); %>
<% ArrayList<Prodotto> lista = (ArrayList<Prodotto>) session.getAttribute("lista"); %>
<html>
    <head>
        <title>SWR|Magazzino| <%=a.getNome()%></title
                <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/mioStile.css">
                <script language="javascript" type ="text/javascript" src="jscript/Admin.js"></script>
    </head>
	
	<body>
	
	 <div id="header">
             <table>
                      <tr>
                          <td rowspan="8">
                          <form action="VisualizzaHomeServlet">
                            <input type="image" src="grafica/logo.jpg" width="150" height="100" >
                              </form>
                         </td>
                         <td>
                             <img id="int" src="grafica/magazzino.jpg" width="280" height="80">
                         </td>
                        <td>
                            
                             <h4 class="admin">Ricerca Prodotto</h4>
                        </td>
                        <td>
                             <form method="post" action="RicercaProdottoServlet">
                             <input type="text" name="ricerca" required="required" >
                             <input type ="submit" value="Cerca">
                            </form>
                        </td>
                        <td width="30%">
                         <form metod="get" action="VisualizzaInserimento">
                            <input type="submit" value="+ Aggiungi nuovo Prodotto">
                         </form>
                        </td>
                        <td >
                        <form method="post" action="LogoutServlet">
			<input type="image" id = "lout" src="grafica/logoutout.jpg" name="ordini" width="60" height="60"
				onmouseover="cambioOver('lout','logout','over')" onmouseout="cambioOut('lout','logout','out')">
                        </form>
                        </td>
                 </tr>
                      </tr>
                  </table>
                </center>
	 </div>
         <div id="TestaTabella">
             
             <table   width="84%" cellspacing="3">
                 <tr>
                 <td width="10%"><h4 class="admin2">Numero</h4></td> 
                 <td width="20%"><h4 class="admin2">Nome Prodotto</h4></td> 
                 <td width="40%"><h4 class="admin2">Descrizione</h4></td> 
                 <td width="10%"><h4 class="admin2">Prezzo</h4></td>
                 <td width="10%"><h4 class="admin2">Categoria</h4></td>
                 <td width="10%"><h4 class="admin2">Quantità Disponibili</h4></td>
                 </tr>
             </table>
         </div> 
         <div id="main">
             
            <table   width="105%" cellspacing="3">
             <% for(Prodotto p : lista){ %>
             <tr>
                 <td width="10%"><h4 class="tab"><%=p.getIdProdotto() %></h4></td> 
                 <td width="20%"><h4 class="tab"><%=p.getNome()%></h4></td> 
                 <td width="40%"><h4 class="tab"><BLOCKQUOTE><%=p.getDescrizione()%></BLOCKQUOTE></h4></td> 
                 <td width="10%"><h4 class="tab"><%=p.getPrezzo()%></h4></td>
                 <td width="10%"><h4 class="tab"><%=p.getCategoria()%></h4></td>
                 <td width="10%"><h4 class="tab"><%=p.getNumeroPezzi()%></h4></td>  
             </tr>
                <% } %>
            </table>
         </div>
	 
	 <div id="sidebar">
             <table> 
                 <tr>
                        <td colspan="2"><h4 class="admin"> Benvenuto <%=a.getNome()%></h4></td>
                 </tr>
                 <tr>
                    <td>
                        <form action="VisualizzaAccountServlet">
                        <input type="image" id ="utn" src="grafica/utenteout.jpg" name="utente" width="60" height="60"
                         onmouseover="cambioOver('utn','utente','over')" onmouseout="cambioOut('utn','utente','out')">
                        </form>
                    </td>
                    <td><h4 class="admin">ACCOUNT</h4></td>
                </tr>
                <tr>
                     <td>
                        <form action="VisualizzaClientiServlet">
                        <input type="image"  id = "cli" src="grafica/clienteout.jpg" name ="clienti" width="60" height="60"
                            onmouseover="cambioOver('cli','cliente','over')" onmouseout="cambioOut('cli','cliente','out')">
                        </form>
                     </td>
                <td><h4 class="admin">CLIENTI</h4></td>
                </tr>
                <tr>
		<td>
                    <form action="VisualizzaMagazzinoServlet">
                        <input type="image" id = "mgz" src="grafica/magazzinoover.jpg" width="60" height="60">
                     </form>
                </td>
                <td><h4 class="admin">MAGAZZINO</h4></td>
                </tr>
                <tr>
                   <td >
                       <form action="VisualizzaBilancioServlet">
                         <input type="image"  id = "bln" src="grafica/bilancioout.jpg"  width="60" height="60"
			onmouseover="cambioOver('bln','bilancio','over')" onmouseout="cambioOut('bln','bilancio','out')"
			onClick="cambia('int','bilancio')">
                       </form>
                   </td>
                   <td>
                        <b><h4 class="admin">BILANCIO</h4></b></td>
                    </tr>
                    <tr>
                        <td>
                            <form action="VisualizzaOrdiniServlet">
			<input type="image" id = "ord" src="grafica/ordiniout.jpg" name="ordini" width="60" height="60"
				onmouseover="cambioOver('ord','ordini','over')" onmouseout="cambioOut('ord','ordini','out')"
                               >
                            </form>
			</td>
                        <td>
				<h4 class="admin">ORDINI</h4>
			</td>
		    </tr>
             </table>
	 </div>
	 
    </body>
	
	
</html>
