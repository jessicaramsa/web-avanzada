package filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jessicaramsa
 */
@WebFilter(filterName = "AuthenticationFilter", urlPatterns = {"/*"})
public class AuthenticationFilter implements Filter {
    private ServletContext context;
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
        String uri = req.getRequestURI();
        this.context.log("Request Resource::" + uri);
        
        HttpSession session = req.getSession(false);
        
        if (session == null && !(uri.endsWith("html") || uri.endsWith("LoginServlet"))) {
            this.context.log("Unauthorized access request");
            res.sendRedirect("login.html");
        } else {
            chain.doFilter(request, response);
        }
    }

    public void init(FilterConfig filterConfig) {        
        this.context = filterConfig.getServletContext();
        this.context.log("AuthenticationFilter initialized");
    }

    public void destroy() {}
}
