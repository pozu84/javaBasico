package com.openbootcamp.ejercicios;


import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayL {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        for (String s : lista) {
            System.out.println(s);
        }

        System.out.println("Contenido: " + lista);

        lista.remove("Elemento B");
        System.out.println("Contenido tras borrado: " + lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        //Convertir arrayList en array

        String array[] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++){
            array[i] = lista.get(i);
        }
        System.out.println("Conversion: " + array);

        System.out.println("********************************");

        LinkedList<String> listaEnlazada = new LinkedList<String>();



    }


}
