package com.openbootcamp.tutoriapoo.interfaces;

public class Vehiculo implements Imprimible{

    public int numRuedas;
    public String ficheroModelo;
    public float cilindrada;

    public Vehiculo(){
        numRuedas = 4;
        ficheroModelo = "vehiculo.jpx";
        cilindrada = 50.5f;
    }

    @Override
    public void imprimir() {
        System.out.println("Tipo Edificio: " + numRuedas + " " + cilindrada + " " + ficheroModelo);
    }
}
