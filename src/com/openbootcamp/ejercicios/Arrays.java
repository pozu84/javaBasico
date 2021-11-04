package com.openbootcamp.ejercicios;

public class Arrays {

    public static void main(String[] args) {

        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        for (int i = 0; i < arrayUno.length; i++){
            System.out.println(arrayUno[i]);
        }

        for (int i: arrayUno){
            System.out.println("Imprimiendo desde for each: " + i);
        }

        //Otra forma de declarar los arrays
        int arrayDos[] = {1, 2, 3, 4, 5};

        for (int i: arrayDos){
            System.out.println(i);
        }

        System.out.println("**********************************************");

        String nombres[] = {
                "Pepe",
                "Juan",
                "Carmen"
        };

        for (String i : nombres){
            System.out.println(i);
        }

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Impreso for normal: " + nombres[i] + " en posicion: " + i);
        }

        System.out.println("Longitud del array de nombres: " + nombres.length);

        System.out.println("**********************************************");
        System.out.println("ARRAY BIDIMENSIONAL");
        //[filas][columnas]
        int arrayBidimensional[][] = new int[2][4];
        arrayBidimensional[0][0] = 1;
        arrayBidimensional[0][1] = 2;
        arrayBidimensional[0][2] = 3;
        arrayBidimensional[0][3] = 4;

        arrayBidimensional[1][0] = 10;
        arrayBidimensional[1][1] = 20;
        arrayBidimensional[1][2] = 30;
        arrayBidimensional[1][3] = 40;

        for (int i = 0; i < arrayBidimensional.length; i++){
            for (int j = 0; j < arrayBidimensional[i].length; j++){
                System.out.println(" " + i + " " + j);
                System.out.println(arrayBidimensional[i][j]);
            }
        }

        System.out.println("ARRAY BIDIMENSIONAL 2");

        int arrayBidimensionalDos[][] = {
            {1, 2, 3, 4},
            {10, 20, 30, 40}
        };

        for (int i = 0; i < arrayBidimensionalDos.length; i++){
            for (int j = 0; j < arrayBidimensionalDos[i].length; j++){
                System.out.println(" _ " + "_ ");
                System.out.println(" " + i + " " + j + " = " + arrayBidimensional[i][j]);
            }
        }


    }
}
