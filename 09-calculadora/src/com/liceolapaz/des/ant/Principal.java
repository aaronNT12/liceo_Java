package com.liceolapaz.des.ant;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args)
	{
		//Generar menú de inicio
		
		//Generar variables que puedan contener un valor X e uno Y 
		
		
		
		int valorUno=0;
		
		int valorDos=0;
			//çhacer un selector de operandos
		
		char elegir;
		
		int resultado=0;
		
			//Leer variables
		
		
		
		Scanner leerOpcion = new Scanner(System.in);
		
		System.out.println("Calculadora \r\n"
							+"1.Suma \r\n"
							+"2.Resta \r\n"
							+"3.Multiplicación 2\r\n"
							+"4.Division \r\n"
							+"0.Salir");
		elegir = leerOpcion.next().charAt(0);
		System.out.println("Introduce el primer valor: ");
		valorUno=leerOpcion.nextInt();
		System.out.println("Introduce el segundo valor: ");
		valorDos = leerOpcion.nextInt();
		
	//dar opciones a un número por tecla
		
		switch(elegir) {
		case '1': resultado = valorUno+valorDos; System.out.println(valorUno+" + "+valorDos+" = "+resultado);break;
		case '2': resultado = valorUno-valorDos; System.out.println(valorUno+" - "+valorDos+" = "+resultado);break;
		case '3': resultado = valorUno*valorDos; System.out.println(valorUno+" * "+valorDos+"="+resultado);break;
		case '4': resultado = valorUno/valorDos;System.out.println(valorUno+" / "+valorDos+"="+resultado);break;
		case '0': System.out.println("OFF");break;
		

		}		

	}

	

	
		
	}


