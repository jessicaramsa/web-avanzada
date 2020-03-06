<%-- 
    Document   : inicioSistema.jsp
    Created on : 24/02/2020, 06:08:38 PM
    Author     : Uroboros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Inicio Sistema</title>
</head>
<body>
    <%@page import="controller.registro" %>
    <% String nombre = (String) session.getAttribute("nombre");%>
    <h1>Hola <%= nombre %> bienvenido al sistema!</h1><br>
    <form action="muestraUsuarios" method="post">
        <input type="submit" value="Consultar Usuarios">
    </form><br>
    <form action="capturaBorrado.jsp" method="post">
        <input type="submit" value="Borrar un usuario">
    </form><br>
    <form action="index.jsp" method="post">
        <input type="submit" value="Salir">
    </form>
</body>
</html>