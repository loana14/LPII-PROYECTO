<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="estilo.css">
</head>
<body>
<div align="center" id="login">
	<form id="form1" action="ControladorUsuario" method="post">
	<h1>Iniciar Sesion</h1>
		<p>&nbsp;</p>
		<img src="img/usuario.png">
		<input type="text" name="nom_usu" placeholder="Username">
		<br>
		<img src="img/password.png">
		<input type="password" name="pas_usu" placeholder="Password">
		<hr>
		<input type="submit" value="Ingresar" class="btn btn-primary">
	</form>
</div>
<div align="center" id="create">
	<form id="form2">
		<p>No tienes usuario?<a href="FrmCrearUsuario.jsp" class="btn btn-secondary">Crear Usuario</a></p>
	</form>
</div>
<%
String msj=(String)request.getAttribute("msj");
String msjindex="";
if(msj!=null) msjindex=msj;
%>
<div align="center">
<%=msjindex%>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
</body>
</html>