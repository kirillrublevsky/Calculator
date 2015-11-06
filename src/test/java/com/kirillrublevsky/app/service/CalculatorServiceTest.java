package com.kirillrublevsky.app.service;

import com.kirillrublevsky.app.service.impl.CalculatorServiceImpl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

    private CalculatorService calculatorService = new CalculatorServiceImpl();

    @BeforeClass
    public static void beforeClassMessage() {
        System.out.println("CalculatorService testing starts\n");
    }

    @Test
    public void testAdditionOperation() {
        assertEquals(50.5111, calculatorService.calculate(20.2, "+", 30.3111), 0);
    }

    @Test
    public void testDeductionOperation() {
        assertEquals(6.5, calculatorService.calculate(10, "-", 3.5), 0);
    }

    @Test
    public void testMultiplicationOperation() {
        assertEquals(12.25, calculatorService.calculate(5, "*", 2.45), 0);
    }

    @Test
    public void testDivisionOperation() {
        assertEquals(3.3333333333333335, calculatorService.calculate(10, "/", 3), 0);
    }

    @Test
    public void testDivisionByZeroOperation() {
        assertEquals(Double.POSITIVE_INFINITY, calculatorService.calculate(10, "/", 0), 0);
    }

    @Test
    public void testBigNumbersMultiplicationOperation() {
        assertEquals(9.99999999899E15, calculatorService.calculate(999999999.999, "*", 9999999.999), 0);
    }

    @Test
    public void testNaNOperation() {
        assertEquals(Double.NaN, calculatorService.calculate(Double.NaN, "+", 10.5), 0);
    }

    @AfterClass
    public static void afterClassMessage() {
        System.out.println("CalculatorService testing is finished");
    }
}
