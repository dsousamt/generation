package com.example.Aula26E1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/bsms")
    public String generationBSMs() {
        return "Persistência\n" +
                "Mentalidade de Crescimento\n" +
                "Orientação ao Futuro\n" +
                "Responsabilidade Pessoal\n" +
                "Trabalho em Equipe\n" +
                "Comunicação\n" +
                "Orientação aos Detalhes\n" +
                "Proatividade";
    }

    @RequestMapping("/meus-objetivos")
    public String listaObjetivos() {
        return "Aprender Spring\n" +
                "Praticar SQL\n" +
                "Exercitar o Java";
    }
}
