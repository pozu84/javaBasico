package com.openbootcamp.ejercicios;

import java.util.Scanner;

public class GestionErrores {

    public static void main(String[] args) {

        System.out.println("Introduce dos numeros:");
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        try {
            int resultado = numero1/numero2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("ERROR ARITMETICO!!!");
        } catch (Exception e){
            System.out.println("Excepcion no aritmetica");
        } finally {
            System.out.println("Finally");
        }

    }
}
