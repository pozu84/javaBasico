package com.openbootcamp.libroJava;

import java.util.Scanner;

public class popurri {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		imprimir();

		int numeroElegido;
		do {
			System.out.println("UN NUMERO UNA ACCION");
			numeroElegido = sc.nextInt();

			switch (numeroElegido) {
				case 1:
					System.out.println("Elegido el 1");
					suma();
					break;

				case 2:
                    System.out.println("Elegido el 2");
                    break;

                case 3:
                    System.out.println("Elegido el 3");
                    break;

                case 4:
                    System.out.println("Elegido el 4");
                    break;

			}
		} while (numeroElegido > 4);

	}

	public static void imprimir() {
		System.out.println("1- ");
		System.out.println("2- ");
		System.out.println("3- ");
		System.out.println("4- ");
	}

    public static void suma() {
		System.out.println("Aqui haremos una suma");
    }
}
