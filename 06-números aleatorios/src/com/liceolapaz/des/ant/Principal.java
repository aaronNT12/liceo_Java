package com.liceolapaz.des.ant;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedimos al usuario el numero a buscar

		pedirNumeroBuscar();

		// Leemos n�mero y lo almacenamos

		int numeroBuscar = leerEntero();

		// Pedimos al usuario el n�mero m�ximo de intentos

		pedirMaximmoIntentos();
		// Leemos el n�mero m�ximo de intentos y lo alamcenamos

		int maximoIntentos = leerEntero();

		// Almacenar numero intentos:

		int numeroIntentos = 0;
		// Generar n�mero aleatorio y almacenarlo

		int numeroAleatorio = generarNumeroAleatorio(1, 10);

		// Imprimir numero aleatorio

		System.out.println("El n�mero generado fue: ");

		//

		// Sumar 1 a los intentos

		numeroIntentos++; // numero intentos es igual a numero de intentos m�s 1

		// Comprobar si el n�mero generado es igual al n�mero a buscar

		comprobarNumero(numeroBuscar, numeroAleatorio, numeroIntentos, maximoIntentos);

	}

	private static void comprobarNumero(int numeroBuscar, int numeroAleatorio, int numeroIntentos, int maximoIntentos) {
		// Si son iguales imprimir por pantalla mensaje

		if (numeroBuscar == numeroAleatorio) {
			System.out.println("Numero encontrado en " + numeroIntentos + " intento(s)");
		}
		// Si no lo son y hay m�s intentos, repetir generar n�mero
		else if (numeroIntentos < maximoIntentos) {
			return;
			// Si no hay m�s intentos escribir otro mensaje

		} else {
			System.out.println("no se ha podido encontrar el n�mero en " + maximoIntentos + " intentos(s)");
		}
	}

	private static int generarNumeroAleatorio(int min, int max) {

		Random random = new Random();
		return random.nextInt();
	}

	private static void pedirMaximmoIntentos() {
		System.out.print("Escriba numero m�ximo de intentos");

	}

	private static int leerEntero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirNumeroBuscar() {
		System.out.print("Escriba el n�mero a buscar: ");

	}

}
