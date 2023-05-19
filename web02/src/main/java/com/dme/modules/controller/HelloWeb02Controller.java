package com.dme.modules.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shang
 * @date 2023-05-19-20:50
 */
@RestController
public class HelloWeb02Controller {
    @RequestMapping("/helloWeb02")
    public String helloWeb01(){
        System.out.println("helloWeb02。。。。。。。。。");
        return "helloWeb02";
    }
}
