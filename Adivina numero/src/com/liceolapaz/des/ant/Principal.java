package com.liceolapaz.des.ant;

public class Principal {

	public static void main(String[] args) {
		// generar menu
		generarMenu();
		
		// generar las opciones que el programa da al usuario
		
		introducirNumero(generarMenu);
		// opción 1 numeros enteros del 1 al 10 con 3 intentos
		// opción 2 numeros enteros  del 1 al 50 con 5 intentos
		// opción 0 salir 
		// despues de elegir opción el usuario introduce numero
		// si está en un rango de numeros de dicha opción imprime por pantalla resultado
		// si no está en el rango imprime mensaje de error 
		// si escoge la opción 0 el programa se cierra 

	}

	private static void introducirNumero() {
	
		
	}

	private static void generarMenu() {
		System.out.println("Menú de opciones\n"+
							"1. números del 1 al 10\n " +
							"2. números del 10 al 50\n"+
							"0. salir del programa");
		
	}

}
