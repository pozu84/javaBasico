package com.openbootcamp.libroJava;

import java.util.Scanner;

public class cajaFuerte {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        int numIntroducido;
        boolean acertado = false;

        do {
            System.out.println("Introduce la clave: ");
            numIntroducido = sc.nextInt();

            if (numIntroducido == 1234) {
                System.out.println("Clave correcta");
                acertado = true;
            } else {
                System.out.println("Clave incorrecta");
            }
            intentos++;

        } while (intentos < 5 && numIntroducido != 1234);

        if (acertado) {
            System.out.println("Gracias");
        } else {
            System.out.println("Ha consumido todos los intentos");
        }

    }
}
