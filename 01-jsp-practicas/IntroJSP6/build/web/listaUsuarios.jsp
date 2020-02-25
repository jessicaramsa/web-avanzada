<%-- 
    Document   : listaUsuarios
    Created on : 24/02/2020, 06:20:06 PM
    Author     : Uroboros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Listado de Usuarios</title>
</head>
<body>
    <%@ page import="model.Usuario, java.util.ArrayList"%>
    <h2>Los usuarios que están registrados son:</h2>
    <%
        ArrayList<Usuario> usuarios = null;
        usuarios = (ArrayList<Usuario>)request.getAttribute("Usuarios");
    %>
    <table border="1">
        <tr>
            <th>Cuenta</th>
            <th>Nombre</th>
            <th>Clave</th>
            <th>Mail</th>
        </tr>
        <% for (Usuario usuario: usuarios) {%>
        <tr valign="rigth">
            <td><%= usuario.getCuenta()%></td>
            <td><%= usuario.getNombre()%></td>
            <td><%= usuario.getClave()%></td>
            <td><%= usuario.getMail()%></td>
        </tr><% }%>
    </table><br>
    <form action="inicioSistema.jsp" method="post">
        <input type="submit" value="Regresar">
    </form>
</body>
</html>