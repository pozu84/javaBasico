package com.openbootcamp.primerospasos;

public class Funciones {

    public static void main(String[] args) {

        showMenu();

        //En este caso tenemos que guardar la variable para poder usarla, o bien, imprimir directamente el metodo
        String menu = showMenuString();
        System.out.println(menu);


        System.out.println(showMenuString());

        //Funcion con parametros y sin tipo de retorno
        imprimirSaludo("Hola buenos dias");
        imprimirSaludo("hola");

        //Funcion con parametros y con tipo de retorno
        String name = "Vero";
        String surname = "Pozuelo";
        String saludo = obtenerSaludo(name, surname);
        System.out.println(saludo);


        int resultadoSuma = suma(50, 200);
        System.out.println(resultadoSuma);

        //Funcion devolver IVA
        double precioTotal = precioSinIva(20);
        System.out.println(precioTotal);

    }

    static double precioSinIva(int precio) {
        return (precio * 0.21) + precio;
    }

    static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static void showMenu(){
        System.out.println("Bienvenidos, elija la opcion: ");
        System.out.println("1 - Comprar ");
        System.out.println("2 - Pasar por caja ");
        System.out.println("3 - Salir");
    }

    static String showMenuString(){
        return "Mostrar con llamada static String";
    }

    static void imprimirSaludo(String saludo){
        System.out.println(saludo);
    }

    static String obtenerSaludo(String nombre, String apellido){
        return ("Buenas tardes "+ nombre + " " + apellido);
    }
}
