package com.openbootcamp.ejercicios;

//A los vectores no es necesario darles un tamano, se ajustan a ello, son un array dinamico

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1); //posicion 0
        vector.add(2); //posicion 1
        vector.add(3); //posicion 2
        vector.add(4); //posicion 3

        System.out.println("Datos del vector: " + vector);

        vector.remove(2);
        System.out.println("Datos del vector: " + vector);

        System.out.println("**************************************");

        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Valor del vector: " + vector.get(i) + " posicion: " + i);
        }
    }
}
