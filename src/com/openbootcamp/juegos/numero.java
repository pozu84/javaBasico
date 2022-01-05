package com.openbootcamp.juegos;

import java.util.Scanner;

public class numero {

    public static void main(String[] args) {
//        numero que se tiene que acertar
        int acertar = 15;
        Scanner sc = new Scanner(System.in);

        System.out.println("EL JUEGO DE LA ADIVINACION DEL NUMERO");
        System.out.println("         \n" +
                "        .-\" +' \"-.      \n" +
                "       /.'.'A_'*`.\\    \n" +
                "      |:.*'/\\-\\. ':|    \n" +
                "      |:.'.||\"|.'*:|\n" +
                "       \\:~^~^~^~^:/    \n" +
                "        /`-....-'\\      \n" +
                "       /          \\    \n" +
                "       `-.,____,.-'");


        int numero;
        do {
            System.out.println("Introduzca el numero: ");
            numero = sc.nextInt();

            if (numero < acertar) {
                System.out.println("El numero es mas alto");
                System.out.println("٩(͡๏̯͡๏)۶");
            } else if (numero > acertar) {
                System.out.println("El numero es mas bajo");
                System.out.println("٩(͡๏̯͡๏)۶");
            } else {
                System.out.println("Ha acertado el numero!!!!");
                System.out.println("ʕ•ᴥ•ʔ");
            }

        } while (numero != acertar);
    }
}
