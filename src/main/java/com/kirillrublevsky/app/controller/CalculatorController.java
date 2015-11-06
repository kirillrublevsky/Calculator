package com.kirillrublevsky.app.controller;

import com.kirillrublevsky.app.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @ResponseBody
    @RequestMapping(value = "/calculate", method = RequestMethod.POST)
    public double calculate(@RequestParam(value = "first", required = true) double first,
                            @RequestParam(value = "operation", required = true) String operation,
                            @RequestParam(value = "second", required = true) double second) {

        return calculatorService.calculate(first, operation, second);
    }
}