package com.mirian.app.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class HelloRestController {
    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello World!";
    }
}
