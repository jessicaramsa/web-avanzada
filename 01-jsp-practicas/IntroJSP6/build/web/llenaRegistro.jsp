<%-- 
    Document   : llenaRegistro
    Created on : 24/02/2020, 05:51:10 PM
    Author     : Uroboros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Llena Registro</title>
</head>
<body>
    <%@page import="controller.registro" %>
    <h3> Registra tus datos</h3>
    <form action="registro" method="post">
        <table cellspacing="3" cellpadding="3" border="1">
            <tr>
                <td align="right">Cuenta:</td>
                <td><input type="text" name="cuenta"></td>
            </tr>
            <tr>
                <td align="right">Nombre:</td>
                <td><input type="text" name="nombre"></td>
            </tr>
            <tr>
                <td align="right">Contraseña:</td>
                <td><input type="text" name="clave"></td>
            </tr>
            <tr>
                <td align="right">Mail:</td>
                <td><input type="text" name="mail"></td>
            </tr>
        </table>
        <input type="reset" value="Borrar"> <input type="submit" value="Guardar">
    </form>
    <form action="index.jsp" method="post">
        <input type="submit" value="Regresar">
    </form>
</body>
</html>