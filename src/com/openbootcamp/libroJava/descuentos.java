package com.openbootcamp.libroJava;

import java.util.Scanner;

public class descuentos {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la base imponible: ");
        double base = sc.nextDouble();

        System.out.println("Introduzca el IVA: ");
        System.out.println("(1) 7%");
        System.out.println("(2) 10%");
        System.out.println("(3) 20%");
        double iva = sc.nextDouble();


        System.out.println("Introduzca el descuento: ");
        System.out.println("(1) 5 euros");
        System.out.println("(2) 10 euros");
        System.out.println("(3) 20 euros");
        double descuento = sc.nextDouble();


        System.out.println("Base imponible:\t\t\t " + base);

        //IVA del 7%
        if (iva == 1){
            if (descuento == 1){
                System.out.println("IVA (7%): \t\t\t\t\t" + (base * 0.07));
                double totalIva = base + (base * 0.07);
                System.out.println("TOTAL: \t\t\t\t\t" + (totalIva - 5));
            } else if (descuento == 2){
                System.out.println("IVA (7%): \t\t\t\t\t" + (base * 0.07));
                double totalIva = base + (base * 0.07);
                System.out.println("TOTAL: \t\t\t\t\t" + (totalIva - 10));
            } else if (descuento == 3){
                System.out.println("IVA (7%): \t\t\t\t\t" + (base * 0.07));
                double totalIva = base + (base * 0.07);
                System.out.println("TOTAL: \t\t\t\t\t" + (totalIva - 20));
            }

        //IVA del 10%
        } else if (iva == 2){
            if (descuento == 1){
                System.out.println("IVA (10%): \t\t\t\t\t" + (base * 0.10));
                double totalIva = base + (base * 0.10);
                System.out.println("TOTAL: \t\t\t\t\t" + (totalIva - 5));
            } else if (descuento == 2){
                System.out.println("IVA (10%): \t\t\t\t\t" + (base * 0.10));
                double totalIva = base + (base * 0.10);
                System.out.println("TOTAL: \t\t\t\t\t" + (totalIva - 10));
            } else if (descuento == 3){
                System.out.println("IVA (10%): \t\t\t\t\t" + (base * 0.10));
                double totalIva = base + (base * 0.10);
                System.out.println("TOTAL: \t\t\t\t\t" + (totalIva - 20));
            }

        else {
            if (descuento == 1){
                System.out.println("IVA (20%): \t\t\t\t\t" + (base * 0.20));
                double totalIva = base + (base * 0.20);
                System.out.println("TOTAL: \t\t\t\t\t" + (totalIva - 5));
            } else if (descuento == 2){
                System.out.println("IVA (20%): \t\t\t\t\t" + (base * 0.20));
                double totalIva = base + (base * 0.20);
                System.out.println("TOTAL: \t\t\t\t\t" + (totalIva - 10));
            } else if (descuento == 3){
                System.out.println("IVA (20%): \t\t\t\t\t" + (base * 0.20));
                double totalIva = base + (base * 0.20);
                System.out.println("TOTAL: \t\t\t\t\t" + (totalIva - 20));
            }
          }
        }
    }
}
