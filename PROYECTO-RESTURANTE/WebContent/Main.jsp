<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="estilo.css">
</head>
<body >
<div id="main">
	<form >
		<h1>Menu Principal</h1>
		<p>&nbsp;</p>
		<a href="FrmListaEmpleado.jsp" class="btn btn-primary" style="width: 70%">Lista de Empleados</a>
		<br>
		<br>
		<a href="FrmListaInsumos.jsp" class="btn btn-primary" style="width: 70%">Lista de Insumos</a>
		<br>
		<br>
		<a href="FrmListaMesas.jsp" class="btn btn-primary" style="width: 70%">Lista de Mesas</a>
	</form>
</div>
<div id="buttons">
	<a href="Index.jsp" class="btn btn-danger">Cerrar sesion</a>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
</body>
</html>