package com.liceolapaz.des.ant;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		do {
			// Escribir men�
			escribirMenu();
			// Pedir opci�n
			pedirOpcion();
			// Leer la opci�n y almacenarla
			int opcion = leerOpcion();
			switch(opcion) {
			// Si la opci�n es 0
			case 0:
				// Salir
				System.exit(0);
				break;
			// Si la opci�n es 1 (Tri�ngulo)
			case 1:
				// Pedir la base
				pedirBaseTriangulo();
				// Leer la base y almacenarla
				double baseTriangulo = leerDouble();
				// Pedir el segundo lado
				pedirSegundoLado();
				// Leer el segundo lado y almacenarlo
				double segundoLado = leerDouble();
				// Pedir el tercer lado
				pedirTercerLado();
				// Leer el tercer lado y almacenarlo
				double tercerLado = leerDouble();
				// Pedir la altura
				pedirAlturaTriangulo();
				// Leer la altura y almacenarla
				double alturaTriangulo = leerDouble();
				// Calcular �rea
				double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
				// Calcular per�metro
				double perimetroTriangulo = baseTriangulo + segundoLado + tercerLado;
				// Escribir resultado
				escribirResultado(areaTriangulo, perimetroTriangulo);
				break;
			// Si la opci�n es 2 (Rect�ngulo)
			case 2:
				// Pedir la base
				pedirBaseRectangulo();
				// Leer la base y almacenarla
				double baseRectangulo = leerDouble();
				// Pedir la altura
				pedirAlturaRectangulo();
				// Leer la altura y almacenarla
				double alturaRectangulo = leerDouble();
				// Calcular el area
				double areaRectangulo = baseRectangulo * alturaRectangulo;
				// Calcular el per�metro
				double perimetroRectangulo = baseRectangulo + baseRectangulo + alturaRectangulo + alturaRectangulo;
				// Escribir resultado
				escribirResultado(areaRectangulo, perimetroRectangulo);
				break;
			// Si la opci�n es 3 (Cuadrado)
			case 3:
				// Pedir el lado
				pedirLadoCuadrado();
				// Leer el lado y almacenarlo
				double ladoCuadrado = leerDouble();
				// Calcular el �rea
				double areaCuadrado = ladoCuadrado * ladoCuadrado;
				// Calcular el per�metro
				double perimetroCuadrado = 4 * ladoCuadrado;
				// Escribir el resultado
				escribirResultado(areaCuadrado, perimetroCuadrado);
				break;
			// Si la opci�n es 4 (Pent�gono)
			case 4:
				// Pedir lado
				pedirLadoPentagono();
				// Leer lado y almacenarlo
				double ladoPentagono = leerDouble();
				// Pedir apotema
				pedirApotema();
				// Leer apotema y almacenarla
				double apotema = leerDouble();
				// Calcular per�metro
				double perimetroPentagono = 5 *ladoPentagono;
				// Calcular �rea
				double areaPentagono = (perimetroPentagono * apotema) / 2;
				// Escribir resultado
				escribirResultado(areaPentagono, perimetroPentagono);
				break;
			// Si es otra opci�n
			default:
				// Mostrar mensaje de error
				System.out.println("Opci�n no v�lida");
				break;
			}
		} while(true);
	}

	private static void pedirApotema() {
		System.out.print("Escriba el apotema del pent�gono: ");
	}

	private static void pedirLadoPentagono() {
		System.out.print("Escriba el lado del pent�gono: ");
	}

	private static void pedirLadoCuadrado() {
		System.out.print("Escriba el lado del cuadrado: ");
	}

	private static void pedirAlturaRectangulo() {
		System.out.print("Escriba la altura del rect�ngulo: ");
	}

	private static void pedirBaseRectangulo() {
		System.out.print("Escriba la base del rect�ngulo: ");
	}

	private static void escribirResultado(double area, double perimetro) {
		System.out.println("El �rea es " + area + " y el per�metro es " + perimetro);
	}

	private static void pedirAlturaTriangulo() {
		System.out.print("Escriba la altura del tri�ngulo: ");
	}

	private static void pedirTercerLado() {
		System.out.print("Escriba el tercer lado del tri�ngulo: ");
	}

	private static void pedirSegundoLado() {
		System.out.print("Escriba el segundo lado del tri�ngulo: ");
	}

	private static double leerDouble() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextDouble();
	}

	private static void pedirBaseTriangulo() {
		System.out.print("Escriba el valor del primer lado (base) del tri�ngulo: ");
	}

	private static int leerOpcion() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opci�n: ");
	}

	private static void escribirMenu() {
		System.out.println("\nFIGURAS GEOM�TRICAS\n"
				+ "1. Tri�ngulo\n"
				+ "2. Rect�ngulo\n"
				+ "3. Cuadrado\n"
				+ "4. Pent�gono\n"
				+ "0. Salir");
	}

}