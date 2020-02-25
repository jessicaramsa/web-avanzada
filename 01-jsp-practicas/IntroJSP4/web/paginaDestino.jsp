<%-- 
    Document   : 4-1_paginaDestino
    Created on : 18/02/2020, 07:47:48 AM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sueldo - Resultado</title>
    </head>
    <body>
        <%@ page import="negocio.Calcular" %>
        <% // Extracción de los parámetros recibidos
            String nombre = request.getParameter("nombre");
            String sueldoDia= request.getParameter("sueldoDia");
            String diasTrab = request.getParameter("diasTra");
            Double Stotal;
            Calcular calcula = new Calcular(sueldoDia, diasTrab);
            calcula.sueldototal();
        %>
        <h2>Resultado</h2>
        <p>Hola <%= nombre%></p>
        <table cellspacing="3" cellpadding="3" border="1">
            <tr>
                <td align="right">Tu Sueldo total fue:</td>
                <td><%= calcula.getSueldo()%> Pesos</td>
            </tr>
        </table>
        <form action="calcular-sueldo.jsp" method="post">
            <input type="submit" value="Regresar">
        </form>
    </body>
</html>