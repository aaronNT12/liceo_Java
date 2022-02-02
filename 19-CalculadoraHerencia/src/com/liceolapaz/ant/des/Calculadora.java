package com.liceolapaz.ant.des;

public class Calculadora {

	public static void main(String[] args) {
		do {
			escribirMenu();
			pedirOpcion();
			int opcion = leerOpcion();
			if (opcion == 0) {
				System.exit(0);
			}else if ( opcion >= 1 && opcion <= 4) {
			escribirSubmenu();
			pedirOpcion();
			int opcionSubmenu = leerOpcion();
			switch (opcionSubmenu) 
			
		}while(true);

	}

	private static void escribirSubmenu() {
		System.out.println("\nTipo de numero\n1.Enteros\n2.Racionales\3n.Complejos");
		
	}

	private static int leerOpcion() {
		Scanner escaner = new Scanner (System.in);
		return 0;
	}

	private static void pedirOpcion() {
		System.out.println("Escoja una opción: ");
	}

	private static void escribirMenu() {
		// TODO Auto-generated method stub
		
	}

}
