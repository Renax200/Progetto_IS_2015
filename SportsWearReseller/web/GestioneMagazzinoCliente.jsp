<%@page import="Entità.Carrello"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Managers.MagazzinoManager"%>
<%@page import="Entità.Prodotto"%>
<%@page import="Entità.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<% Account a = (Account) session.getAttribute("account"); %>
<% ArrayList<Prodotto> lista = (ArrayList<Prodotto>) session.getAttribute("listaCat"); %>
<% String categoria = lista.get(0).getCategoria();
   session.setAttribute("categoria", categoria); 
%>
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
                             <form method="post" action="RicercaProdottoServletCategoria">
                                 <input type="text" name="ricerca" required="required">
                             <input type ="submit" value="Cerca">
                            </form>
                        </td>
                        <td>
                        <form action="VisualizzaCarrelloServlet">
                            <input type="image" alt="Carrello" id = "car" src="grafica/carrelloout.jpg" name="carrello" width="40" height="40"
                            onmouseover="cambioOver('car','carrello','over')" onmouseout="cambioOut('car','carrello','out')">
                        </form>
                         </td>
                         <td>
                             <%="<h3 class=\"login\">("+Carrello.getContenuto().size()+")</h3>"%>
                        </td>
                        <td>
                        <form action="VisualizzaAccountServlet">
                           <input type="image" alt="Account" id = "utn" src="grafica/utenteout.jpg" name="utente" width="40" height="40"
                                  onmouseover="cambioOver('utn','utente','over')" onmouseout="cambioOut('utn','utente','out')">    
                        </form>
                        </td>
                    <td>
                        <form action="VisualizzaOrdiniServlet">
			<input type="image" id = "ord" src="grafica/ordiniout.jpg" name="ordini" width="40" height="40"
				onmouseover="cambioOver('ord','ordini','over')" onmouseout="cambioOut('ord','ordini','out')">
                        </form>
		    </td>
                    <td>
                        <form action="VisualizzaVenditoreServlet">
			<input type="submit" value="FaQ">
                        </form>
                    </td>
                     <td>
                        <form method="post" action="LogoutServlet">
			<input type="image" id = "lout" src="grafica/logoutout.jpg" name="ordini" width="40" height="40"
				onmouseover="cambioOver('lout','logout','over')" onmouseout="cambioOut('lout','logout','out')">
                        </form>
		    </td>
                </tr>
            </table>
               
                </center>
	 </div>
         <div id="TestaTabella">
              <table   width="98%" cellspacing="3">
                 <tr>
                 <td width="10%" align="left"><h4 class="admin">idProdotto</h4></td> 
                 <td width="45%" align="center"><h4 class="admin2">Prodotto</h4></td> 
                 <td width="50%" align="center"><h4 class="admin2">Acquista/Aggiungi al Carrello</h4></td> 
                 </tr>
             </table>
         </div> 
         <div id="main">
                         <table border="2" width="105%" cellspacing="3">  
             <% for(Prodotto p : lista){ %>
                <tr hight="20%">
                    <table width="105%" border="2">
                        <tr>
                        <td width="10%" align="center"><%= p.getIdProdotto()%></td>
                            <td align="center" width="60%">
                                <table   width="90%">
                                    <tr><td width="10%"><h5>Categoria</h5></td><td width="40%"><h6><%=p.getCategoria()%></h6></td></tr>
                                    <tr><td width="10%"><h5>Nome Prodotto</h5></td><td width="40%"><h6><%=p.getNome()%></h6></td></tr>
                                    <tr><td width="10%"><h5>Disponibili</h5></td><td width="40%"><h6><%=p.getNumeroPezzi()%></h6></td></tr>
                                    <tr><td colspan="2"><h5><%=p.getDescrizione()%></h5></td></tr>
                                </table>
                            </td>
                            <td width="55%">
                                <table  width="100%">
                                    <form>
                                    <tr><td width="20%"><input type="checkbox" name="M"> M</td><td width="35%">x<input type="text" name="QntM"></td></tr>
                                    <tr><td width="20%"><input type="checkbox" name="L"> L</td><td width="35%">x<input type="text" name="QntL"></td></tr>
                                    <tr><td width="20%"><input type="checkbox" name="XL"> XL</td><td width="35%">x<input type="text" name="QntXL"></td></tr>
                                    <tr><td width="20%"><input type="checkbox" name="XXL"> XXL</td><td width="35%">x<input type="text" name="QntXXL"></td></tr>
                                    <tr colspan="2"><td><input type="submit" nome="add" value="Aggiungi al Carrello"></td>
                                    <td><input type="button" nome="add" value="Acquista"></td></tr>
                                    </form>
                                </table>
                            </td>
                        </tr>
                    </table>
                </tr>
                <% } %>
             </table>
         </div>
	 
	    
	<div id = "sidebar">
		<h4 class="admin">SELEZIONA CATEGORIA</h4>
		<table>
			<tr>
			<td>
                            <form method="post" action="VisualizzaCategoriaServletCompletini">
                                <input type="image" id="cmp" src="grafica/completiniout.jpg" name="categoria" value="Completini" width="60" height="60"
				onmouseover="cambioOver('cmp','completini','over')" onmouseout="cambioOut('cmp','completini','out')"
                                onclick="visualizza('int','completini')">
                            </form>
			</td>
			<td>
				<h4 class="admin">Completini</h4> 
			</td>
			</tr>
			<tr>
			<td>
                            <form method="post" action ="VisualizzaCategoriaServletTute">
			<input type="image" id = "tt" src="grafica/tuteout.jpg" name="tute" width="60" height="60"
                        onmouseover="cambioOver('tt','tute','over')" onmouseout="cambioOut('tt','tute','out')">
                            </form>
			</td>
			<td>
				<h4 class="admin">Tute</h4>
			</td>
			</tr>
			<tr>
			<td>
                            <form method="post" action="VisualizzaCategoriaServletPalloni">
			<input type="image"  id = "pln" src="grafica/palloniout.jpg" name="palloni" width="60" height="60"
			onmouseover="cambioOver('pln','palloni','over')" onmouseout="cambioOut('pln','palloni','out')">
                            </form>
                        </td>
			<td>
				<h4 class="admin">Palloni</h4 >
			</td>
			</tr>
			<tr>
			<td>
                            <form method="post" action="VisualizzaCategoriaServletScarpette">
			<input type="image" id = "scr" src="grafica/scarpetteout.jpg" name="scarpette" width="60" height="60"
			onmouseover="cambioOver('scr','scarpette','over')" onmouseout="cambioOut('scr','scarpette','out')">
                            </form>
                        </td>
			<td>
				<h4 class="admin">Scarpette</h4>
			</td>
			</tr>
			<tr>
			<td>
                         <form method="post" action="VisualizzaCategoriaServletStampe">
			<input type="image" id = "stm" src="grafica/stampeout.jpg" name="stampe" width="60" height="60"
                        onmouseover="cambioOver('stm','stampe','over')" onmouseout="cambioOut('stm','stampe','out')">
                         </form>
                        </td>
			<td>
				<h4 class="admin">Stampe</h4>
			</td>
			</tr>
		</table>
	</div>
	
	 
    </body>
	
	
</html>
