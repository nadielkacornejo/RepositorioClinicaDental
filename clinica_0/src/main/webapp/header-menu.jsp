<%-- 
    Document   : header-footer-menu
    Created on : 9 oct. 2023, 17:08:28
    Author     : tempuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Central de sonrisas</title>
        <link rel="stylesheet" href="css/style.css" />
        <link rel="styleicon" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    </head>
    <body>
        <!-- header! -->
        <header class = "header">
            <div class ="logo">
                <img src="img/logo_clinica.svg" alt="logo">
            </div>
            <nav>
                <ul class="nav-links">
                    <li><a href=""><b>Acerca de nosotros</b></a></li>
                    <li><a href=""><b>User</b></a></li>
                    <a href="" class="btn"><button>Menu</button></a>
            </nav> 
        </header>
        <!-- end header -->

        <!-- menu lateral izquierda -->
        <div class="menu-cont">

            <ul class="nav-menu">
                <li><a href="index.jsp"><i class="fas fa-home"></i> &nbsp Inicio</a></li>
                <li><a href="citas.jsp"><i class="fa-solid fa-book-medical"></i> &nbsp Citas</a></li>
                <li><a href="ControllerServicios?accion"><i class="fa-solid fa-notes-medical"></i> &nbsp Servicios</a></li>
                <li><a href="ControllerPacientes?action"> <i class="fa-solid fa-hospital-user"></i> &nbsp Pacientes</a></li>
                <li><a href="odontologos.jsp"><i class="fa-solid fa-user-doctor"></i> &nbsp Ondontologos</a></li>

                <li><a href="index.html"><i class="fa-solid fa-arrow-right-from-bracket"></i> &nbsp Salir</a></li>
            </ul>
        </div>
        <script src="https://kit.fontawesome.com/81581fb069.js" crossorigin="anonymous"></script>
        <!-- end menu -->
    </body>
</html>
