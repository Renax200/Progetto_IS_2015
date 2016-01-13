<%-- 
    Document   : GestioneAccountCliente
    Created on : 31-dic-2015, 4.08.57
    Author     : carfo
--%>
<%@page import="Entità.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<% Account a = (Account) session.getAttribute("account"); %>
<html>
	<head>
		<title><%= a.getNome() %> benvenuto in SportsWearReseller  </title>
		<script type="text/javascript" src ="jscript/Cliente.js"></script>
		<link rel="stylesheet" type="text/css" href ="css/mioStile2.css">
	</head>
	<body>
            
            
            
	<div id = "header">
            <table cellspacing="5">
                <tr>
                    <td>  
                        <form action="VisualizzaHomeServlet">
                        <input type="image" src="grafica/logo.jpg" width="150" height="100" onclick="cambia('int','home')">
                        </form>
                    </td>
                    <td> <img id="int" src="grafica/utente.jpg" width="280" height="80"></td>
                    <td><img src="grafica/sfondo.jpg" width="600" height="100"></td>
                    <td>
                        <form action="VisualizzaCarrelloServlet">
                            <input type="image" id = "car" src="grafica/carrelloout.jpg" name="carrello" width="40" height="40"
                            onmouseover="cambioOver('car','carrello','over')" onmouseout="cambioOut('car','carrello','out')">
                        </form>
                    </td>
                    <td>
                        <form action="VisualizzaAccountServlet">
                           <input type="image" id = "utn" src="grafica/utenteover.jpg" name="utente" width="40" height="40">    
                        </form>
                    </td>
                    <td>
                        <form action="VisualizzaOrdiniServlet">
			<input type="image" id = "ord" src="grafica/ordiniout.jpg" name="ordini" width="40" height="40"
				onmouseover="cambioOver('ord','ordini','over')" onmouseout="cambioOut('ord','ordini','out')">
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
	<div id = "main">
         <table  cellspacing="10" class="admin3">
                 <tr>
                     <td colspan="3" align="right"><img align="left" src="grafica/avatar.jpg" width="120" height="120"></td>
                     <td rowSpan="5"><img src="grafica/logo2.jpg" width="420" height="320"> </td>
                 </tr>
                 <tr>
                     <td><h3>Nome<h3></td><td><h4><%=a.getNome()%></h3></td>
                 </tr>
                 <tr>
                     <td><h3>Cognome<h3></td><td><h4><%=a.getCognome()%></h3></td>
                 </tr>
                 <tr>
                     <td><h3>E-mail</h3></td><td><h4><%=a.getEmail()%></h4></td>
                 </tr>
                  <tr>
                      <td><h3>Password<h3></td><td><h4><%=a.getPassword()%></h4></td>
                 </tr>
                 <tr>
                     <td><h3>Nome Società<h3></td><td><h4><%=a.getSocieta()%><h4></td>
                 </tr>
                 <tr>
                     <td>
                         <form method="post" action="EliminaAccountServlet">
                             <input type="submit" value="Elimina Account">
                         </form>
                     </td>
                 </tr>
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