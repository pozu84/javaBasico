package com.openbootcamp.poo.sininterfaces;

public class Empleado {

    //2. Atributos
    String nombre;
    int edad;
    double salario;
    boolean alta;

    //2. Construccores
    public Empleado(){

    }

    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

    //metodo to string para que a la hora de imprimir no muestre la referencia a memoria si no como tipo string
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
