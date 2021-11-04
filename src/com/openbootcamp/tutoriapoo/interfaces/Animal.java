package com.openbootcamp.tutoriapoo.interfaces;

public class Animal implements Imprimible{

    public float anchura;
    public float altura;
    public String ficheroModelo;

    public Animal(){
        anchura = 2;
        altura = 1.5f;
        ficheroModelo = "animal.jpx";
    }

    @Override
    public void imprimir() {
        System.out.println("Tipo Animal: " + anchura + " " + altura + " " + ficheroModelo);
    }
}
