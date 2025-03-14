package com.SpringbootExamen.daw.es.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hola desde Docker y Springboot";
    }

    @PutMapping("/crearHello")
    public String crearHello (){
        return "Hola desde put";
    }

    @PostMapping("/actualizarHello{id}")
    public String actualizarHello(@PathVariable Long id){
        return "Hola desde post " + id + "actualizado correctamente";
    }
}
