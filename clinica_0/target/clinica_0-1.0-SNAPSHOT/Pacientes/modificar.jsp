<%-- 
    Document   : modificar
    Created on : 23 oct. 2023, 15:42:44
    Author     : tempuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../header-menu.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clínica</title>
    </head>
    <body>
        <section class="modificar">
            <br/>
            <h1>Modificar paciente</h1>

            <form action="ControllerPacientes?action=actualizar" method="POST" autocomplete="off">

                <input id="id" name="id" type="hidden" value="<c:out value="${paciente.id}"/>"/>
                <p>
                    DNI:
                    <input id ="dni" name="dni" type="text" value="<c:out value="${paciente.dni}"/>"/>
                </p>
                <p>
                    Nombre:
                    <input id ="nombre" name="nombre" type="text" value="<c:out value="${paciente.nombre}"/>"/>
                </p>
                <p>
                    Apellido Paterno:
                    <input id="apellidop" name="apellidop" type="text" value="<c:out value="${paciente.apellidop}"/>"/>
                </p>   
                <p>
                    Apellido Materno:
                    <input id="apellidom" name="apellidom" type="text" value="<c:out value="${paciente.apellidom}"/>"/>
                </p> 
                <p>
                    Género:
                    <input id="genero" name="genero" type="text" value="<c:out value="${paciente.genero}"/>"/>
                </p> 
                <p>
                    Email:
                    <input id="email" name="email" type="text" value="<c:out value="${paciente.email}"/>"/>
                </p> 
                <p>
                    Telefono:
                    <input id="telefono" name="telefono" type="text" value="<c:out value="${paciente.telefono}"/>"/>
                </p> 
                <p>
                    Ocupación:
                    <input id="ocupacion" name="ocupacion" type="text" value="<c:out value="${paciente.ocupacion}"/>"/>
                </p> 
                <p>
                    Dirección:
                    <input id="direccion" name="direccion" type="text" value="<c:out value="${paciente.direccion}"/>"/>
                </p> 
                <button id ="guardar" name="guardar" type="submit">Guardar</button>

            </form>
        </section>
    </body>
</html>
