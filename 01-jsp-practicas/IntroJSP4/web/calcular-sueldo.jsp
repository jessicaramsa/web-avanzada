<%-- 
    Document   : 4-1_calcular-sueldo
    Created on : 18/02/2020, 07:27:53 AM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calcular sueldo</title>
    </head>
    <body>
        <h1>Página de inicio</h1>
        <p>Hola, por favor introduce la información</p>
        <form action="paginaDestino.jsp" method="post">
            <table cellspacing="3" cellpadding="3" border="1">
                <tr>
                    <td align="right">Nombre:</td>
                    <td><input type="text" name="nombre"></td>
                </tr>
                <tr>
                    <td align="right">Sueldo por Dia:</td>
                    <td><input type="text" name="sueldoDia"></td>
                </tr>
                <tr>
                    <td align="right">Dias Trabajados:</td>
                    <td><input type="text" name="diasTra"></td>
                </tr>
            </table><br><br>
            <form action="paginaDestino.jsp" method="post">
                <input type="submit" value="Calcular sueldo">
            </form>
        </form>
    </body>
</html>
