package com.evatlsong.archetype;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by evatlsong on 15-10-18.
 */
public class LoginServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("j_username");
        String password = request.getParameter("j_password");
        if (getAuthenticationService().isValidLogin(username, password)) {
            response.sendRedirect("/frontpage");
            request.getSession().setAttribute("username", username);
        } else {
            response.sendRedirect("/invalidlogin");
        }
    }
    protected AuthenticationService getAuthenticationService() {
        return null;
    };
}
