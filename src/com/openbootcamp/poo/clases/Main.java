package com.openbootcamp.poo.clases;

import com.openbootcamp.poo.herencia.Camion;
import com.openbootcamp.poo.herencia.Moto;

public class Main {

    public static void main(String[] args) {

        //Clase identificador = new Clase()
        //Crear un objeto con el constructor vacio
        //Vehiculo ferrari = new Vehiculo():

        //Crear un objeto con el constructor vacio
        Vehiculo seat = new Vehiculo();

        //Crear un objeto con el constructor con parametros
        Vehiculo volskwagen = new Vehiculo("VW", "polo", 125, 2007, "rojo", true);
        System.out.println(volskwagen.fabricante);
        System.out.println(volskwagen.model);

        imprimir();

        //Crear un objeto utilizando el objeto motor
        Motor motorGTI = new Motor("GTI", 118,250);

        Vehiculo fiat = new Vehiculo("Fiat", "punto", 100, 2020, "Blanco", false, 110, motorGTI);
        System.out.println(fiat.fabricante);
        System.out.println(fiat.model);
        System.out.println(fiat.cc);
        System.out.println(fiat.year);
        System.out.println(fiat.color);
        System.out.println(fiat.sport);
        System.out.println(fiat.speed);
        System.out.println(fiat.motor.caballos);
        System.out.println(fiat.motor.cilindros);
        System.out.println(fiat.motor.modelo);

        imprimir();

        Vehiculo toyota = new Vehiculo("toyota", "prius");
        System.out.println(toyota.fabricante);
        System.out.println(toyota.model);

        imprimir();

        //Llamamos al metodo acelerar y le asignamos un valor
        System.out.println(toyota.speed);
        toyota.acelerar(110);
        System.out.println(toyota.speed);

        imprimir();

       /* Accediendo a nuestras clases heredadas, para poder acceder a las clases de otro objeto tenemos que indicarle en
        los atributos protected, en este caso accedemos sin superconstructor*/
        Moto jog = new Moto();
        jog.fabricante = "Yamaha";
        System.out.println(jog.fabricante);

        imprimir();

        Camion iveco = new Camion("Volvo", "Pegasus", 2000);
        System.out.println(iveco.fabricante);
        System.out.println(iveco.model);
        System.out.println(iveco.carga);


    }

    public static void imprimir(){
        System.out.println("                           ");
        System.out.println("***************************");
        System.out.println("                           ");
    }


}
