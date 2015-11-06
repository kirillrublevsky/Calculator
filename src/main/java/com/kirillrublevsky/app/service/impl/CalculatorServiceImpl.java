package com.kirillrublevsky.app.service.impl;

import com.kirillrublevsky.app.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double calculate(double first, String operation, double second) {

        double result = 0.0;

        switch (operation) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
        }
        return result;
    }
}
