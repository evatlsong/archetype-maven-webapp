package com.evatlsong.archetype.web;

import com.evatlsong.archetype.exception.RestException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by evatlsong on 15-10-24.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/rest-exception", method = RequestMethod.GET)
    public String restException() {
        throw new RestException(HttpStatus.METHOD_NOT_ALLOWED, "不同意");
    }

    @RequestMapping(value = "/null-pointer-exception", method = RequestMethod.GET)
    public String nullPointException() {
        throw new NullPointerException("null");
    }
}
