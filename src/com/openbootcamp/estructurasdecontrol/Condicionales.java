package com.openbootcamp.estructurasdecontrol;

public class Condicionales {
    public static void main(String[] args) {

        int edad = 17;

        if (edad < 18){
            System.out.println("Es menor de edad");

        } else{
            System.out.println("Es mayor de edad");
        }

        //Condicion con Strings
        String dia = "Domingo";

        if (dia.equals("Lunes")){
            System.out.println("Estamos a Lunes");

        } else if (dia.equals("Martes")){
            System.out.println("Estamos a martes");

        } else if (dia.equals("Miercoles")){
            System.out.printf("Estamos a miercoles");

        } else{
            System.out.println("Cualquier otro dia de la semana: " + dia);
        }

        //Modelo en switch
        String diaSemana = "Sabado";

        switch(diaSemana){
            case "Lunes":
                System.out.println("Es lunes!!");
                break;

            case "Martes":
                System.out.println("Es Martes!!");
                break;

            default:
                System.out.println("Es cualquier otro dia: " + diaSemana);
        }
    }



}
