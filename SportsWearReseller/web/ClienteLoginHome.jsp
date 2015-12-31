<%@page import="Entità.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<% Account a = (Account) session.getAttribute("account"); %>
<html>
	<head>
		<title>SWR |Home| <%= a.getNome()%></title>
		<script type="text/javascript" src ="jscript/Cliente.js"></script>
		<link rel="stylesheet" type="text/css" href ="css/mioStile2.css">
	</head>
	<body>
          
	<div id = "header">
            <table>
                <tr>
                    <td>  <input type="image" src="grafica/logo.jpg" width="150" height="100" onclick="cambia('int','home')"></td>
                    <td colspan="6"> <img id="int" src="grafica/home.jpg" width="280" height="80"></td>
                    <td><img src="grafica/sfondo.jpg" width="700" height="100"></td>
                    <td colspan="2"><img  id = "car" src="grafica/carrelloout.jpg" name="carrello" width="80" height="80"
                        onmouseover="cambioOver('car','carrello','over')" onmouseout="cambioOut('car','carrello','out')">
                    </td>
                    <td>
                        <form action="VisualizzaAccountServlet">
                     <input type="image" id = "utn" src="grafica/utenteout.jpg" name="utente" width="60" height="60"
                        onmouseover="cambioOver('utn','utente','over')" onmouseout="cambioOut('utn','utente','out')"
                        >    
                        </form>
                    </td>
                </tr>
            </table>
                            
                        
                            

        </div>
	<div id = "main">
              v<br>
             f
             c
             f
             c
             we
             c<br>
             we
             c
             we
             c
             e<br>
               c<br>  c<br>  c<br>  c<br>  c<br>  c<br>  c<br>>
               c<br>
             v<br>
             fe<br>
               c<br>  c<br>  c<br>  c<br>  c<br>  c<br>  c<br>>
               c<br>
             v<br>
             ce<br>
               c<br>  c<br>  c<br>  c<br>  c<br>  c<br>  c<br>>
               c<br>
             v<br>
             f
             ce<br>
               c<br>  c<br>  c<br>  c<br>  c<br>  c<br>  c<br>>
               c<br>
             v<br>
             we
             c<br>
             we
             c
             we
             c
             e<br>
	</div>
            
            
            
	<div id = "sidebar">
		<h4 class="admin">SELEZIONA CATEGORIA</h4>
		<table>
			<tr>
			<td>
			<input type="image" id = "cmp" src="grafica/completiniout.jpg" name="completini" width="80" height="80"
				onmouseover="cambioOver('cmp','completini','over')" onmouseout="cambioOut('cmp','completini','out')"
                                onclick="visualizza('int','completini')">
			</td>
			<td>
				<h4 class="admin">Completini</h4> 
			</td>
			</tr>
			<tr>
			<td>
			<img  id = "tt" src="grafica/tuteout.jpg" name="tute" width="80" height="80"
							onmouseover="cambioOver('tt','tute','over')" onmouseout="cambioOut('tt','tute','out')">
			</td>
			<td>
				<h4 class="admin">Tute</h4>
			</td>
			</tr>
			<tr>
			<td>
			<img  id = "pln" src="grafica/palloniout.jpg" name="palloni" width="80" height="80"
							onmouseover="cambioOver('pln','palloni','over')" onmouseout="cambioOut('pln','palloni','out')">
			</td>
			<td>
				<h4 class="admin">Palloni</h4 >
			</td>
			</tr>
			<tr>
			<td>
			<img  id = "scr" src="grafica/scarpetteout.jpg" name="scarpette" width="80" height="80"
							onmouseover="cambioOver('scr','scarpette','over')" onmouseout="cambioOut('scr','scarpette','out')">
			</td>
			<td>
				<h4 class="admin">Scarpette</h4>
			</td>
			</tr>
			<tr>
			<td>
			<img  id = "stm" src="grafica/stampeout.jpg" name="stampe" width="80" height="80"
							onmouseover="cambioOver('stm','stampe','over')" onmouseout="cambioOut('stm','stampe','out')">
			</td>
			<td>
				<h4 class="admin">Stampe</h4>
			</td>
			</tr>
		</table>
	</div>
	
	
	</body>
</html>