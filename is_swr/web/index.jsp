<%-- 
    Document   : index
    Created on : 11-gen-2016, 15.08.39
    Author     : carfo
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
	<head>
		<title> SportsWear Reseller </title>
		<link rel="stylesheet" type="text/css" href="css/mioStile3.css">
        </head>
	<body> 
	<div id="header">
	<table align="center" class="login">
	<tr>
	<td>
	<img src="grafica/logo.jpg" width="180" height="120">
	</td>
	<td colspan=3>
          <% try{ %>  
            <form method="post" action="LoginServlet">
		
                    <p><H3 class="login">E-mail <input type="text" name="email" required="required" />
	
                                         Password <input type="password" name="pass" required = "required" />
			
			<input type="submit" value="login" />
		 </h3>
            </form>
            <% } catch(Exception e){ %>
            <script>
                alert(<%=e.getMessage() %>);
                </script>
             <% } %>
	</td>
	</tr>
	</table>
	</div>		
	<div id="main">	
		<font size=50 >Iscriviti </font>
			<%try { %>
				<form method="post" action="CreateAccountServlet" >
				<p> Nome <input type="text" name="nome" required="required" > Cognome <input type="text" name="cognome" required="required">
                                <p> Nome Societ&agrave;    <input type="text" name="nome_società" required="required">
                                <p> Indirizzo Societ&agrave;    <input type="text" name="indirizzo" required="required">
                                <p> Partita Iva <input type="text" name="partita_iva" required="required">
				<p> E-mail    <input type="text" name="email2" required="required">
				<p> Password  <input type="password" name="pass2">
				<p> Conferma Passward <input type="password" name="pass3" required="required">
				<p> <input type="submit" value="Registrati">   
                                    <input type="reset" value="Annulla"> 
				</form>
			  <% } catch(Exception e){ %>
            <script>
                alert(<%=e.getMessage() %>);
                </script>
             <% } %>
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