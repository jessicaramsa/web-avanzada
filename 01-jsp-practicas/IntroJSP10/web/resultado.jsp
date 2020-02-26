<%-- 
    Document   : resultado
    Created on : 25/02/2020, 07:48:44 AM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <%
            int puntaje = Integer.parseInt(request.getParameter("puntaje"));
            String nivelJugador = "";
            if (puntaje > 901 && puntaje < 1000)
                nivelJugador = "Experto";
            else if (puntaje > 600)
                nivelJugador = "Avanzado";
            else if (puntaje > 250)
                nivelJugador = "Intermedio";
            else
                nivelJugador = "Principiante";
        %>

        <h1>Nivel de jugador</h1>
        <h1>¡Felicidades eres nivel <%= nivelJugador%>!</h1>

        <form action="index.jsp" mehtod="post">
            <input type="submit" value="Regresar">
        </form>
    </body>
</html>