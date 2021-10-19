package com.liceolapaz.des.ant;

public class Principal {
	
		private static final int ANHO_ACTUAL = 2021;

	public static void main(String[] args) {
		// Pedir a�o de nacimiento
			pedirAnho();
		
		// Leer el a�o y almacenarlo en una variable
			int anho = LeerAnho();
			
		// Escribir mensaje
			
			escribirMensaje(anho);

	}

	private static void escribirMensaje(int anho) {
		// Crear variable para almacenar el mensaje
		
			String mensaje = "";
		
		// Comprobar anho y almacenar mensaje en variable
			
			if (anho > 2021) {
				
				mensaje = "Este a�o a�n no ha llegado";
			} 
			
			else if (2021 - anho >150) {
				
				mensaje = "Deber�a haberse muerto";
			}
			else if (2021 - anho >=18) {
				mensaje = " puedes pasar";
			}
			else {
				mensaje = " no puedes pasar";
			}
		
		// Imprimir ese mensaje por pantalla
			
			System.out.println(mensaje);
		
	}

	private static int LeerAnho() {
		
			Scanner escaner = new Scanner (System.in);
		
		return escaner.nextInt();
	}

	private static void pedirAnho() {
		System.out.print("Escriba su a�o de nacimiento");
		
	}

}
