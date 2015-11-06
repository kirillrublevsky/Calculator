package com.kirillrublevsky.app.controller;

import com.kirillrublevsky.app.service.CalculatorService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {

    @Mock
    private CalculatorService calculatorService;

    @InjectMocks
    private CalculatorController calculatorController;

    @BeforeClass
    public static void beforeClassMessage() {
        System.out.println("CalculatorController testing starts\n");
    }

    @Test
    public void testCalculateMethodInvokesServiceCalculate() {
        double first = 20.2;
        double second = 30.3;
        String operation = "+";
        calculatorController.calculate(first, operation, second);
        verify(calculatorService, times(1)).calculate(first, operation, second);
    }

    @AfterClass
    public static void afterClassMessage() {
        System.out.println("CalculatorController testing is finished");
    }
}
