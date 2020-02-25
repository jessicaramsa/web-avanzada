<%-- 
    Document   : index
    Created on : 15/02/2020, 06:06:16 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla con imágenes</title>
    </head>
    <body>
        <h1>Tabla con imágenes</h1>
        <table cellspacing="5" cellpadding="5" border="1">
            <tr>
                <td align="center">Pingüinos</td>
                <td align="center">Tulipanes</td>
                <td align="center">Desierto</td>
            </tr>
            <tr>
                <td>
                    <img src="imgs/Pingu.jpg" width="200" height="200"
                         align="left" alt="No se pudo mostrar la imagen">
                </td>
                <td>
                    <img src="imgs/Tulips.jpg" width="200" height="200"
                         align="left" alt="No se pudo mostrar la imagen">
                </td>
                <td>
                    <img src="imgs/Desert.jpg" width="200" height="200"
                         align="left" alt="No se pudo mostrar la imagen">
                </td>
            </tr>
        </table>
    </body>
</html>
