package com.example.ssm_test01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MyController {
    @GetMapping("/name")
    public Map get()
    {
        return Map.of("name","bo");
    }
}
