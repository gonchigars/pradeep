package com.example.dileep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping("/endpoint")
    public String method1() {
        return "hello meet my amigo dileep";
    }
}
