package com.liceolapaz.des.ant;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Principal {

	public static void main(String[] args) {
		// 1 pedir el nombre al usuario
		
		pedirNombre();
		
		// 2 recibir el nombre y almacenarlo para luego  poder usarlo
		
		String nombreUsuario = recibirNombre();
		
		// 3 escribir el mensaje por pantalla
			
		escribirSaludo(nombreUsuario);
	}

	private static void escribirSaludo(String nombreUsuario) {
		
		System.out.println("¡Hola " + nombreUsuario + "!" );
	}

	private static String recibirNombre() {
		
		Scanner escaner = new Scanner(System.in);
		return escaner.nextLine(); 
	}

	private static void pedirNombre() {
		System.out.print("Escriba su nombre:");
		
	}

}
