<%-- 
    Document   : visita-landing
    Created on : 22 mar. 2022, 10:24:47
    Author     : Julian David Ramos Gómez <juli12319@hotmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web App</title>
        <link rel="stylesheet" href="public/css/visita/visita-landing.css"/>
    </head>
    <body>
        <header>
            <div> Landing </div>
            <div> 
                <a href="?cmd=usuario-login"> Login </a>
                <a href="?cmd=usuario-registro"> Registro </a>
            </div>
        </header>
        <main>
            <h1> Estas en la Pagina de Inicio </h1>
            <img src="public/img/astronauta.jpg" alt="astronauta"/>
            <h2> Bienvenido </h2>
        </main>
        <footer>
            <div> Redes Sociales </div>
            <div> Todos los Derechos son Reservados </div>
        </footer>
        <script src="public/js/visita/visita-landing.js"></script>
    </body>
</html>
