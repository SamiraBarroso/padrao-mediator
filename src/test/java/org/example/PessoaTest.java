package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void deveTrasnferirComercial(){
        Pessoa pessoa = new Pessoa("Jose");
        assertEquals("Sua chamada foi transferida para o setor comercial!", pessoa.falarComSetor(Comercial.getInstancia()));
    }

    @Test
    void deveTrasnferirFinanceira(){
        Pessoa pessoa = new Pessoa("Jose");
        assertEquals("Sua chamada foi transferida para o setor financeiro!", pessoa.falarComSetor(Financeiro.getInstancia()));
    }
}