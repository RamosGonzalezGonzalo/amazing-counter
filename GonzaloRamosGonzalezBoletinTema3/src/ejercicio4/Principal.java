package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int opcion;
		double rad, h;
		
		//Fin variables
		
		//Declaramos el objeto
		
		Cilindro c1 = new Cilindro ();
		
		//Fin declaración objeto
		
		
		System.out.println("Bienvenido a su programa para calcular el volumen de un cilindro");
		
		do {
		System.out.println("Seleccione la opción que desea realizar");
		System.out.println("1 para ir al programa");
		System.out.println("0 para terminar");
		opcion=Leer.datoInt();
		
		switch(opcion) {
		
			case 1:
				System.out.println("Por favor introduzca el radio de la base del cilindro");
				rad=Leer.datoDouble();
				System.out.println("Indique ahora la altura del cilindro");
				h=Leer.datoDouble();
				System.out.print("El volumen del cilindro es: ");
				System.out.println(c1.calcularVolumenV1(rad, h));
				
			break;
			
			case 0:
				System.out.println("Adiós");
			
			break;
		}
		
		
		

	}while(opcion!=1);

}}
