package org.example;


public class Comercial implements Setor{

    private static Comercial instancia = new Comercial();

    private Comercial(){};

    public static Comercial getInstancia(){
        return instancia;
    }

    @Override
    public String receberLigacao() {
        return "setor comercial!";
    }
}