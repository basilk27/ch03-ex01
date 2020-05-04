package com.mbsystems.ch03ex01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello31")
    public String hello() {
        return "Basil31";
    }
}
