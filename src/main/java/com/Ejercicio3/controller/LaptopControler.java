package com.Ejercicio3.controller;


import com.Ejercicio3.entities.Laptop;
import com.Ejercicio3.repository.Laptoprepository;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopControler {
    private Laptoprepository laptoprepository;

    public LaptopControler(Laptoprepository laptoprepository) {
        this.laptoprepository = laptoprepository;
    }

    @GetMapping("/ListaLaptop")
    public List<Laptop> listaLaptop(){
        return laptoprepository.findAll();
    }
    @PostMapping("/Laptop")
    public Laptop crear(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        return laptoprepository.save(laptop);
    }
}
