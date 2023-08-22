package com.calculadorawebsimples.calculadora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculadoraController {

    @GetMapping("/calculadora")
    public String mostrarCalculadora() {
        return "calculadora";
    }

    @PostMapping("/calcular")
    public String calcular(@RequestParam Integer valorUm, @RequestParam Integer valorDois, @RequestParam Integer operacao, Model model) {
        Integer resultado = null;

        if (operacao == 1) {
            resultado = valorUm + valorDois;
        } else if (operacao == 2) {
            resultado = valorUm - valorDois;
        } else if (operacao == 3) {
            resultado = valorUm * valorDois;
        } else if (operacao == 4) {
            resultado = valorUm / valorDois;
        }

        model.addAttribute("resultado", resultado);
        return "resultado";
    }
}

