<%-- 
    Document   : Alumno_Eliminar
    Created on : 18/05/2020, 11:00:22 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar alumno</title>
    </head>
    <body>
        <h1>Eliminar alumno</h1>
        <form action="Alumno_Eliminar" method="post">
            No. Control: <input type="text" name="no_control"><br>
            <input type="submit" value="Eliminar">
        </form>
        <script>
            ${mensaje}
        </script>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
