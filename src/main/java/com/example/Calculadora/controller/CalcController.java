package com.example.Calculadora.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/calc")
public class CalcController {
    @GetMapping("/resta/{a}/{b}")
    public int resta(@PathVariable int a, @PathVariable int b) {
        return a - b;
    }
    @GetMapping("/suma")
    public int suma(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
    @PostMapping("/multiplica")
    public int multiplica(@RequestBody Map<String, Integer> body) {
        int a = body.get("a");
        int b = body.get("b");
        return a * b;
    }
}
