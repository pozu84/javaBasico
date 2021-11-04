package com.openbootcamp.primerospasos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            boolean ok = false;
            do {
                System.out.println("Introduce dos numeros: ");
                sc.reset();
                try {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("Numeros invalidos");
                }
            } while (!ok);

    }
}
