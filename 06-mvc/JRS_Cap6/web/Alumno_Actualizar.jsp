<%-- 
    Document   : Alumno_Actualizar
    Created on : 18/05/2020, 11:00:22 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar alumno</title>
    </head>
    <body>
        <h1>Actualizar alumno</h1>
        <form action="Alumno_Actualizar" method="post">
            No. Control: <input type="text" name="no_control"><br>
            Nombre: <input type="text" name="nombre"><br>
            Semestre: <input type="text" name="semestre"><br>
            <input type="submit" value="Actualizar">
        </form>
        <script>
            ${mensaje}
        </script>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
