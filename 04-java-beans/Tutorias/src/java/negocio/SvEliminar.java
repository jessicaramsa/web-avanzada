package negocio;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jessicaramsa
 */
public class SvEliminar extends HttpServlet {

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
            out.println("<title>Servlet SvEliminar</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvEliminar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        try {
            mostrarFormulario(out);
        } catch (SQLException ex) {
            Logger.getLogger(SvEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try (PrintWriter out = response.getWriter()) {
            try {
                String sID = request.getParameter("idtutoria");
                if (sID == null || sID.length() == 0) {
                    return;
                }
                int id_tutoria = Integer.parseInt(sID);
                BD.borrarCitas(id_tutoria);
                out.println("<html>");
                out.println("<title>Respuesta a la solicitud</title>");
                out.println("<center>LA CITA HA SIDO BORRADA<br>:)</center>");
                out.println("</html>");
            } catch (SQLException e) {
                out.println("<html>");
                out.println("<h3>Imposible realizar la operación</h3>");
                out.println("<p><a href='SvEliminar'>continuar</a></p><p>" + e + "</p>");
                out.println("</html>");
                response.setHeader("Refresh", "5; URL=SvElimina");
            }
        }
    }

    public void mostrarFormulario(PrintWriter out) throws SQLException {
        ResultSet cdr = BD.citas();
        out.println("<html>"
                + "<head><title>Concertar una tutoría</title></head>"
                + "<body bgcolor=steelblue><center>"
                + "<h1><font color=sienna face='Arial'>ELIMINAR CITA</font></h1>");
        if (cdr.isBeforeFirst() == false) {
            out.println("<br>TODAS LAS TUTORÍAS ESTÁN CONCERTADAS<br></center></body></html>");
            return;
        }
        out.println("<form action='SvEliminar'"
                + "method=post>"
                + "<br><br><font face='Arial'>ID tutoría:</font>"
                + "&nbsp;&nbsp;<select name='idtutoria'>");
        while (cdr.next()) {
            out.println("<option>" + cdr.getString("id_tutoria"));
        }
        out.println("</select><br><br>");
        out.println(
                "<br><br><input type='submit' value='Enviar datos'>"
                + "&nbsp;&nbsp;<input type='reset'>"
                + "</form></center></body></html>");
    }

    @Override
    public void destroy() {
        try {
            BD.cerrarConexion();
        } catch (SQLException ignorada) {
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
