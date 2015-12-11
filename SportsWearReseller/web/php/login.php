<html>
	<head></head>
	<body>
<?php
	function verificaAdmin($str1,$str2){
		
		if($str1=="admin" && $str2=="admin" )
           return true;
		else 
			return false;
	}
	
	function verificaCliente($str1,$str2){
		
		if($str1=="cliente" && $str2=="cliente" )
           return true;
		else 
			return false;
	}

	
    $user = $_GET['user'];
    $pass = $_GET['pass'];
    
   if(isset($user) && isset($pass) && verificaAdmin($user,$pass))
	{
		header("location:http://localhost/~carfo/progettois/AdminLoginHome.html");
    
	}
	else if(isset($user) && isset($pass) && verificaCliente($user,$pass))
	 {
		header("location:http://localhost/~carfo/progettois/ClienteLoginHome.html");
		
		}
	else{
		
	}
?>
</body>
</html>
 