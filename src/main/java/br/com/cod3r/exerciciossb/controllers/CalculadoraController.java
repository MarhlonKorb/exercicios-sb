package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}")
    public double somar(@PathVariable int a,@PathVariable int b){
        return a + b;
    }

    @GetMapping(path = "/subtrair")
    public double subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        return a - b;
    }

}
