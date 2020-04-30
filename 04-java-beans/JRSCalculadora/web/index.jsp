<%-- 
    Document   : index
    Created on : 27/04/2020, 02:25:42 PM
    Author     : jessicaramsa
--%>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <jsp:useBean id="CalculadoraBean" class="bean.CalculadoraBean">
        </jsp:useBean>
        <jsp:setProperty name="CalculadoraBean" property="*"/>
        <%
            CalculadoraBean.calculate();
        %>
        <br/>
        <hr>
        <br/>
        El Resultado es:
        <jsp:getProperty name="CalculadoraBean" property="firstNum"/>
        <jsp:getProperty name="CalculadoraBean" property="operator"/>
        <jsp:getProperty name="CalculadoraBean" property="secondNum"/>
        =
        <jsp:getProperty name="CalculadoraBean" property="result"/>
        <br/>
        <hr>
        <br/>
        <form action="/Calculadora/faces/index.jsp" method="post"
              style="text-align: center">
            <table border="1" width="50%">
                <tr style="text-align: center">
                    <td colspan="2">Calculadora</td>
                    <td></td>
                </tr>
                <tr>
                    <td>Primer Numero</td>
                    <td>
                        <input type="text" name="firstNum">
                    </td>
                </tr>
                <tr>
                    <td>Operator</td>
                    <td>
                        <select name="operador">
                            <option value="+">+</option>
                            <option value="-">-</option>
                            <option value="*">*</option>
                            <option value="/">/</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Segundo Numero</td>
                    <td>
                        <input type="text" name="secondNum">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Calculation">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
