package com.qa.demoSonarJacocoQa.controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.qa.demosonarjacocoqa.controller.CalculatorController;
import com.qa.demosonarjacocoqa.service.CalculatorService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private CalculatorService calc;

    @Test
    void addEndpoint() throws Exception {
        when(calc.sumar(2,3)).thenReturn(5);

        mvc.perform(get("/api/calc/add")
                .param("a","2").param("b","3"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
        
        System.out.println("Se realizó 1 prueba en CalculatorControllerTest");

        verify(calc, times(1)).sumar(2,3);
    }

    @Test
    void divideEndpoint() throws Exception {
        when(calc.dividir(8,2)).thenReturn(4);

        mvc.perform(get("/api/calc/divide")
                .param("a","8").param("b","2"))
                .andExpect(status().isOk())
                .andExpect(content().string("4"));
        
        System.out.println("Se realizó prueba 02 en CalculatorControllerTest");

        verify(calc, times(1)).dividir(8,2);
    }
}
