package com.openbootcamp.ejercicios;
//para generar excepciones
public class Throws {

    public static void main(String[] args) {

        divide(4, 2);

    }
    //se pueden poner multiples excepciones tras el throws
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
}
