<%-- 
    Document   : prueba
    Created on : 15 mar. 2022, 8:54:27
    Author     : Julian David Ramos Gómez <juli12319@hotmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <img src="public/<%= session.getId()%>/img/logoMascotas.jpg" alt="alt"/>
    </body>
</html>
