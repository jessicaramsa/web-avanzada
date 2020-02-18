<%-- 
    Document   : 4-2_ecuacion
    Created on : 18/02/2020, 07:56:36 AM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ecuación</title>
    </head>
    <body>
        <h3>SOLUCIÓN UNA ECUACION DE 2º GRADO</h3>
        <table table border="1">
            <td>Proporcionar los coeficientes de la ec. de segundo grado de la forma:</td>
            <tr>
                <td>
                    <img src="imgs/ec_grado_2.jpg" width="170" heigth="170" align="left" alt="No se pudo mostrar la imagen">
                </td>
            </tr>
            <td>La solución se obtiene con la fórmula:</td>
            <tr>
                <td>
                    <img src="imgs/formula.jpg" width="150" heigth="150" align="left" alt="No se pudo mostrar la imagen">
                </td>
            </tr>
        </table>
        <form action="4-2_resultados.jsp" method="POST">
            <table table cellspacing="4" cellpadding="3" border="1">
                <tbody>
                    <tr>
                        <td align="right">a:</td>
                        <td><input type="text" name="VarA" value="" required/></td>
                    </tr>
                    <tr>
                        <td align="right">b:</td>
                        <td><input type="text" name="VarB" value="" required/></td>
                    </tr>
                    <tr>
                        <td align="right">c:</td>
                        <td><input type="text" name="VarC" value="" required/></td>
                    </tr>
                    <tr>
                        <td><input type="reset" value="Borrar"></td>
                        <td><input type="submit" value="Resolver"/></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
