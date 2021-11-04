package com.openbootcamp.poo.clases;

public class Vehiculo {

    //1. Atributos
    protected String fabricante;
    protected String model;
    double cc;
    int year;
    String color;
    boolean sport;
    int speed;
    Motor motor;

    //2. Constructores
    public Vehiculo(){

    }

    public Vehiculo(String fabricante, String model, double cc, int year, String color, boolean sport){
        this.fabricante = fabricante;
        this.model = model;
        this.cc = cc;
        this.year = year;
        this.color = color;
        this.sport = sport;
    }

    public Vehiculo(String fabricante, String model){
        this.fabricante = fabricante;
        this.model = model;
    }

    public Vehiculo(String fabricante, String model, double cc, int year, String color, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.model = model;
        this.cc = cc;
        this.year = year;
        this.color = color;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    //3. Metodos (comportamiento)
    public void acelerar(int kmh){
        this.speed += kmh;
    }

    //gettet y setter
}
