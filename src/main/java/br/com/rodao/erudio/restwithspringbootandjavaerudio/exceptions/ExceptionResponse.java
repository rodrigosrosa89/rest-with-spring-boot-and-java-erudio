package br.com.rodao.erudio.restwithspringbootandjavaerudio.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Data
public class ExceptionResponse implements Serializable {

    private Date timestamp;
    private String message;
    private String details;
}
