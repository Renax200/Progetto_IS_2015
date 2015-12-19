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
            <center> 
                <table> 
                    <tr>
                        <td>
                            <img src="grafica/intestazione.jpg" width="400" height="120">
                        </td>
                        <td>
                            <img  id = "car" src="grafica/carrelloout.jpg" name="carrello" width="80" height="80"
                                        onmouseover="cambioOver('car','carrello','over')" onmouseout="cambioOut('car','carrello','out')">

                        </td>    
                </table>
            </center>
        </div>
	<div id = "main">
	</div>
	<div id = "sidebar">
	<br><br><br><br><br><br><br><br>
		<h2>Selezione la categoria di prodotti </h2>
		<table>
			<tr>
			<td>
			<img  id = "cmp" src="grafica/completiniout.jpg" name="completini" width="120" height="120"
							onmouseover="cambioOver('cmp','completini','over')" onmouseout="cambioOut('cmp','completini','out')">
			</td>
			<td>
				<h2>Completini</h2> 
			</td>
			</tr>
			<tr>
			<td>
			<img  id = "tt" src="grafica/tuteout.jpg" name="tute" width="120" height="120"
							onmouseover="cambioOver('tt','tute','over')" onmouseout="cambioOut('tt','tute','out')">
			</td>
			<td>
				<h2>Tute</h2>
			</td>
			</tr>
			<tr>
			<td>
			<img  id = "pln" src="grafica/palloniout.jpg" name="palloni" width="120" height="120"
							onmouseover="cambioOver('pln','palloni','over')" onmouseout="cambioOut('pln','palloni','out')">
			</td>
			<td>
				<h2>Palloni</h2>
			</td>
			</tr>
			<tr>
			<td>
			<img  id = "scr" src="grafica/scarpetteout.jpg" name="scarpette" width="120" height="120"
							onmouseover="cambioOver('scr','scarpette','over')" onmouseout="cambioOut('scr','scarpette','out')">
			</td>
			<td>
				<h2>Scarpette</h2>
			</td>
			</tr>
			<tr>
			<td>
			<img  id = "stm" src="grafica/stampeout.jpg" name="stampe" width="120" height="120"
							onmouseover="cambioOver('stm','stampe','over')" onmouseout="cambioOut('stm','stampe','out')">
			</td>
			<td>
				<h2>Stampe</h2>
			</td>
			</tr>
		</table>
	</div>
	<div id = "footer">
	
		Contatti
		
	</div>
	
	</body>
</html>