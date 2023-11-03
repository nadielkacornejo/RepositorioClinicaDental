<%-- 
    Document   : modificar
    Created on : 4 oct. 2023, 22:44:49
    Author     : tempuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clínica</title>
        <link rel="stylesheet" href="../css/style.css" />
        <link rel="styleicon" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    </head>

    <body>
        <jsp:include page="../header-menu.jsp"></jsp:include>
        <section class="modificar">
            <br/>
            <h1>Modificar servicio</h1>
            
            <form action="ControllerServicios?accion=actualizar" method="POST" autocomplete="off">

                <input id="id" name="id" type="hidden" value="<c:out value="${servicio.id}"/>"/>
                <p>
                    Código:
                    <input id ="Codigo" name="codigo" type="text" value="<c:out value="${servicio.codigo}"/>"/>
                </p>
                <p>
                    Nombre:
                    <input id ="nombre" name="nombre" type="text" value="<c:out value="${servicio.nombre}"/>"/>
                </p>
                <p>
                    Costo:
                    <input id ="costo" name="costo" type="text" value="<c:out value="${servicio.costo}"/>"/>
                </p>
                <button id ="guardar" name="guardar" type="submit">Guardar</button>

            </form>
        </section>

    </body>
</html>
