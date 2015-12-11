<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html>
	<head>
                <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
		<title> SportsWear Reseller </title>
		<link rel="stylesheet" type="text/css" href="css/mioStile.css">

        </head>
	<body >
	
	<div id="header">
	<table align="center" class="login">
	<tr>
	<td>
	<img src="grafica/logo.jpg" width="180" height="120">
	</td>
	<td colspan=3>
            <form method="post" action="src/java/gestione_autenticazione/LoginServlet">
		
                    <p><H3 class="login">username <input type="text" name="user" required="required">
	
                                         password <input type="password" name="pass" required="required">
			
			<input type="submit" value="login">
		 </h3>
            </form>
	</td>
	</tr>
	</table>
	</div>	
	
	<div id="main">
			
		<font size=50 >Iscriviti </font>
			
				<form method="post" action="" >
					
				<p> Nome <input type="text" > Cognome <input type="text">
                                <p> Nome Societ&agrave;    <input type="text">
				<p> Indirizzo 
						via   <input type="text">
                                                Citt&agrave; <input type="text">
						CAP   <input type="text">
				<p> E-mail    <input type="text">
				<p> Nome Utente    <input type="text" name="user2">
				<p> Password  <input type="password" name="pass2">
				<p> Conferma Passward <input type="password">
				<p> <input type="submit" name="reg" value="Registrati">
				    <input type="submit" name="ann" value="Annulla">
				</form>
			
	</div>
	<div id="sidebar">
			<font color="midnightblue" size="40"> SportsWear Reseller </font>
			<br> 
                        &Egrave; un portale per la vendita di articoli sportivi che opera con diversa societ&agrave; sportive internazionali ed Europee.
			Registrati anche tu e visualizza i nostri prodotti<br>

	</div>
	<div id="footer">
	
	</div>

	
	</body>
</html>