package com.openbootcamp.libroJava;

import java.util.Scanner;

public class ejercicio21 {

    public static void main(String[] args) {

        System.out.println("CALCULA TU NOTA EN PROGRAMACION");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nota del primer control: ");
        int nota1 = sc.nextInt();

        System.out.println("Nota del segundo control: ");
        int nota2 = sc.nextInt();

        int media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Nota del primer control: " + nota1);
            System.out.println("Nota del segundo control: " + nota2);
            System.out.println("Tu nota de Programacion es: " + media);
        } else {
            System.out.println("Resultado de la recuperacion: (1)APTO (2)NO APTO");
            int apto = sc.nextInt();

            if(apto == 1){
                System.out.println("Nota del primer control: " + nota1);
                System.out.println("Nota del segundo control: " + nota2);
                System.out.println("Resultado de la recuperacion: APTO");
                System.out.println("Tu nota de Programacion es 5 ");
            } else {
                System.out.println("Nota del primer control: " + nota1);
                System.out.println("Nota del segundo control: " + nota2);
                System.out.println("Tu nota de Programacion es: " + media);
            }

        }
    }
}
