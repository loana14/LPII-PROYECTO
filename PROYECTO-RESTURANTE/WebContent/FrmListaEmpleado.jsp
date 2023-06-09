<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Empleado</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="estilos.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
</head>
<body>
<h1>Listado de Empleado</h1>
<td colspan="5" align="left">
  <div style="margin-top: 20px;">
  <a href="FrmRegistrarEmpleado.jsp" class="btn btn-primary">Registrar Empleado</a>
  <span style="margin-left: 100px;"></span>
  <a href="Main.jsp" class="btn btn-secondary">MENU PRINCIPAL</a>
</td>
<table align="center">
<tr>
<th>Id<th>
<th>Nombre<th>
<th>Apellido<th>
<th>Dni<th>
<th>Edad<th>
<th>Fecha de Nacimiento<th>
<th>Fecha de Ingreso<th>
<th>Rol<th>
</tr>
<c:forEach var="empleado" items="${ListaEmpleado}">
<tr>
<td><c:out value="${empleado.id_emp}"></c:out></td>
<td><c:out value="${empleado.nom_emp}"></c:out></td>
<td><c:out value="${empleado.ape_emp}"></c:out></td>
<td><c:out value="${empleado.dni}"></c:out></td>
<td><c:out value="${empleado.edad}"></c:out></td>
<td><fmt:formatDate value ="${empleado.fechanac_emp}" pattern="dd-MM-yyyy"/></td>
<td><fmt:formatDate value ="${empleado.fechaing_emp}" pattern="dd-MM-yyyy"/></td>
<td><c:out value="${empleado.rol}"></c:out></td>
<tr>
</c:forEach>
</table>

	
	
</body>
</html>