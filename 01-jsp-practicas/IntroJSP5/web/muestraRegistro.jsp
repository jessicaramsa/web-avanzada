<%-- 
    Document   : muestraRegistro
    Created on : 20/02/2020, 08:15:18 AM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Muestra registro</title>
    </head>
    <body>
        <%@ page import="controller.Producto" %>
        <% Producto producto = (Producto) request.getAttribute("atribProd");%>
        <h3>MuestraRegistro.jsp</h3>
        <p>Se guardaron los siguientes datos:</p>
        <table cellspacing="3" cellpadding="3" border="1">
            <tr>
                <td align="right">Clave:</td>
                <td><%= producto.getClave()%></td>
            </tr>
            <tr>
                <td align="right">Nombre:</td>
                <td><%= producto.getNombre()%></td>
            </tr>
            <tr>
                <td align="right">precio:</td>
                <td><%= producto.getPrecio()%></td>
            </tr>
            <tr>
                <td align="right">Cantidad:</td>
                <td><%= producto.getCantidad()%></td>
            </tr>
        </table>
        <form action="producto.jsp" method="post">
            <input type="submit" value="Regresar">
        </form>
    </body>
</html>