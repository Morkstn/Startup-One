package com.br.mjv.starupOne.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignInController {

    @GetMapping("/entrar")
    public String exibirFormularioLogin() {
        return "SignIn";
    }

    @PostMapping("/entrar")
    public String logar(@RequestParam String email, @RequestParam String password, Model model) {
        // Validar as credenciais do usuário
        // Se as credenciais forem válidas, autenticar o usuário e redirecioná-lo para a página inicial
        // Se as credenciais forem inválidas, exibir uma mensagem de erro

        return "sucesso";
    }
}