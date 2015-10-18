package com.evatlsong.archetype;

import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by evatlsong on 15-10-18.
 */
public class TestLoginServlet {
    private static final String VALID_USERNAME = "validusername";
    private static final String CORRECT_PASSWORD = "correctpassword";

    private LoginServlet loginServlet;
    private FakeAuthenticationService authenticator;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;

    @Before
    public void setUp() {
        authenticator = new FakeAuthenticationService();
        authenticator.addUser(VALID_USERNAME, CORRECT_PASSWORD);
        loginServlet = new LoginServlet() {
            @Override
            protected AuthenticationService getAuthenticationService() {
                return authenticator;
            }
        };
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }
    @Test
    public void wrongPasswordShouldRedirectToErrorPage() throws ServletException, IOException {
        request.addParameter("j_username", "nosuchuser");
        request.addParameter("j_password", "wrongpassword");
        loginServlet.service(request, response);
        assertEquals("/invalidlogin", response.getRedirectedUrl());
    }
    @Test
    public void validLoginForwardsToFrontPageAndStoresUsername() throws ServletException, IOException {
        request.addParameter("j_username", VALID_USERNAME);
        request.addParameter("j_password", CORRECT_PASSWORD);
        loginServlet.service(request, response);
        assertEquals("/frontpage", response.getRedirectedUrl());
        assertEquals(VALID_USERNAME, request.getSession().getAttribute("username"));
    }
}
