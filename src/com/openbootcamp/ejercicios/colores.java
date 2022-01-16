package com.openbootcamp.ejercicios;

import java.util.Scanner;

public class colores {

    public static void main(String[] args) {

        String rojo = "\033[31m";
        String verde= "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String blanco = "\033[36m";

        System.out.println(rojo + "sangre");
        System.out.println(verde + "hierba");
        System.out.println(naranja + "mandarina");
        System.out.println(azul + "cielo");
        System.out.println(morado + "moras");
        System.out.println(blanco + "limpieza");

        /*Uso del tabulador con \t*/
        System.out.println(verde + "verde\t" + rojo+ "rojo\t" +  blanco + "blanco\t" );

        System.out.println("******************************************");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cantidad en euros: ");
        int euros = sc.nextInt();
        int pesetas = euros * 166;

        System.out.println("La conversion a pesetas es: " + pesetas);



    }
}
