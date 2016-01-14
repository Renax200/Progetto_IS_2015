<%@page import="Entità.Carrello"%>
<%@page import="Entità.Prodotto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entità.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<% Account a = (Account) session.getAttribute("account"); %>
<% ArrayList<Prodotto> lista = (ArrayList<Prodotto>) session.getAttribute("lista");%>
<html>
	<head>
		<title>SWR |Home| <%= a.getNome()%></title>
		<script type="text/javascript" src ="jscript/Cliente.js"></script>
		<link rel="stylesheet" type="text/css" href ="css/mioStile.css">
	</head>
	<body>
          
	<div id = "header">
              <table>
                <tr>
                    <td>  
                        <form action="VisualizzaHomeServlet">
                        <input type="image" alt ="Home" src="grafica/logo.jpg" width="150" height="100" onclick="cambia('int','home')">
                        </form>
                    </td>
                    <td> <img id="int" src="grafica/home.jpg" width="280" height="80"></td>
                    <td>
                        <h4 class="admin">Ricerca Prodotto</h4>
                        </td>
                        <td>
                             <form method="post" action="RicercaProdottoServlet">
                                 <input type="search" name="ricerca" required="required">
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
                        <%="<h3 class=\"login\">("+Carrello.getNumProdotti()+")</h3>"%>
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
                            
        </div>
            <div id ="TestaTabella">
                <table   width="98%" cellspacing="3">
                    
                 <tr>
                 <td width="10%" align="left"><h4 class="admin">idProdotto</h4></td> 
                 <td width="45%" align="center"><h4 class="admin2">Prodotto</h4></td> 
                 <td width="50%" align="center"><h4 class="admin2">Acquista</h4></td> 
                 </tr>
             </table>
            </div>
	<div id = "main">
             <table border="2" width="105%" cellspacing="3">
             <% for(Prodotto p : lista){ %>
              
                <tr hight="20%">
                    <table width="105%" border="2">
                        <tr>
                        <td width="10%" align="center"><%= p.getIdProdotto()%></td>
                            <td align="center" width="60%">
                                <table width="90%">
                                    <tr><td width="10%"><h5>Categoria</h5></td><td width="40%"><h6><%=p.getCategoria()%></h6></td></tr>
                                    <tr><td width="10%"><h5>Nome Prodotto</h5></td><td width="40%"><h6><%=p.getNome()%></h6></td></tr>
                                    <tr><td width="10%"><h5>Disponibili</h5></td><td width="40%"><h6><%=p.getNumeroPezzi()%></h6></td></tr>
                                    <tr><td colspan="2"><h5><%=p.getDescrizione()%></h5></td></tr>
                                </table>
                            </td>
                            <td width="55%">
                                <table  width="100%">
                                   
                                    <tr><td width="20%"><input type="checkbox"> M</td><td width="35%">x<input type="text" ></td></tr>
                                    <tr><td width="20%"><input type="checkbox"> L</td><td width="35%">x<input type="text" ></td></tr>
                                    <tr><td width="20%"><input type="checkbox"> XL</td><td width="35%">x<input type="text" ></td></tr>
                                    <tr><td width="20%"><input type="checkbox"> XXL</td><td width="35%">x<input type="text" ></td></tr>
                                    <form method="post" action="InserimentoCarrelloServlet">
                                        <tr colspan="2"><td><input type="submit" name="aggiungi" value="Aggiungi al carrello"></td>
                                    <td><input type="submit"  value="Acquista"></td></tr>
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