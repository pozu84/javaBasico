package com.openbootcamp.poo.sininterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juan = new Empleado("Juanito", 30, 40, true);
        Empleado vero = new Empleado("Vero", 37, 22, true);
        Empleado fredy = new Empleado("Fredy", 23, 35, false);

        //Guardar empleados
        empleadoCRUD.guardar(juan);
        empleadoCRUD.guardar(vero);
        empleadoCRUD.guardar(fredy);

        //Consultar empleados
        List<Empleado> empleados = empleadoCRUD.consultar();
        System.out.println(empleados);
    }
}
