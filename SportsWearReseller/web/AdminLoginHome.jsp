<%@page import="Entità.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<% Account a = (Account) session.getAttribute("account"); %>

<html>
    <head>
        <title>SWR|Home| <%=a.getNome()%></title>
                <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/mioStile.css">
                <script language="javascript" type ="text/javascript" src="jscript/Admin.js"></script>
    </head>
	
	<body>
	
	 <div id="header">
             <table>
                      <tr>
                          <td rowspan="8">
                            <img src="grafica/logo.jpg" width="150" height="100" onclick="cambia('int','home')">
                         </td>
                         <td>
                             <img id="int" src="grafica/home.jpg" width="280" height="80">
                         </td>
                      </tr>
                  </table>
                </center>
	 </div>
	 <div id="main">
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
                <td >
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
                         <input type="image"  id = "bln" src="grafica/bilancioout.jpg"  width="60" height="60"
			onmouseover="cambioOver('bln','bilancio','over')" onmouseout="cambioOut('bln','bilancio','out')"
			onClick="cambia('int','bilancio')">
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
