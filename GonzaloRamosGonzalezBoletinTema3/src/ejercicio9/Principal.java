package ejercicio9;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		//Declaraciónes
		
		
			// Declaración Variables
		
		
		int opcion, numTickets ;
		double precioUnitario= 1.20, dineroIntroducido, precioFinal, devolucion;
		
		
			//Fin Declaracion variables
		
			//Declaración Objetos
			
		Ticket t = new Ticket(precioUnitario,2584694,"24");
		Maquina m1 = new Maquina();
		
			//Fin Declaración Objetos
		
		
		//Fin Declaraciones
		
		//Nuestro Programa
		
		
		System.out.println("Bienvenido a su programa de metro");
		System.out.println("por favor indique lo que quiere hacer ");
		System.out.println("pulse 1 para entrar como usuario");
		System.out.println("Pulse 2 para entrar como Administrador");
		opcion=Leer.datoInt();
		
		
		switch(opcion) {
		
			case 1://Usuario
				
				System.out.println("Bienvenido usuario");
				System.out.println("Indique cúantos tickets quiere comprar");
				numTickets=Leer.datoInt();
				System.out.println("Ha elegido comprar "+numTickets+ "  tickets.");
				precioFinal=m1.comprarBilletes(numTickets, precioUnitario);
				System.out.println("El precio de sus billetes es:  " + precioFinal);
				System.out.println("Introduzca el dinero: ");
				dineroIntroducido= Leer.datoDouble();
				devolucion= m1.devolverBillete(precioFinal, dineroIntroducido);
				System.out.println("Su devolución es: "+ devolucion);
				t.imprimirDatosBillete(numTickets);
				
				
				
			break;
		}

	}

}
