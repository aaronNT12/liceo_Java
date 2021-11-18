package com.liceolapaz.ant;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		do {
			// Escribir men�
			escribirMenu();
			// Pedir opci�n
			pedirOpcion();
			// Leer opci�n
			int opcion = leerOpcion();
			switch(opcion) {
			// Si la opci�n es 1
			case 1:
				// Pedir base
				pedirBase();
				// Leer base y almacenarla
				double base = leerDouble();
				// Pedir exponente
				pedirExponente();
				// Leer exponente y almacenarlo
				double exponente = leerDouble();
				// Calcular resultado
				double resultadoPotencia = Math.pow(base, exponente);
				// Escribir el resultado
				escribirResultado(resultadoPotencia);
				break;
			// Si la opci�n es 2
			case 2:
				// Pedir operando
				pedirOperando();
				// Leer operando y almacenarlo
				double operando = leerDouble();
				// Calcular resultado
				double resultadoRaizCuadrada = Math.sqrt(operando);
				// Escribir el resultado
				escribirResultado(resultadoRaizCuadrada);
				break;
			// Si la opci�n 3
			case 3:
				// Salir del programa
				System.exit(0);
				break;
			// Si es otra opci�n
			default:
				// Mostrar mensaje de error
				System.out.println("Opci�n no v�lida");
			}
		} while (true);
	}

	private static void pedirOperando() {
		System.out.print("Introduzca el operando: ");
	}

	private static void escribirResultado(double resultado) {
		System.out.println("El resultado es " + resultado);
	}

	private static void pedirExponente() {
		System.out.print("Introduzca el valor del exponente: ");
	}

	private static double leerDouble() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextDouble();
	}

	private static void pedirBase() {
		System.out.print("Introduzca el valor de la base: ");
	}

	private static int leerOpcion() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opci�n: ");
	}

	private static void escribirMenu() {
		System.out.println("\nPOTENCIAS Y RAICES CUADRADAS\n"
				+ "1. Potencia\n"
				+ "2. Ra�z cuadrada\n"
				+ "3. Salir");
	}

}