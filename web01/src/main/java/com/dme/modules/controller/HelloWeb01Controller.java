package com.dme.modules.controller;

import com.dme.modules.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shang
 * @date 2023-05-19-20:50
 */
@RestController
public class HelloWeb01Controller {

    @Autowired
    private UserService userService;

    @RequestMapping("/helloWeb01")
    public String helloWeb01() {
        userService.testServiceFunction();
        System.out.println("controller,helloWeb01。。。。。。。。。");
        return "helloWeb01";
    }
}
