<%@page import="Entità.Prodotto"%>
<%@page import="Entità.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<% Account a = (Account) session.getAttribute("account"); %>

<html>
    <head>
        <title>SWR|Magazzino| <%=a.getNome()%></title>
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
                             <form id="ricerca" action="">
                             <input type="text" name="ricerca" required="required" >
                             <input type ="submit" value="Cerca">
                            </form>
                        </td>
                        <td>
                        <form method="post" action="LogoutServlet">
			<input type="image" id = "lout" src="grafica/logoutout.jpg" name="ordini" width="60" height="60"
				onmouseover="cambioOver('lout','logout','over')" onmouseout="cambioOut('lout','logout','out')">
                        </form>
                        </td>
                        <td>
                         <form metod="post" action="InsertProdottoServlet">
                            <input type="submit" value="+ Aggiungi nuovo Prodotto">
                         </form>
                        </td>
                 </tr>
                      </tr>
                  </table>
                </center>
	 </div>
         <div id="TestaTabella">
             
             <h2 class="admin"> Form inserimento Prodotto </h2>
         </div> 
         <div id="main">
             <center>
                 <table>
                            <form method="post" action="InsertProdottoServlet"
                                  
                                  <tr><td> <h4 class="tab2">idProdotto</h4> </td><td><input type="text" name="idProdotto" required="required" ></td></tr>
                                  <tr><td> <h4 class="tab2">Nome </h4></td><td><input type="text" name="nome" required="required"></td></tr>
                                  <tr> <td><h4 class="tab2">Descrizione</h4> </td><td><TEXTAREA name="descrizione" rows="6" cols="24"></textarea></td></tr>    
                                  <tr><td> <h4 class="tab2">Quantità Pezzi</h4></td><td> <input type="text" name="numero_pezzi" required="required"><td></tr>
                                  <tr><td> <h4 class="tab2">Prezzo (singola unità)</h4></td><td><input type="text" name="prezzo" required="required"><td></tr>
                                  <tr><td> <h4 class="tab2">Categoria</h4> </td><td> <select size="1" name="categoria">
                                                 <option>Completini</option><
                                                 <option>Tute</option>
                                                 <option>Palloni</option>
                                                 <option>Stampe</option>
                                                 <option>Scarpette</option>  
                                                 </select></td></tr> 
                                                <tr><td><td><input type="submit" value="Aggiungi">  <input type="reset" value="Annulla"></td></tr>
				</form>
                 </table>
            </center>
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
