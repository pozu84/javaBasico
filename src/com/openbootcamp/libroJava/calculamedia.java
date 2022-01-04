package com.openbootcamp.libroJava;

import java.util.Scanner;

public class calculamedia {

    public static void main(String[] args) {

        double nota1;
        double notaDeseada;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la nota del primer examen: ");
        nota1 = sc.nextDouble();

        System.out.println("Escribe la nota que quieres sacar en el semestre: ");
        notaDeseada = sc.nextDouble();

        double nota2 = ((notaDeseada * 100) - (nota1 * 0.4))/60;

        System.out.println("Para sacar un " + notaDeseada + " tienes que sacar un " + nota2 + " el segundo examen");

        if (nota2 >= 10){
            System.out.println("Es imposible sacar mas de un 10 en el examen. Haber estudiado mas.");
        }

    }
}
