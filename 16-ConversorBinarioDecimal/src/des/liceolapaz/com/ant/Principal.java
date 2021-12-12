package des.liceolapaz.com.ant;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		while (true) {
			// Escribir men�
			escribirMenu();
			// Pedir opci�n
			pedirOpcion();
			// Leer opci�n y almacenarla
			int opcion = leerEntero();
			// Si la opci�n es 0
			if (opcion == 0) {
				// Salir
				System.exit(0);
			}
			// Si la opci�n es 1
			else if (opcion == 1) {
				// Pedir n�mero binario
				pedirNumeroBinario();
				// Leer n�mero binario y almacenarlo
				int numeroBinario = leerEntero();
				// Comprobar si es negativo
				if (numeroBinario < 0) {
					// Mostrar error
					System.out.println("Introduzca solo n�meros positivos");
				} else {
					String numeroTexto = "" + numeroBinario;
					// Comprobar si tiene algo que no sea 0 � 1
					if (!numeroTexto.trim().matches("[01]+")) {
						// Mostrar error
						System.out.println("El n�mero introducido no es binario");
					} else {
						int resultadoDecimal = binarioADecimal(numeroTexto);
						System.out.println("El resultado de la conversi�n es " + resultadoDecimal);
					}
				}
			}
			// Si la opci�n es 2
			else if (opcion == 2) {
				// Pedir n�mero decimal
				pedirNumeroDecimal();
				// Leer n�mero decimal y almacenarlo
				int numeroDecimal = leerEntero();
				// Comprobar si es negativo
				if (numeroDecimal < 0) {
					// Mostrar error
					System.out.println("Introduzca solo n�meros positivos");
				} else {
					String resultadoBinario = decimalABinario(numeroDecimal);
					System.out.println("El resultado de la conversi�n es " + resultadoBinario);
				}
			}
			// Si es otra opci�n
			else {
				// Mostrar error
				System.out.println("Opci�n no v�lida");
			}
		}
	}

	private static String decimalABinario(int numeroDecimal) {
		String resultado = "";
		int dividendo = numeroDecimal;
		int resto = 0;
		while (dividendo > 0) {
			resto = dividendo % 2;
			dividendo /= 2;
			resultado = resto + resultado;
		}
		return resultado;
	}

	private static void pedirNumeroDecimal() {
		System.out.print("Introduzca un n�mero decimal: ");
	}

	private static int binarioADecimal(String numeroTexto) {
		int resultado = 0;
		int posicion = numeroTexto.length() - 1;
		int exponente = 0;
		
		while(posicion >= 0) {
			resultado += Math.pow(2, exponente) * Character.getNumericValue(numeroTexto.charAt(posicion));
			exponente++;
			posicion--;
		}
		
		return resultado;
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opci�n: ");
	}

	private static void pedirNumeroBinario() {
		System.out.print("Introduzca un n�mero binario: ");
	}

	private static int leerEntero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void escribirMenu() {
		System.out.println(
				"\nCONVERSOR BINARIO" + "\n1. De binario a decimal" + "\n2. De decimal a binario" + "\n0. Salir");
	}

}