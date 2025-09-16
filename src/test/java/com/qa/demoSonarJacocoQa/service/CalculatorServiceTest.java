package com.qa.demoSonarJacocoQa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.qa.demoSonarJacocoQA.service.CalculatorService;

public class CalculatorServiceTest {
    private final CalculatorService service = new CalculatorService();

    @Test
    void addWorks() {
        assertEquals(5, service.sumar(2,3));
    }

    @Test
    void divideWorks() {
        assertEquals(2, service.dividir(6,3));
    }

    @Test
    void divideByZeroThrows() {
        System.out.println("Se realizó 3 pruebas en CalculatorServiceTest");
        assertThrows(IllegalArgumentException.class, () -> service.dividir(1,0));
    }
}
