<%-- 
    Document   : index
    Created on : 20/02/2020, 07:39:52 AM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de productos</title>
    </head>
    <body>
        <%@page import="controller.registraProducto"%>
        <h2>Hola! Proporciona los datos</h2>
        <h2>del producto</h2>
        <form action="registraProducto" method="post">
            <table cellspacing="3" cellpadding="3" border="1">
                <tr>
                    <td align="right">Clave:</td>
                    <td><input type="text" name="clave"></td>
                </tr>
                <tr>
                    <td align="right">Nombre:</td>
                    <td><input type="text" name="nombre"></td>
                </tr>
                <tr>
                    <td align="right">Precio:</td>
                    <td><input type="number" name="precio"></td>
                </tr>
                <tr>
                    <td align="right">Cantidad:</td>
                    <td><input type="number" name="cant"></td>
                </tr>
            </table>
            <input type="reset" value="Borrar">
            <input type="submit" value="Registrar">
        </form>
        <br>
        <form action="muestraProductos" method="POST">
            <input type="submit" value="Ver Productos">
        </form>
    </body>
</html>