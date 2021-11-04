package com.openbootcamp.primerospasos;

public class Arrays {

    public static void main(String[] args) {

        String nombre1 = "nombre 1";
        String nombre2 = "nombre 2";
        String nombre3 = "nombre 3";

        String[] nombres = new String[3];

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        System.out.println(nombres[0]);

        //Recorrer el array para imprimirlo

        System.out.println("IMPRESO CON EL BUCLE FOR");

        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        //Otra manera de anadir arrays equivalente a la anterior

        String[] nombres2 = new String[] {nombre1, nombre2, nombre3};
        System.out.println("IMPRESO DESDE EL ARRAY DE CORCHETES");
        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

    }
}
