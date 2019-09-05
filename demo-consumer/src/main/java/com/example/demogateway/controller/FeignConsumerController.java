package com.example.demogateway.controller;

import com.example.demogateway.service.FeignConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @createTime Created in 2019/8/27 15:52
 */
@RestController
public class FeignConsumerController {

    @Autowired
    private FeignConsumerService feignConsumerService;

    @GetMapping("/feignSayHello")
    public String testHello() {
        feignConsumerService.hello();
        return "we did it!";
    }
}
