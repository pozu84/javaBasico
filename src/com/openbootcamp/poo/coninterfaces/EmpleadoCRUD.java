package com.openbootcamp.poo.coninterfaces;

import com.openbootcamp.poo.sininterfaces.Empleado;

import java.util.List;

public interface EmpleadoCRUD {

    //Las interfaces solo declaran metodos, no los implementan, dice lo que hay que hacer, pero no como

    void save (Empleado empleado); //importamos empleado de otro paquete

    List<Empleado> buscar();

    void borrar(Empleado empleado);
}
