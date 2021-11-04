package com.openbootcamp.primerospasos;

public class EjemploLista {

    String nombre = "nombre";

    public EjemploLista(){}

    public EjemploLista(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EjemploLista{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
