package com.openbootcamp.poo.coninterfaces;

import com.openbootcamp.poo.sininterfaces.Empleado;

import java.util.List;

/*Al estar implementando una interfaz, lo que hacemos es obligar a implementar los metodos que estan declarados*/

public class EmpleadoCRUDimplementado implements EmpleadoCRUD{

    @Override
    public void save(Empleado empleado) {

    }

    @Override
    public List<Empleado> buscar() {
        return null;
    }

    @Override
    public void borrar(Empleado empleado) {

    }
}
