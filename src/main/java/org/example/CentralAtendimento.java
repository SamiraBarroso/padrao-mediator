package org.example;

public class CentralAtendimento {

    private static CentralAtendimento instancia = new CentralAtendimento();

    private CentralAtendimento(){};

    public static CentralAtendimento getInstancia(){
        return instancia;
    }

    public String transferirChamada(Setor setor){
        return  "Sua chamada foi transferida para o " + setor.receberLigacao();
    }

}