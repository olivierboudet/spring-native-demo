package com.example.demo;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RestControllerEndpoint(id = "hello")
public class HelloActuator {
    @ResponseBody
    @GetMapping
    public String hello() {
        return "hello";
    }
}
