<%-- 
    Document   : OtraPagina
    Created on : 22/03/2020, 08:54:28 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Otra Pagina</title>
    </head>
    <body>
        <%
            if (session.getAttribute("user") == null)
                response.sendRedirect("index.html");
            String userName = null;
            String sessionID = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("user"))
                        userName = cookie.getValue();
                }
            }
        %>
        <h3>Hola <%= userName%>, esta es otra página</h3>
        <br>
        <a href="LoginExitoso.jsp">Regresar</a>
        <form action="LogoutServlet" method="post">
            <input type="submit" value="Cerrar sesión">
        </form>
    </body>
</html>
