package com.openbootcamp.primerospasos;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");

        System.out.println(nombres);

        //Utilizamos el for each para imprimirlo

        for (String nombre: nombres){
            System.out.println(nombre);
        }

        //Podemos crear listas de las clases que tenemos creadas

        List<EjemploLista> ejemplo = new ArrayList<>();

        ejemplo.add(new EjemploLista("juanito"));
        ejemplo.add(new EjemploLista("pepito"));
        ejemplo.add(new EjemploLista("josete"));

        System.out.println(ejemplo);

        for (EjemploLista lista: ejemplo){
            System.out.println(lista);
        }
    }
}
