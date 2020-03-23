<%-- 
    Document   : index
    Created on : 22/03/2020, 05:49:11 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de computadora</title>
    </head>
    <body>
        <h1>Registro de computadora</h1>
        <form name="RegistroComputadora" action="MiServlet2" method="POST">
            No. de serie <input type="text" name="noSerie" value=""><br>
            Marca <input type="text" name="marca" value=""><br>
            Modelo <input type="text" name="modelo" value=""><br>
            Color <input type="text" name="color" value=""><br>
            Maestro <input type="text" name="maestro" value=""><br>
            <input type="submit" value="Aceptar" name="Aceptar">
        </form>
    </body>
</html>