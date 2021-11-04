package com.openbootcamp.poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;
/*CRUD
* Create
* Readd
* Update
* Delte
* */
public class EmpleadoCRUD {
    //Crear un array list se hace igual que crear un objeto
    private List<Empleado> empleados = new ArrayList<>();

    //guardar un empleado emulando como lo guardaria en una BBDD
    public void guardar(Empleado empleado){

        empleados.add(empleado);

    }

    //consultar empleados
    public List<Empleado> consultar(){
        return empleados;
    }
}
