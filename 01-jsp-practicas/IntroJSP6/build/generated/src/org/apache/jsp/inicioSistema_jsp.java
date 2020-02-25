package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.registro;

public final class inicioSistema_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Inicio Sistema</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    ");
 String nombre = (String) request.getAttribute("nombre");
      out.write("\r\n");
      out.write("    <h1>Hola ");
      out.print( nombre );
      out.write(" bienvenido al sistema!</h1><br>\r\n");
      out.write("    <form action=\"muestraUsuarios\" method=\"post\">\r\n");
      out.write("        <input type=\"submit\" value=\"Consultar Usuarios\">\r\n");
      out.write("    </form><br>\r\n");
      out.write("    <form action=\"capturaBorrado.jsp\" method=\"post\">\r\n");
      out.write("        <input type=\"submit\" value=\"Borrar un usuario\">\r\n");
      out.write("    </form><br>\r\n");
      out.write("    <form action=\"index.jsp\" method=\"post\">\r\n");
      out.write("        <input type=\"submit\" value=\"Salir\">\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
