<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registra Insumo</title>
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
	<h1>Registra Insumo</h1>
		<p>&nbsp;</p>
		<img src="img/nom.png">
		<input type="text" name="nom_emp" placeholder="Nombre">
		<br>
		<img src="img/fecha.png">
		<input type="text" name="fechanac_emp" id="fechanac_emp" placeholder="Fecha de Ingreso">
		<br>
		<img src="img/fecha.png">
		<input type="text" name="fechaing_emp" id="fechaing_emp" placeholder="Fecha de Vencimiento">
		<br>
		<img src="img/rol.png">
		<input type="text" name="rol" placeholder="Cantidad">
		<br>
		<img src="img/rol.png">
		<input type="text" name="rol" placeholder="Descuento">
		<br>
		<img src="img/rol.png">
		<input type="text" name="rol" placeholder="Categoria">
		<hr>
		<input type="submit" value="Registrar" class="btn btn-primary">
		<p>&nbsp;</p>
		  <a href="FrmListaInsumos.jsp" class="btn btn-secondary">Regresar a la Lista de Insumos</a>
	</form>
</div>

</body>
</html>