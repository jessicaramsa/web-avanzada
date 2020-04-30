<%-- 
    Document   : resultado
    Created on : 27/04/2020, 01:49:27 PM
    Author     : jessicaramsa
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agenda</title>
    </head>
    <body>
        <h1>Mi Agenda</h1>
        <jsp:useBean id="Agenda" scope="request" class="Persistencia.Agenda"/>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Calle</th>
                    <th>Colonia</th>
                    <th>RFC</th>
                    <th>Teléfono</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${Agenda.agenda}">
                    <tr>
                        <td>${item.getIdCliente()}</td>
                        <td>${item.getNombre()}</td>
                        <td>${item.getCalle()}</td>
                        <td>${item.getColonia()}</td>
                        <td>${item.getRfc()}</td>
                        <td>${item.getTelefono()}</td>
                        <td>${item.getEmail()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
