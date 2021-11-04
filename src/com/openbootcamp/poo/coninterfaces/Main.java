package com.openbootcamp.poo.coninterfaces;

import com.openbootcamp.poo.sininterfaces.Empleado;

public class Main {
    /*Creamos un objeto de la interface, y este objeto se podria cambiar en un futuro (new EmpleadoCRUDimplementado)
    * sin perder la estructura, ya que el codigo main "toma" una interface, donde estan declarados los metodos que se
    * deben usar, Podemos tener todas las interfaces que queramos */
    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDimplementado();

    public static void main(String[] args) {

        empleadoCRUD.buscar();
        empleadoCRUD.save(new Empleado());

    }
}
