<%-- 
    Document   : login
    Created on : 22 mar 2022, 12:21:42
    Author     : Julián David Ramos Gómez <juli12319@hotmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web App</title>
        <link rel="stylesheet" href="public/css/usuario/usuario-registro.css"/>

    </head>
    <body>
        <header>
            <div> Registro </div>
            <div> 
                <a href="?cmd=visita-landing"> Inicio </a>
                <a href="?cmd=usuario-login"> Login </a>
            </div>
        </header>

        <main>
            <h2> Registro </h2>

            <form method="post" accept-charset="Windows-1252">
                <div>
                    <label for="user"> Usuario </label>
                    <input 
                        id="user" 
                        type="text" 
                        name="user"
                        required
                        pattern="\w{3,20}"
                        autocomplete="username"
                        />
                </div>
                <div>
                    <label for="password">Password</label>
                    <input 
                        id="password" 
                        type="password" 
                        name="password"
                        required
                        pattern="\w{3,20}"
                        autocomplete="current-password"/>
                </div>
                <div>
                    <button type="submit">Acceder</button>
                    <button type="reset">Reiniciar</button>
                </div>
            </form>        
        </main>

        <footer>
            <div> 
                <a href="https://es-es.facebook.com/"> <img src="public/img/facebook.png"/></a>
            </div>
            <div> Todos los Derechos son Reservados </div>
        </footer>
        <script src="public/js/usuario/usuario-login.js"></script>
    </body>
</html>
