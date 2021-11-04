package com.openbootcamp.ejercicios;

import java.math.BigDecimal;

public class Bigdecimal {

    public static void main(String[] args) {

        //El dato BigDecimal es utilizado en entornos financieros

        BigDecimal valorA = new BigDecimal(4);
        BigDecimal valorB = new BigDecimal(2);

        BigDecimal resultadoSuma = valorA.add(valorB);
        System.out.println(resultadoSuma);

        BigDecimal resultadoMultiplicacion = valorA.multiply(valorB);
        System.out.println(resultadoMultiplicacion);

        //Operaciones con big decimal manual
    }
}
