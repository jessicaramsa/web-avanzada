<%-- 
    Document   : Alumno_Buscar
    Created on : 18/05/2020, 11:00:22 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar alumno</title>
    </head>
    <body>
        <h1>Buscar alumno</h1>
        <form action="Alumno_Buscar" method="post">
            No. Control: <input type="text" name="no_control"><br>
            <input type="submit" value="Buscar">
        </form>
        <script>
            ${mensaje}
        </script>
        <div>
            no_control: ${no_control}<br>
            nombre: ${nombre}<br>
            semestre: ${semestre}<br>
        </div>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
