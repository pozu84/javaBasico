package com.openbootcamp.libroJava;

import java.util.Scanner;

public class aritmeticos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba dos numeros: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Elija la operacion que quiere: ");
        System.out.println("(1) Suma");
        System.out.println("(2) Resta");
        System.out.println("(3) Multiplicacion");
        System.out.println("(4) Division");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado = " + (num1 * num2));
                break;

            case 4:
                System.out.println("Resultado = " + (num1 / num2));
                break;

            default:
                System.out.println("OPCION INCORRECTA");
        }

    }
}
