<%-- 
    Document   : Alumno_Insertar
    Created on : 18/05/2020, 11:00:22 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar alumno</title>
    </head>
    <body>
        <h1>Insertar alumno</h1>
        <form action="Alumno_Insertar" method="post">
            No. Control: <input type="text" name="no_control"><br>
            Nombre: <input type="text" name="nombre"><br>
            Semestre: <input type="text" name="semestre"><br>
            <input type="submit" value="Insertar">
        </form>
        <script>
            ${mensaje}
        </script>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
