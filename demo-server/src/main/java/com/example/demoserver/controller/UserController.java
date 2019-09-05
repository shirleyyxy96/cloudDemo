package com.example.demoserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @createTime Created in 2019/8/27 15:08
 */
@RestController
public class UserController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/get")
    public String getPort() {
        return "Producer Server port: " + port;
    }

    @GetMapping("/sayHello")
    public String sayHello() {
        System.out.println("server-sayHello");
        return "server received!";
    }
}
