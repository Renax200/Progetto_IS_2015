<%@page import="Entità.Carrello"%>
<%@page import="Entità.Prodotto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entità.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<% Account a = (Account) session.getAttribute("account"); %>

<html>
    <head>
        <title>SWR|Account|<%=a.getNome()%></title>
                <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/mioStile.css">
                <script language="javascript" type ="text/javascript" src="jscript/Admin.js"></script>
    </head>
    
    
	<body>
	
	 <div id="header">
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
                
            </div>   
	 <div id="mainAccount">
             
             <table  collspacing="5" class="admin3">
                 <tr>
                 <td rowspan="6" cellspacing="5" width="40%">
                     <table>
                     <form >
                         <tr><td><h3 class="tab2">Insersci la tua email</h3></td></tr>
                         <tr><td><input type="text" nome="email"></td></tr>
                         <tr><td><h3 class="tab2">Oggetto</h3></td></tr>
                         <tr><td><input type="text" nome="oggetto"></td></tr>
                         <tr><td><h3 class="tab2">Messaggio</h3></td></tr>
                         <tr colspan="3"><td><textarea name="messaggio" cols="30" rows="6"></textarea></td></tr>
                         <tr><td><input type="submit" value="Invia Messaggio"> <input type="reset" value="Annulla"></td></tr>
                     </form>
                     </table>
                 </td>
                     <td colspan="3" align="right"><img align="left" src="grafica/avatar.jpg" width="120" height="120"></td>
                     <td rowSpan="5"><img src="grafica/logo2.jpg" width="320" height="220"> </td>
                 </tr>
                 <tr>
                     <td><h3 class="tab2">Nome</h3></td><td><h4 class="tab2"><%=a.getNome()%></h4></td>
                 </tr>
                 <tr>
                     <td><h3 class="tab2">Cognome</h3></td><td><h4 class="tab2"><%=a.getCognome()%></h4></td>
                 </tr>
                 <tr>
                     <td><h3 class="tab2">E-mail</h3></td><td><h4 class="tab2"><%=a.getEmail()%></h4></td>
                 </tr>
                  <tr>
                      <td><h3 class="tab2">Password</h3></td><td><h4 class="tab2"><%=a.getPassword()%></h4></td>
                 </tr>
                 <tr>
                     <td><h3 class="tab2">Nome Società</h3></td><td><h4 class="tab2"><%=a.getSocieta()%></h4></td>
                 </tr>
                 <td>
                 </td>
             </table>
             
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
