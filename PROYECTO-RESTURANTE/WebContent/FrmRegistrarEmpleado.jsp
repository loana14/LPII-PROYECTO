<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registra Empleado</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="estilos.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
  <script>
  $( function() {
    $( "#fechanac_emp" ).datepicker({
    	dateFormat:'dd/mm/yy'
    });
  } );
  $( function() {
	    $( "#fechaing_emp" ).datepicker({
	    	dateFormat:'dd/mm/yy'
	    });
	  } );
  </script>
</head>
<body>
<div align="center" id="insertemp">
	<form id="form1" action="ControladorEmpleado" method="post">
	<h1>Registra Empleado</h1>
		<p>&nbsp;</p>
		<img src="img/nom.png">
		<input type="text" name="nom_emp" placeholder="Nombre">
		<br>
		<img src="img/ape.png">
		<input type="text" name="ape_emp" placeholder="Apellido">
		<br>
		<img src="img/dni.png">
		<input type="text" name="dni" placeholder="Dni">
		<br>
		<img src="img/edad.png">
		<input type="text" name="edad" placeholder="Edad">
		<br>
		<img src="img/fecha.png">
		<input type="text" name="fechanac_emp" id="fechanac_emp" placeholder="Fecha de nacimiento">
		<br>
		<img src="img/fecha.png">
		<input type="text" name="fechaing_emp" id="fechaing_emp" placeholder="Fecha de ingreso">
		<br>
		<img src="img/rol.png">
		<input type="text" name="rol" placeholder="Rol">
		<hr>
		<input type="submit" value="Registrar" class="btn btn-primary">
		<p>&nbsp;</p>
		<input type="submit" class="btn btn-secondary" value="Crear empleado">
	</form>
</div>

</body>
</html>