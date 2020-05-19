<%-- 
    Document   : index
    Created on : 18/05/2020, 08:48:34 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MVC</title>
    </head>
    <body>
        <h1>Login del sistema</h1>
        <form action="Login">
            <table>
                <tr>
                    <td>Usuario</td>
                    <td><input type="text" name="userin"></td>
                </tr>
                <tr>
                    <td>Contraseña</td>
                    <td><input type="password" name="passwordin"></td>
                </tr>
                <th colspan="2"><input type="submit" value="Ingresar"></th>
            </table>
        </form>
    </body>
</html>
