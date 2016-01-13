<%-- 
    Document   : GestioneBilancioVenditore
    Created on : 31-dic-2015, 14.49.59
    Author     : carfo
--%>
<%@page import="Entità.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<% Account a = (Account) session.getAttribute("account"); %>

<html>
    <head>
        <title>SWR|Bilancio| <%=a.getNome()%></title>
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
                            <input type="image" src="grafica/logo.jpg" width="150" height="100">
                              </form>
                         </td>
                         <td>
                             <img id="int" src="grafica/bilancio.jpg" width="280" height="80">
                         </td>
                         <td width="65%">
                        <form method="post" action="LogoutServlet">
                            <input align="right" type="image" id = "lout" src="grafica/logoutout.jpg" name="ordini" width="60" height="60"
				onmouseover="cambioOver('lout','logout','over')" onmouseout="cambioOut('lout','logout','out')">
                        </form>
                      </tr>
                  </table>
	 </div>
            <div id="TestaTabella">
                
            </div>
	 <div id="main">
             <h3><%= a.getNome()%></h3>
	 <div id="sidebar">
             <table> 
                 <tr>
                        <td colspan="2"><h4 class="admin">Benvenuto <%=a.getNome()%></h4></td>
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
                        <input type="image" id = "mgz" src="grafica/magazzinoout.jpg" width="60" height="60"
                        onmouseover="cambioOver('mgz','magazzino','over')" onmouseout="cambioOut('mgz','magazzino','out')">
                     </form>
                </td>
                <td><h4 class="admin">MAGAZZINO</h4></td>
                </tr>
                <tr>
                   <td >
                       <form action="VisualizzaBilancioServlet">
                         <input type="image"  id = "bln" src="grafica/bilancioover.jpg"  width="60" height="60">
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
