package com.qa.demosonarjacocoqa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.qa.demosonarjacocoqa.service.CalculatorService;

@RestController
@RequestMapping("/api/calc")
public class CalculatorController {
    private final CalculatorService calc;

    public CalculatorController(CalculatorService calc) {
        this.calc = calc;
    }

    @GetMapping("/add")
    public ResponseEntity<Integer> add(@RequestParam int a, @RequestParam int b){
        return ResponseEntity.ok(calc.sumar(a,b));
    }

    @GetMapping("/divide")
    public ResponseEntity<Integer> divide(@RequestParam int a, @RequestParam int b){
        return ResponseEntity.ok(calc.dividir(a,b));
    }

}
