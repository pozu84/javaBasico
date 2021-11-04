package com.openbootcamp.tutoriapoo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Usuario pepe = new Usuario();
        pepe.nombre = "Pepe";
        pepe.pass = "1234";

        System.out.println("Nombre: " + pepe.nombre +" pass: " + pepe.pass);

        Administrador alexAdmin = new Administrador();
        alexAdmin.nombre = "Alex";
        alexAdmin.pass = "2468";

        System.out.println("Nombre: " + alexAdmin.nombre +" pass: " + alexAdmin.pass);

        Imprimir();

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(pepe);
        usuarios.add(alexAdmin);

        //Imprimimos los usuarios a traves del array

        for (int i = 0; i < usuarios.size(); i++){
            System.out.println("Usuario desde array: " + usuarios.get(i).nombre);
            System.out.println("Usuarios pass desde array: " + usuarios.get(i).pass);
        }

        //for each
        for (Usuario usuario : usuarios){
            System.out.println("Imprimimos for each " + usuario.nombre);
        }

    }

    public static void Imprimir(){
        System.out.println("                                   ");
        System.out.println("###################################");
        System.out.println("                                   ");
    }
}
