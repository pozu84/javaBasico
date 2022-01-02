package com.openbootcamp.libroJava;

import java.util.Scanner;

public class salidaDeDatos {
    public static void main(String[] args){
        System.out.println("SPANISH\t\t\t\t" + "ENGLISH");
        System.out.println("*******\t\t\t\t" + "********");
        System.out.println("GATO\t\t\t\t" + "CAT");
        System.out.println("PERRO\t\t\t\t" + "DOG");
        System.out.println("AGUA\t\t\t\t" + "WATER");

        imprimir();

        //Calculadora de euros

        int euros;
        int pesetas = 167;
        int total;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca los euros: ");
        euros = sc.nextInt();
        total = euros * pesetas;

        System.out.println("El precio en pesetas de " + euros + " euros son " + total + " pesetas");

        imprimir();

        //Calculadora de IVA

        double precio;
        double iva = 0.16;
        double totalIva;

        System.out.println("Introduzca el precio para calcular su IVA");
        precio = sc.nextDouble();
        totalIva = (precio * iva) + precio;

        System.out.println("EL precio con IVA de " + precio + " euros son " + totalIva + " euros");

        System.out.println("Escribe tu nombre: ");
        String nombre = sc.next();
        System.out.println("Hola " + nombre);


    }



    public static void imprimir(){
        System.out.println("*******************************************");
    }

}
