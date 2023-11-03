
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> <!--importamos libreria para implementar for each-->

<!DOCTYPE html>
<html>
    <head>
        <%@include file="../header-menu.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clínica</title>
        <link rel="stylesheet" href="../css/style.css" />
        <link rel="styleicon" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    </head>

    <body>
            <section class ="servicios">
                <h1>Servicios</h1>
                <!-- como si estuvieramos enviando el atributo por get-->
                <a href="ControllerServicios?accion=nuevo">Nuevo Servicio</a>
              
                <form action="ControllerServicios?accion=buscar" method="POST" class="form-inline">
                    <input type="search" name="txtBuscar" class="form-control"/>
                    <input type="submit" name="accion" class="btn btn-outline-success" value="Buscar" />
                </form>

                <br/>
                <table class ="tablita" width="80%">
                    <!--cabecera de tabla -->
                    <thead>
                        <tr>
                            <th>Código</th>
                            <th>Nombre</th>
                            <th>Costo</th>
                            <th>ID</th>
                            <th></th>
                            <th></th>
                   
                        </tr>
                    </thead>
                    <!--cuerpo de tabla-->
                    <tbody>               
                    <c:forEach var="servicio" items="${lista}">
                        <tr>
                            <td><c:out value="${servicio.codigo}"/></td>
                            <td><c:out value="${servicio.nombre}"/></td>
                            <td><c:out value="${servicio.costo}"/></td>
                            <td><c:out value="${servicio.id}"/></td>
                            <td><a href="ControllerServicios?accion=modificar&id=<c:out value="${servicio.id}" />">Modificar</a></td>
                            <td><a href="ControllerServicios?accion=eliminar&id=<c:out value="${servicio.id}" />">Eliminar</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </section>
    </body>
</html>
