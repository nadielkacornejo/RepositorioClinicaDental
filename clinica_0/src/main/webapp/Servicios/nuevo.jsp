<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Servicio</title>
        <link rel="stylesheet" href="../css/style.css" />
        <link rel="styleicon" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    </head>
    <body>
        <jsp:include page="../header-menu.jsp"></jsp:include>
           
        <section class ="nuevo">
            <br/>
            <h1>Nuevo Servicio</h1>
            <form action ="ControllerServicios?accion=insertar" method="POST" autocomplete="off">
                <p>
                    Código:
                    <input id="codigo" name="codigo" type="text" />
                </p>
                <p>
                    Nombre:
                    <input id="nombre" name="nombre" type="text" />
                </p>
                <p>
                    Costo:
                    <input id="costo" name="costo" type="text" />
                </p>   
                <button id ="guardar" name="guardar" type="submit">Guardar</button>
            </form>
        </section>
    </body>
</html>
