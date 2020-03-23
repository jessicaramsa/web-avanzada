<%-- 
    Document   : procesar
    Created on : 22/03/2020, 04:26:34 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesar</title>
    </head>
    <body>
        <%
            String nombre = request.getParameter("txtnombre");
            String edad = request.getParameter("txtedad");
        %>
        <h1>Datos obtenidos</h1>
        Nombre: <%= nombre%>
        <br><br>
        Edad: <%= edad%>
    </body>
</html>