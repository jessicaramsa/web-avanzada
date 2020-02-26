<%-- 
    Document   : index
    Created on : 24/02/2020, 09:27:39 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nivel jugador</title>
    </head>
    <body>
        <h1>Videojuego</h1>
        <form acction="resultado.jsp" method="post">
            <label for="puntaje">Puntos obtenidos durante el videojuego:</label>
            <input type="number" placeholder="Puntos obtenidos" name="puntaje" min="0" max="1000">
            <br>
            <input type="reset" value="Borrar"> <input type="submit" value="Calcular nivel">
        </form>
    </body>
</html>