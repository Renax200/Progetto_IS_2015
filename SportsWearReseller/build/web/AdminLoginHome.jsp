<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Benvenuto <%=session.getAttribute("user")%></title>
                <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="C:/Users/carfo/Esercizi Html/ProgettoIS/web/css">
                <script language="javascript" type ="text/javascript" src="C:/Users/carfo/Esercizi Html/ProgettoIS/web/jscript/Admin.js"></script>
    </head>
	
	<body>
	
	 <div id="header">
			<center><img src="grafica/intestazione.jpg" width="400" height="120"><center>
	 </div>
	 <div id="main">
			<table class="admin">
				<tr>		
					<td>
						<img  id = "utn" src="grafica/utenteout.jpg" name="utente" width="120" height="120"
							onmouseover="cambioOver('utn','utente','over')" onmouseout="cambioOut('utn','utente','out')"
							onClick="vai('Utente')">
						<b> <h3 class="admin">UTENTE</h3></b>
					</td>
					<td >
						<img  id = "cli" src="grafica/clienteout.jpg" name ="clienti" width="120" height="120"
							onmouseover="cambioOver('cli','cliente','over')" onmouseout="cambioOut('cli','cliente','out')"
							onClick="vai('Clienti')">
						<b><h3 class="admin">CLIENTI</h3></b>
					</td>
				</tr>
				<tr>
					<td >
						<img  id = "mgz" src="grafica/magazzinoout.jpg" width="120" height="120"
							onmouseover="cambioOver('mgz','magazzino','over')" onmouseout="cambioOut('mgz','magazzino','out')"
							onClick="vai('Magazzino')">
						<b><h3 class="admin">MAGAZZINO</h3></b>
					</td>
					<td >
						<img  id = "bln" src="grafica/bilancioout.jpg"  width="120" height="120"
							onmouseover="cambioOver('bln','bilancio','over')" onmouseout="cambioOut('bln','bilancio','out')"
							onClick="vai('Bilancio')">
						<b><h3 class="admin">BILANCIO</h3></b>
					</td>
				</tr>
			<table>
	 </div>
	 <div id="sidebar">
	 
	 </div>
	 
	 <div id="footer">
	 </div>
	 
	 
    </body>
	
	
</html>
