<%-- 
    Document   : MetodoGET
    Created on : 22/03/2020, 04:20:13 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Metodo POST</title>
    </head>
    <body>
        <form action="prueba" method="post">
            Nombre: <input type="text" name="txtnombre">
            <br><br>
            Edad: <input type="text" name="txtedad">
            <br><br>
            <input type="submit" value="Enviar información">
        </form>
    </body>
</html>