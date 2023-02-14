package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("demo")
@RestController
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("test")
    public String test() {
        return serverPort;
    }



}
