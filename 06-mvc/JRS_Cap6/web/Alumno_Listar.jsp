<%-- 
    Document   : Alumno_Listar
    Created on : 18/05/2020, 11:08:04 PM
    Author     : jessicaramsa
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.util.ArrayList"%>
<%@page import="app.persistencia.AlumnoBD"%>
<%@page import="app.modelo.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar alumnos</title>
    </head>
    <body>
        <h1>Listar alumnos</h1>
        <%
            ArrayList<Alumno> listaAlumno = null;
            AlumnoBD aBD = new AlumnoBD();
            
            try {
                aBD.abrir();
                listaAlumno = aBD.listar();
                aBD.cerrar();
            } catch(ClassNotFoundException ex) {}
            catch(SQLException ex) {}
            
            if (listaAlumno == null) {
        %>
                <h3>No hay alumnos registrados</h3>
        <%
            } else {
        %>
        <table>
            <tr>
                <th>No. control</th>
                <th>Nombre</th>
                <th>Semestre</th>
            </tr>
        <%
                for (int i = 0; i < listaAlumno.size(); i++) {
        %>
            <tr>
                <td>
                    <% out.print(listaAlumno.get(i).getNo_control());%>
                </td>
                <td>
                    <% out.print(listaAlumno.get(i).getNombre());%>
                </td>
                <td>
                    <% out.print(listaAlumno.get(i).getSemestre());%>
                </td>
            </tr>
        <%
                }
            }
        %>
        </table>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
