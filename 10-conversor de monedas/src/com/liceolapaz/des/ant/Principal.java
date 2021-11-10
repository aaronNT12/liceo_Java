package com.liceolapaz.des.ant;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args)
	{
		//Generar menú de inicio
		
		//Generar variables que puedan contener un valor X e uno Y 
		
		
		
		
		double Yens=0.0075;
		double Libra=1.19;
		double Dolar=0.86;
		
		int Euro=1;
			//çhacer un selector de operandos
		
		char elegir;
		
		double resultado=0;
		
			//Leer variables
		
		
		
		Scanner leerOpcion = new Scanner(System.in);
		
		System.out.println("Conversor \r\n"
							+"1.Dolar \r\n"
							+"2.Yens \r\n"
							+"3.Libra \r\n"
							+"0.Salir");
		elegir = leerOpcion.next().charAt(0);
		
		
		
		
	//dar opciones a un número por tecla
		
		switch(elegir) {
		case '1': System.out.println("Introduce el primer valor: ");Euro = leerOpcion.nextInt(); resultado= Euro*Yens; System.out.println("El importe es: "+resultado+"€");break;
		case '2': System.out.println("Introduce el primer valor: ");Euro = leerOpcion.nextInt(); resultado= Euro*Dolar; System.out.println("El importe es: "+resultado+"€");break;
		case '3':  System.out.println("Introduce el primer valor: ");Euro = leerOpcion.nextInt(); resultado= Euro*Libra; System.out.println("El importe es: "+resultado+"€");break;
		case '0': System.out.println("OFF");break;
		

		}		

	}

	

	
		
	}