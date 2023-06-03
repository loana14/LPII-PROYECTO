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