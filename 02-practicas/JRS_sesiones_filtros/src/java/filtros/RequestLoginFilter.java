package filtros;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jessicaramsa
 */
public class RequestLoginFilter implements Filter {
    private ServletContext context;

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        Enumeration<String> params = req.getParameterNames();
        while (params.hasMoreElements()) {
            String name = params.nextElement();
            String value = request.getParameter(name);
            this.context.log(req.getRemoteAddr() + "::Request Params::{"
                + name + " = " + value + "}");
        }
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                this.context.log(req.getRemoteAddr() + "::Cookie::{"
                    + cookie.getName() + ", " + cookie.getValue() + "}");
            }
        }
        chain.doFilter(request, response);
    }

    public void destroy() {}

    public void init(FilterConfig filterConfig) throws ServletException {
        this.context = filterConfig.getServletContext();
        this.context.log("RequestLogginFilter initialized");
    }
}
