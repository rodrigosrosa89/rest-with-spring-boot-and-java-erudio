package br.com.rodao.erudio.restwithspringbootandjavaerudio;

import lombok.Data;

@Data
public class Greeting {

    private final Long id;
    private final String content;

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }
}
