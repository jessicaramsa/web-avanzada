package negocio;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jessicaramsa
 */
public class SvCitas extends HttpServlet {

    private BDTutorias BD;

    @Override
    public void init(ServletConfig config) throws
            ServletException {
        super.init(config);
        try {
            BD = new BDTutorias();
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada. " + e.getMessage());
        } catch (InstantiationException e) {
            System.out.println("Objeto no creado. " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Acceso ilegal. " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Excepción SQL. " + e.getMessage());
        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvCitas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvCitas at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        mostrarFormulario(out);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            BD.citas();
            out.println("<html>");
            out.println("<title>Respuesta a la solicitud</title>");
            out.println("<center>SU TUTORIA A SIDO CONCERTADA CORRECTAMENTE</center>");
            out.println("</html>");
        } catch (SQLException e) {
            out.println("<html>");
            out.println("<h3>Imposible realizar la operación</h3>");
            out.println("<p><a href ='SvTutorias'>continuar</a></p>");
            out.println("</html>");
            response.setHeader("Refresh", "5; URL=SvTutorias");
        }
        out.close();
    }

    public void mostrarFormulario(PrintWriter out) {
        try {
            ResultSet cdr = BD.citas();
            out.println("<html>"
                    + "<head><title>Concertar una tutoría</title></head>"
                    + "<body bgcolor=steelblue><center>"
                    + "<h1><font color=sienna face ='Arial'>CITAS</font></h1>");
            if (cdr.isBeforeFirst() == false) {
                out.println("<br>TODAS LAS TUTORÍAS ESTÁN CONCERTADAS" + "<br></center></body></html>");
                return;
            }
            mostrarTutoriasDisponibles(cdr, out);
        } catch (SQLException e) {
            out.println("Excepción SQL. " + e.getMessage());
        }
    }

    public void mostrarTutoriasDisponibles(ResultSet cdr,
            PrintWriter out) {
        try {
            out.println("<table width=100% border=1>");
            out.println(
                    "<tr>"
                    + "<th>ID tutoría</th>"
                    + "<th>Alumno</th>"
                    + "<th>Asunto</th>"
                    + "</tr>");
            cdr.beforeFirst();
            while (cdr.next()) {
                out.println(
                        "<tr>"
                        + "<td width=10%>" + cdr.getString("id_tutoria") + "</td>"
                        + "<td width=30%>" + cdr.getString("alumno") + "</td>"
                        + "<td width=60%>" + cdr.getString("asunto") + "</td>"
                        + "</tr>");
            }
            out.println("</table>");
        } catch (SQLException e) {
            out.println("Excepción SQL. " + e.getMessage());
        }
    }

    @Override
    public void destroy() {
        try {
            BD.cerrarConexion();
        } catch (SQLException ignorada) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Servlet SvTutorias";
    }
}
