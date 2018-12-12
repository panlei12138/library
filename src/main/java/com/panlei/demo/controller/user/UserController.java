package com.panlei.demo.controller.user;

import com.panlei.demo.bean.User;
import com.panlei.demo.bean.response.BaseRes;
import com.panlei.demo.controller.book.BookController;
import com.panlei.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public BaseRes register(@RequestBody User user) {
        LOGGER.info("[BookController] execute register!");
        return userService.register(user);
    }

    @RequestMapping("/login")
    public BaseRes login(@RequestBody User user) {
        LOGGER.info("[BookController] execute login!");
        return userService.login(user);
    }

}
