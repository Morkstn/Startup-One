package com.br.mjv.starupOne.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/home")
    public String exibirPaginaPrincipal() {
        return "Home";
    }
}
