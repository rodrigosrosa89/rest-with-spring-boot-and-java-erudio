package br.com.rodao.erudio.restwithspringbootandjavaerudio.controller;

import br.com.rodao.erudio.restwithspringbootandjavaerudio.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private MathService mathService;

    @GetMapping("sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) {
        return mathService.sum(numberOne, numberTwo);
    }

    @GetMapping("minus/{numberOne}/{numberTwo}")
    public Double minus(@PathVariable(value = "numberOne") String numberOne,
                        @PathVariable(value = "numberTwo") String numberTwo) {

        return mathService.minus(numberOne, numberTwo);
    }

    @GetMapping("multiply/{numberOne}/{numberTwo}")
    public Double multiply(@PathVariable(value = "numberOne") String numberOne,
                           @PathVariable(value = "numberTwo") String numberTwo) {

        return mathService.multiply(numberOne, numberTwo);
    }

    @GetMapping("divide/{numberOne}/{numberTwo}")
    public Double divide(@PathVariable(value = "numberOne") String numberOne,
                         @PathVariable(value = "numberTwo") String numberTwo) {

        return mathService.divide(numberOne, numberTwo);
    }

}
