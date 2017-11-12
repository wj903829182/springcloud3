package com.jack.some.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by jack 2017/11/11
 */
@RestController
public class SomeController {
    /**
     * 下面是通过@Value注入的值来自于Config Server
     */
    @Value("${my.message}")
    private String message;

    @RequestMapping(value = "/getsome")
    public String getsome() {
        return message;
    }
}
