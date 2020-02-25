<%-- 
    Document   : index
    Created on : 24/02/2020, 05:43:50 PM
    Author     : Uroboros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ingreso al sistema</title>
</head>
<body>
    <h1>Bienvenido al sistema de Login!</h1>
    <%@ page import="controller.login"%>
    <h3>Introduce tu cuenta y tu contraseña</h3>
    <form action="login" method="post">
        <table cellspacing="3" cellpadding="3" border="1">
            <tr>
                <td align="right">Cuenta:</td>
                <td><input type="text" name="cuenta"></td>
            </tr>
            <tr>
                <td align="right">Contraseña:</td>
                <td><input type="password" name="clave"></td>
            </tr>
        </table>
        <input type="reset" value="Borrar"> <input type="submit" value="Ingresar">
    </form>
    <form action="llenaRegistro.jsp" method="post">
        <input type="submit" value="Registrar">
    </form>
</body>
</html>