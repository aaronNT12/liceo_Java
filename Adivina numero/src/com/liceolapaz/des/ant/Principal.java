package com.liceolapaz.des.ant;

public class Principal {

	public static void main(String[] args) {
		// generar menu
		generarMenu();
		
		// generar las opciones que el programa da al usuario
		
		introducirNumero(generarMenu);
		// opci�n 1 numeros enteros del 1 al 10 con 3 intentos
		// opci�n 2 numeros enteros  del 1 al 50 con 5 intentos
		// opci�n 0 salir 
		// despues de elegir opci�n el usuario introduce numero
		// si est� en un rango de numeros de dicha opci�n imprime por pantalla resultado
		// si no est� en el rango imprime mensaje de error 
		// si escoge la opci�n 0 el programa se cierra 

	}

	private static void introducirNumero() {
	
		
	}

	private static void generarMenu() {
		System.out.println("Men� de opciones\n"+
							"1. n�meros del 1 al 10\n " +
							"2. n�meros del 10 al 50\n"+
							"0. salir del programa");
		
	}

}
