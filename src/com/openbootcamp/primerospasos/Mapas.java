package com.openbootcamp.primerospasos;

import java.util.HashMap;
import java.util.Map;

//Estructura de datos que nos permiten trabajar con pares de clave valor, hay distintos tipos de mapas (manual)
public class Mapas {

    public static void main(String[] args) {
        //Especificamos el tipo de dato que queremos utilizar, se pueden usar clases
        Map<String, String> personas = new HashMap<>();

        personas.put("47082777Y", "pozu84");
        personas.put("1234567", "porfaplis");
        personas.put("2345674", "vpozuelo");

        System.out.println(personas);

        for (String key: personas.keySet()){
            System.out.println(key);
        }

        for (String value: personas.values()){
            System.out.println(value);
        }

        for (Map.Entry<String, String>entry: personas.entrySet()){
            System.out.println(entry);
        }

        for (Map.Entry<String, String> todo: personas.entrySet()){
            System.out.println(todo.getKey() + " " + todo.getValue());
        }

    }

}
