package br.com.terapcontroll.cadastropessoas.person.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class PessoaController {

    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "essa é minha primeira mensagem nessa rota";
    }
}
