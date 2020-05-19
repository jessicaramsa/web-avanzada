package app.controlador;

import app.modelo.Alumno;
import app.persistencia.AlumnoBD;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jessicaramsa
 */
public class Alumno_Actualizar extends HttpServlet {

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
        String paginaRespuesta = "Alumno_Actualizar.jsp";
        int no_control;
        String nombre = "";
        int semestre;
        
        AlumnoBD aBD = new AlumnoBD();
        Alumno a = new Alumno();
        no_control = Integer.parseInt(request.getParameter("no_control"));
        nombre = request.getParameter("nombre");
        semestre = Integer.parseInt(request.getParameter("semestre"));
        
        a.setNo_control(no_control);
        a.setNombre(nombre);
        a.setSemestre(semestre);
        
        try {
            aBD.abrir();
            int i = aBD.modificar(a);
            aBD.cerrar();
            
            if (i == 0)
                request.setAttribute("mensaje", "alert('Error al modificar')");
            else
                request.setAttribute("mensaje", "alert('Actualización exitosa')");
        } catch(Exception ex) {
            request.setAttribute("mensaje", "alert('Error al modificar')");
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(paginaRespuesta);
        dispatcher.forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
