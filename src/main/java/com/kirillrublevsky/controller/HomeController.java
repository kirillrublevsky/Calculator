package com.kirillrublevsky.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @ResponseBody
    @RequestMapping(value = "/calculate", method = RequestMethod.POST)
    public String calculate(@RequestParam(value = "first", required = true) double first,
                            @RequestParam(value = "operation", required = true) String operation,
                            @RequestParam(value = "second", required = true) double second) {

        String result;

        switch (operation) {
            case "+":
                result = Double.toString(first + second);
                break;
            case "-":
                result = Double.toString(first - second);
                break;
            case "*":
                result = Double.toString(first * second);
                break;
            case "/":
                result = Double.toString(first / second);
                break;
            default:
                result = Double.toString(first + second);
                break;
        }
        return result;
    }
}