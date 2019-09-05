package com.example.demogateway.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @createTime Created in 2019/8/27 15:52
 */
@FeignClient(name = "demo-server")
public interface FeignConsumerService {

    @GetMapping("/sayHello")
    public void hello();
}