/*En una fiesta hay un numero de personas desconocidas que no conocemos
* pregunta por el numero de personas desconocidas que hay, escribe su nombre y saludalas*/

package com.openbootcamp.libroJava;

import java.util.Scanner;

public class problema117 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas personas desconocidas hay en la fiesta");
        int personasDesconocidas = sc.nextInt();

        for (int i = 0; i < personasDesconocidas; i++) {
            System.out.println("Soy: ");
            String nombre = sc.next();
            System.out.println("Hola " + nombre);
        }
    }
}
