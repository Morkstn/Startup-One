package com.br.mjv.starupOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "Olá, mundo!";
    }
}
