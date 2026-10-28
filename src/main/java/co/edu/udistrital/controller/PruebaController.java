package co.edu.udistrital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba")
public class PruebaController {

    @GetMapping("/saludo")
    public String obtenerSaludo() {
        return "Taller componentes Juan David Casas Gonzalez // 20232578052";
    }
}