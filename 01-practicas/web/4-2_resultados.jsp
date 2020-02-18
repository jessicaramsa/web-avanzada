<%-- 
    Document   : 4-2_resultados
    Created on : 18/02/2020, 07:58:57 AM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ecuación - Resultados</title>
    </head>
    <body>
        <%@ page import="clases.ResuelveEc"%>
        <%@ page import="clases.GestorArchivo"%>
        <% // Extracción de los parámetros recibidos
            String A = request.getParameter("VarA");
            String B = request.getParameter("VarB");
            String C = request.getParameter("VarC");
            ResuelveEc solucion = new ResuelveEc(A,B,C);
            String result1= solucion.raiz1();
            String result2=  solucion.raiz2();
            ServletContext sc = this.getServletContext();
            String path = sc.getRealPath("/WEB-INF/Resultados.txt");
            GestorArchivo guardar = new GestorArchivo();
            guardar.guardarResultado(result1, result2, path);
        %>
        <form action="" method="POST">
            <table table cellspacing="4" cellpadding="3" border="1">
                <tr align="center">
                    <th colspan="2">Resultados</th>
                </tr>
                <tr>
                    <td>Primera raíz:</td>
                    <td><%= result1%></td>
                </tr>
                <tr>
                    <td>Segunda raíz:</td>
                    <td><%= result2%></td>
                </tr>
            </table>
        </form>
        <p>Los resusltados se guardaron en el archivo <br>"Resultados.txt"</p><br>
        <form action="4-2_ecuacion.jsp" method="post">
            <input type="submit" value="Regresar">
        </form>
    </body>
</html>