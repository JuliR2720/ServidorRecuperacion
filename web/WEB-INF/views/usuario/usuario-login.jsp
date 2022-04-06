<%@page import="org.japo.java.libraries.UtilesEntidad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web App</title>
        <link rel="stylesheet" href="public/css/usuario/usuario-login.css"/>

    </head>
    <body>
        <header>
            <div> Login </div>
            <div> 
                <a href="?cmd=visita-landing"> Inicio </a>
                <a href="?cmd=usuario-registro"> Registro </a>
            </div>
        </header>

        <main>
            <h2>Login</h2>

            <form action="?cmd=usuario-login&op=proceso" 
                  method="post" 
                  accept-charset="ISO-8859-1">
                <div>
                    <label for="user"> Usuario </label>
                    <input 
                        id="user" 
                        type="text" 
                        name="user"
                        required
                        pattern="<%=UtilesEntidad.REG_USER%>"
                        
                        />
                </div>
                <div>
                    <label for="pass"> Password </label>
                    <input 
                        id="pass" 
                        type="password" 
                        name="pass"
                        required
                        pattern="<%=UtilesEntidad.REG_PASS%>"
                        />
                </div>
                <div>
                    <button type="submit"> Acceder </button>
                    <button type="reset"> Reiniciar </button>
                </div>
            </form>        
        </main>

        <footer>
            <div> Redes Sociales </div>
            <div> Todos los Derechos son Reservados </div>
        </footer>
        <script src="public/js/usuario/usuario-login.js"></script>
    </body>
</html>
