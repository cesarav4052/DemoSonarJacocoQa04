package com.qa.demoSonarJacocoQA.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a,int b){
        return a - b;
    }

    public int multiplicar(int a,int b){
        return a * b;
    }

    public int dividir(int a,int b){
        if (b == 0) {
            throw new IllegalArgumentException("Denominador incorrecto, división por cero");
        }
        return a / b;
    }
}
