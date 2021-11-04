package com.openbootcamp.estructurasdecontrol;

public class Bucles {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println("El valor de i es: " + i);
        }

        //Array de strings
        String[] nombres = {"Vero", "Juanito", "Ruperta", "Llanos", "Zizou", "Fredy"};
        //Recorremos la longitud del array con el .lenght
        for (int i = 0; i < nombres.length; i++){
            System.out.println("El nombre es: " + nombres[i]);
        }

        //Array de numeros
        int[] numbers = {1, 2, 4, 6, 8};
        int suma = 0;
        //Recorremos la longitud del array con el .lenght
        for (int i = 0; i < numbers.length; i++){
            System.out.println("El numero es: " + numbers[i]);
            suma = suma + numbers[i];
            System.out.println("Suma: " + suma);
        }
        System.out.println("Suma fuera del for: " + suma);
    }
}
