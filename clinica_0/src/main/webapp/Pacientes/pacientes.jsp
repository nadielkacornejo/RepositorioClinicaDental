<%-- 
    Document   : pacientes
    Created on : 23 oct. 2023, 10:44:24
    Author     : tempuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> <!--importamos libreria para implementar for each-->

<!DOCTYPE html>
<html>
    <head>
        <%@include file="../header-menu.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clínica</title>
    </head>
    <body>
        <section class ="pacientes">
            <h1>Pacientes</h1>
            <!-- como si estuvieramos enviando el atributo por get-->
            <a href="ControllerPacientes?action=nuevo">Nuevo Paciente</a>

            <form action="ControllerPacientes?accion=buscar" method="POST" class="form-inline">
                <input type="search" name="txtBuscar" class="form-control"/>
                <input type="submit" name="accion" class="btn btn-outline-success" value="Buscar" />
            </form>

            <br/>
            <table class ="tablita" width="80%">
                <!--cabecera de tabla -->
                <thead>
                    <tr>
                        <th>DNI</th>
                        <th>Nombre</th>
                        <th>Apellido Paterno</th>
                        <th>Apellido Materno</th>
                        <th>Género</th>
                        <th>Email</th>
                        <th>Telefono</th>
                        <th>Ocupación</th>
                        <th>Dirección</th>
                        <th>ID</th>
                        <th></th>
                        <th></th>
                 
                    </tr>
                </thead>
                <!--cuerpo de tabla-->
                <tbody>               
                    <c:forEach var="paciente" items="${lista}">
                        <tr>
                            <td><c:out value="${paciente.dni}"/></td>
                            <td><c:out value="${paciente.nombre}"/></td>
                            <td><c:out value="${paciente.apellidop}"/></td>
                            <td><c:out value="${paciente.apellidom}"/></td>
                            <td><c:out value="${paciente.genero}"/></td>
                            <td><c:out value="${paciente.email}"/></td>
                            <td><c:out value="${paciente.telefono}"/></td>
                            <td><c:out value="${paciente.ocupacion}"/></td>
                            <td><c:out value="${paciente.direccion}"/></td>
                            <td><c:out value="${paciente.id}"/></td>
                            <td><a href="ControllerPacientes?action=modificar&id=<c:out value="${paciente.id}"/>">Modificar</a></td>
                            <td><a href="ControllerPacientes?action=eliminar&id=<c:out value="${paciente.id}"/>">Eliminar</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </section>
    </body>
</html>
