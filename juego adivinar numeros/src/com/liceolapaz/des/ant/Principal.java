package com.liceolapaz.des.ant;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// escribir men�
		escribirMenu();
		
		// pedir opci�n
		
		pedirOpci�n();
	
		
		int opcion=leerOpcion();
		// opciones a escoger
		
		switch(opcion) {
		case 1: opcion1();
		break;
		
		case 2: opcion2();
		break;
		
		case 0: opcion3();
		
		default:
			
		}
		

	}

	
		
	private static int leerOpcion() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}



	private static void opcion3() {
		System.exit(0);
		
	}



	private static void pedirOpci�n() {
		System.out.println("Escoja una opci�n: ");
		
	}

	private static void escribirMenu() {
		System.out.println("ELIJA UNA OPCI�N\n"+
							"a. opcion1\n"+
							"b. opcion2\n"+
							"c. salir\n");
		
	}

	private static void opcion1() {
		Scanner sc = new Scanner(System.in);
		
		int a = (int) ((Math.random()*10)+1); // N�mero aleatorio del 1 al 10
		int b; // N�mero inntroducido por el usuario.
		int i; // Contador para bucle for.
		
		System.out.println("Adivine un n�mero aleatorio de 10 posibles");
		
		System.out.println("Tienes 3 intentos.Escribe un n�mero entre 1 y 10: ");
		b = sc.nextInt();
		
		for (i=0; i<=2; i++) {
			//Evaluamos si se acierta
			
			if (a == b) {
				System.out.println("correcto!");
				break; }

			//Si no es ninguno de los casos anteriores, comparamos n�meros.
			
			else if (a > b)
				System.out.println("El n�mero secreto es MAYOR que " + b);
			
			else if (a < b)
				System.out.println("El n�mero secreto es MENOR que " + b);
			
			
			// Aviso de �ltimo intento
			
			if (i <=1) {
				System.out.println("Otro intento: ");
				b = sc.nextInt(); }
			
			else if (i ==2) {
				 // int x = (int) (a/10);
				// System.out.println("Una pista, la cifra es " + x);
				System.out.println("Int�ntalo de nuevo: ");
				b = sc.nextInt(); }
			
			else if (i == 3) {
				System.out.println("�LTIMO INTENTO: ");
				b = sc.nextInt();
			}
			
		}
	}
	private static void opcion2() {
		Scanner sc = new Scanner(System.in);
		
		int a = (int) ((Math.random()*50)+1); // N�mero aleatorio del 1 al 10
		int b; // N�mero inntroducido por el usuario.
		int i; // Contador para bucle for.
		
		System.out.println("Adivine un n�mero aleatorio de 50 posibles");
		
		System.out.println("Tienes 5 intentos.Escribe un n�mero entre 1 y 50: ");
		b = sc.nextInt();
		
		for (i=0; i<=4; i++) {
			//Evaluamos si se acierta
			
			if (a == b) {
				System.out.println("correcto!");
				break; }

			//Si no es ninguno de los casos anteriores, comparamos n�meros.
			
			else if (a > b)
				System.out.println("El n�mero secreto es MAYOR que " + b);
			
			else if (a < b)
				System.out.println("El n�mero secreto es MENOR que " + b);
			
			
			// Aviso de �ltimo intento
			
			if (i <=1) {
				System.out.println("Otro intento: ");
				b = sc.nextInt(); }
			
			else if (i ==4) {
				 // int x = (int) (a/10);
				// System.out.println("Una pista, la cifra es " + x);
				System.out.println("Int�ntalo de nuevo: ");
				b = sc.nextInt(); }
			
			else if (i == 5) {
				System.out.println("�LTIMO INTENTO: ");
				b = sc.nextInt();
			}
			
		}
	}
	
	
	
}
