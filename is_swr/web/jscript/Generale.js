
function home(){
		location.href="AdminLoginHome.jsp";
}

function cambioOver(id,nome,stato){
		document.getElementById(id).src="grafica/"+nome+stato+".jpg";
}
	  
function cambioOut(id,nome,stato){
		document.getElementById(id).src="grafica/"+nome+stato+".jpg";
				}
function focus (id, nome, stato){
    document.getElementById(id).style.backgroud="grafica/"+nome+stato+".jpg";
}