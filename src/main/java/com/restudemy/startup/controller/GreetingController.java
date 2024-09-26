package com.restudemy.startup.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/greeting")
@RestController
public class GreetingController {

    @GetMapping("/{name}")
    private String test(@PathVariable String name){
        return "hello " + name;
    }
    
}
