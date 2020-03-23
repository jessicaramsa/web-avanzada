<%-- 
    Document   : LoginExitoso
    Created on : 22/03/2020, 08:44:48 PM
    Author     : jessicaramsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio exitoso</title>
    </head>
    <body>
        <%
            String user = null;
            if (session.getAttribute("user") == null) {
                response.sendRedirect("index.html");
            } else {
                user = (String) session.getAttribute("user");
            }
            String userName = null;
            String sessionID = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("user"))
                        userName = cookie.getValue();
                    if (cookie.getName().equals("JSESSIONID"))
                        sessionID = cookie.getValue();
                }
            }
        %>
        <h3>Hola <%= userName%></h3>
        <p>Inicio de sesión exitoso. Tu Session ID = <%= sessionID%></p>
        <br>
        User = <%= user%>
        <br>
        <a href="OtraPagina.jsp">Otra página</a>
        <form action="LogoutServlet" method="post">
            <input type="submit" value="Cerrar sesión">
        </form>
    </body>
</html>
