<%-- 
    Document   : capturaBorrado
    Created on : 24/02/2020, 06:12:40 PM
    Author     : Uroboros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Captura para borrar</title>
</head>
<body>
    <%@page import="controller.borraUsuario"%>
    <h3>Datos del usuario a borrar</h3>
    <form action="borraUsuario" method="post">
        <table cellspacing="3" cellpadding="3" border="1">
            <tr>
                <td align="right">Cuenta:</td>
                <td><input type="text" name="cuenta"></td>
            </tr>
            <tr> <td align="right">Contraseña:</td>
            <td><input type="password" name="clave"></td>
            </tr>
        </table>
        <input type="reset" value="Borrar"> <input type="submit" value="Borrar usuario">
    </form>
    <form action="inicioSistema.jsp" method="post">
        <input type="submit" value="Regresar">
    </form>
</body>
</html>