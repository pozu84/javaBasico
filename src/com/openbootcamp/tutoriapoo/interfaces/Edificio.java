package com.openbootcamp.tutoriapoo.interfaces;

public class Edificio implements Imprimible{

    public int plantas;
    public String ficheroModelo;
    public float metros;

    public Edificio(){
        plantas = 7;
        ficheroModelo = "casa.jpx";
        metros = 100.7f;
    }


    @Override
    public void imprimir() {
        System.out.println("Tipo Edificio: " + plantas + " " + metros + " " + ficheroModelo);
    }

}
