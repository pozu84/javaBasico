package com.openbootcamp.tutoriapoo.interfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Imprimible> objetos = new ArrayList<Imprimible>();

        Edificio miCasa = new Edificio();
        Animal gorila = new Animal();
        Vehiculo audi = new Vehiculo();

        objetos.add(miCasa);
        objetos.add(gorila);
        objetos.add(audi);


        for (Imprimible objeto : objetos){
            objeto.imprimir();
        }



    }
}
