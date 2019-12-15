package ru.podkovyrov.testtravis.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/hello")
    public String welcome(){
        return "Hello, world!";
    }

    @GetMapping(path = "/hello", params = "name")
    public String welcomeUsername(@RequestParam("name") String name){
        return "Hello, " + name + "!";
    }
}
