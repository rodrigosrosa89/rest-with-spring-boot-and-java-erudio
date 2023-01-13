package br.com.rodao.erudio.restwithspringbootandjavaerudio.controller;

import br.com.rodao.erudio.restwithspringbootandjavaerudio.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("sum/{numberOne}/{numberTwo}")
    public Double greeting(@PathVariable(value = "numberOne") String numberOne,
                         @PathVariable(value = "numberTwo") String numberTwo) {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Parâmetros devem ser números");
        }
        return Double.sum(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));
    }

    public boolean isNumeric(String s)
    {
        if (s == null || s.isEmpty()) {
            return false;
        }
        return s.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
