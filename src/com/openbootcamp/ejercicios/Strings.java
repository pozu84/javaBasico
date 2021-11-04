package com.openbootcamp.ejercicios;

import java.util.Locale;

public class Strings {

    public static void main(String[] args) {

        String cadena = "Mensaje de texto";
        int cadenaLongitud = cadena.length();
        System.out.println("La longitud de la cadena es: " + cadenaLongitud);

        String cadenaMinus = cadena.toLowerCase();
        System.out.println("La cadena en minusculas es: " + cadenaMinus);

        String cadenaMayus = cadena.toUpperCase();
        System.out.println("La cadena en mayusculas es: " + cadenaMayus);

        char letra = cadena.charAt(5);
        System.out.println("La letra en la posicion buscada es: " + letra);

        //Recorrer el array de texto y buscar _
        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == ' '){
                System.out.println("Caracter _");
            } else {
                System.out.println("Caracter: " + cadena.charAt(i));
            }
            //System.out.println("Caracter: " + cadena.charAt(i));
        }

        //Para distintos metodos para trabajar con Strings manual de java
    }
}
