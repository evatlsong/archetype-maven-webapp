package com.evatlsong.archetype;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class HelloWorldTest {
    @Test
    public void testSayHello() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.doGet(request, response);
        assertEquals("hello world", response.getContentAsString());
    }
}
