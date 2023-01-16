package br.com.rodao.erudio.restwithspringbootandjavaerudio.service;

import br.com.rodao.erudio.restwithspringbootandjavaerudio.exceptions.UnsupportedMathOperationException;
import org.springframework.stereotype.Service;

import static br.com.rodao.erudio.restwithspringbootandjavaerudio.constants.AppConstants.ERROR_MESSAGE_NOT_NUMBER;
import static br.com.rodao.erudio.restwithspringbootandjavaerudio.util.MathUtils.isNumeric;

@Service
public class MathServiceImpl implements MathService {

    public Double sum(String numberOne, String numberTwo) {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(ERROR_MESSAGE_NOT_NUMBER);
        }
        return Double.sum(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));
    }

    public Double minus(String numberOne, String numberTwo) {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(ERROR_MESSAGE_NOT_NUMBER);
        }

        return Double.parseDouble(numberOne) - Double.parseDouble(numberTwo);
    }

    public Double multiply(String numberOne, String numberTwo) {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(ERROR_MESSAGE_NOT_NUMBER);
        }
        return Double.parseDouble(numberOne) * Double.parseDouble(numberTwo);
    }

    public Double divide(String numberOne, String numberTwo) {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(ERROR_MESSAGE_NOT_NUMBER);
        }
        return Double.parseDouble(numberOne) / Double.parseDouble(numberTwo);
    }

}
