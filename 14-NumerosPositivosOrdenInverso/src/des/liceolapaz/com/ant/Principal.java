package des.liceolapaz.com.ant;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Pedir los n�meros
		pedirNumeros();
		// Variable para almacenar n�meros
		int[] numeros = new int[10];
		// Variable para contar n�meros almacenados
		int numerosAlmacenados = 0;
		while(true) {
			// Leer el n�mero y almacenarlo
			int numero = leerNumero();
			// Si es positivo
			if (numero > 0) {
				// Almacenarlo
				numeros[numerosAlmacenados] = numero;
				numerosAlmacenados++;
			}
			// Si no es positivo
			else {
				// Mostrar un mensaje de error
				System.out.println("Por favor, introduzca solo n�meros enteros positivos");
				continue;
			}
			if (numerosAlmacenados == 10) {
				break;
			}
		}
		// Escribir n�meros
		escribirNumeros(numeros);
		// Escribir mensaje de despedida
		System.out.println("�Hasta la pr�xima!");
	}

	private static void escribirNumeros(int[] numeros) {
		System.out.print("Los n�meros introducidos fueron:");
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(" " + numeros[i]);
		}
		System.out.println();
	}

	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirNumeros() {
		System.out.println("Escriba 10 n�meros enteros positivos enteros:");
	}
}