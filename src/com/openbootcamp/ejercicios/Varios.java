package com.openbootcamp.ejercicios;

import java.util.Scanner;

public class Varios {
    public static void main(String[] args) {
        /*int num1 = 18;
        int num2 = 73;

        if (num1 > num2){
            System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
        } else if (num1 < num2){
            System.out.println("El numero " + num1 + " es menor que el numero " + num2);
        } else{
            System.out.println("Los numeros son iguales");
        }*/

       /* Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre);*/


        String[] nombres = {"Vero", "Jose", "Juanito"};

        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");

        }
    }
}
