package com.evatlsong.archetype.web;

import com.evatlsong.archetype.domain.User;
import com.evatlsong.archetype.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evatlsong on 15-10-27.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> userList() {
        return userService.getAllUser();
    }
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String saveUser(User user) {
        userService.save(user);
        return "redirect:/users";
    }
}
