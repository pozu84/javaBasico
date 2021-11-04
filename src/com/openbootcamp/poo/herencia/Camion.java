package com.openbootcamp.poo.herencia;

import com.openbootcamp.poo.clases.Vehiculo;

public class Camion extends Vehiculo {

    public double carga;

    //Utilizamos super para no volver a repetir cogo y usar el constructor de la super clase de los atributos heredados
    public Camion(String fabricante, String model, double carga) {
        super(fabricante, model);
        this.carga = carga;
    }
}
