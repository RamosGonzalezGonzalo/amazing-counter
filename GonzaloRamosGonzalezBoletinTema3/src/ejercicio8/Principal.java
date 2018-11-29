package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		//Declaración Variables
		
		int numBoleto, opcion;
		
			//Declaración de Objetos
		
		Sorteo s1 = new Sorteo();
		
			//Fin Declaración de Objetos
		
		//Fin Declaración Variables
		
		System.out.println("Bienvenido a su programa de Loterias");
		
		System.out.println("Indique a continuación la opción que desea realizar");
		
		System.out.println("Pulse 1 para comprar un boleto");
		System.out.println("Pulse 2 para realizar un sorteo");
		System.out.println("Pulse 3 para comprobar si su número es el premiado");
		System.out.println("Pulse 0 para finalizar su juego");
		opcion=Leer.datoInt();
		
		
		switch(opcion) {
		
			case 1:
				
				System.out.println("Por favor, indique un número del 0 al 99.999 para comprar un boleto");
				numBoleto=Leer.datoInt();
				s1.obtenerBoleto(numBoleto);
				System.out.println("Ha elegido el número:" + numBoleto);
				
			break;
			
			
			case 2:
			break;
			
			case 3:
			break;
			
			case 0:
			break;
		}

	}

}
