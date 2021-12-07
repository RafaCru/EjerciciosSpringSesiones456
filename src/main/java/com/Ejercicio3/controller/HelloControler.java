package com.Ejercicio3.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
   @GetMapping("/Hola2")
    public String Retorna(){
        return "Hola Coca-Cola";
    }
}
