package com.liceolapaz.des.ant;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// pedir el numero al usuario
		
		pedirNumero();
		
		// Leer el número y guardarlo en una variable
		
		int numeroUsuario = leerNumero();
		
		// Escribir si el numero es par o impar 
		
		escribirMensaje(numeroUsuario);
	}

	private static void escribirMensaje(int numeroUsuario) {
		// ALmacenar el mensaje en una variable
		
		String mensaje = (numeroUsuario % 2 == 0) ?
					"EL número inytroducido es par" :
						"El número introducido es impar";
		
		//Escribir por pantalla el mensaje
		
		System.out.println(mensaje);
	}

	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		
		return escaner.nextInt();
	}

	private static void pedirNumero() {
		System.out.print("Escriba un numero entero: ");
		
	}

}
