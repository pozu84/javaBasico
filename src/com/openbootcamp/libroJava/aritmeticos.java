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

        System.out.println("*******************************************************");

        System.out.println("CALCULO DE AREAS");
        System.out.println("----------------");
        System.out.println("Elija la opcion deseada");
        System.out.println("(1) Cuadrado");
        System.out.println("(1) Triangulo");
        System.out.println("(1) Rectangulo");

        int seleccion = sc.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println("Indique la base del cuadrado: ");
                int area = sc.nextInt();
                System.out.println(area * 2);
                break;
            case 2:
                System.out.println("Escriba la base del triangulo: ");
                double base = sc.nextDouble();
                System.out.println("Escriba la altura del triangulo: ");
                double altura = sc.nextDouble();
                System.out.println((base * altura)/2);
                break;
            case 3:
                System.out.println("Escriba la base del rectangulo: ");
                int baseRectangulo = sc.nextInt();
                System.out.println("Escriba la altura del rectangulo: ");
                int alturaRectangulo = sc.nextInt();
                System.out.println(baseRectangulo * alturaRectangulo);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }

    }


}
