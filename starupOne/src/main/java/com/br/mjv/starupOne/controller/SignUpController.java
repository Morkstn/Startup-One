package com.br.mjv.starupOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {

    @GetMapping("/cadastrar")
    public String exibirFormularioCadastro() {
        return "SignUp";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(@RequestParam String nome, @RequestParam String email, Model model) {
        // Processar os dados do formulário, salvar no banco de dados, etc.
        // Você pode adicionar lógica aqui

        model.addAttribute("mensagem", "Cadastro realizado com sucesso!");
        return "sucesso";
    }
}
