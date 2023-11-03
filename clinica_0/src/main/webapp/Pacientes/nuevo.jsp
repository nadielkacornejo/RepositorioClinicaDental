<%-- 
    Document   : nuevo
    Created on : 23 oct. 2023, 14:55:32
    Author     : tempuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../header-menu.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clínica</title>
    </head>
    <body>           
        <section class ="nuevo">
            <br/>
            <h1>Nuevo Paciente</h1>
            <form action ="ControllerPacientes?action=insertar" method="POST" autocomplete="off">
                <p>
                    DNI:
                    <input id="dni" name="dni" type="text" />
                </p>
                <p>
                    Nombre:
                    <input id="nombre" name="nombre" type="text" />
                </p>
                <p>
                    Apellido Paterno:
                    <input id="apellidop" name="apellidop" type="text" />
                </p>   
                <p>
                    Apellido Materno:
                    <input id="apellidom" name="apellidom" type="text" />
                </p> 
                <p>
                    Género:
                    <input id="genero" name="genero" type="text" />
                </p> 
                <p>
                    Email:
                    <input id="email" name="email" type="text" />
                </p> 
                <p>
                    Telefono:
                    <input id="telefono" name="telefono" type="text" />
                </p> 
                <p>
                    Ocupación:
                    <input id="ocupacion" name="ocupacion" type="text" />
                </p> 
                <p>
                    Dirección:
                    <input id="direccion" name="direccion" type="text" />
                </p> 
                
                <button id ="guardar" name="guardar" type="submit">Guardar</button>
            </form>
        </section>
    </body>
</html>
