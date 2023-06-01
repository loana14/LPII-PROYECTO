<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Empleado</title>
</head>
<body>
<h1>Listado de Empleado</h1>
<table>
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
<c:forEach var="Empleado" items="${ListaEmpleado}">
<td><c:out value=""></c:out></td>
</c:forEach>
</table>
</body>
</html>