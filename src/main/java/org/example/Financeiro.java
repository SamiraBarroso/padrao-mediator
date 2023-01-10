package org.example;

public class Financeiro implements Setor {

    private static Financeiro instancia = new Financeiro();

    private Financeiro(){};

    public static Financeiro getInstancia(){
        return instancia;
    }

    @Override
    public String receberLigacao() {
        return "setor financeiro!";
    }
}