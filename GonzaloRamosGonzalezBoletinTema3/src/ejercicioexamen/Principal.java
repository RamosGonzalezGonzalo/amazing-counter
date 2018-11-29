package ejercicioexamen;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// Declaración
		int numeradorUno, denominadorUno, numeradorDos, denominadorDos, opcion, opcionDos;
		//Racionales r1 = new Racionales (numeradorUno, denominadorUno);
		
		//Fin Declaración
		
		
		
		//Nuestro Programa
		
		
		System.out.println("Bienvenido a su programa de cálculo con fracciones");
		System.out.println("Por favor indique el numerador de la primera fracción");
		numeradorUno=Leer.datoInt();
		System.out.println("Por favor indique el denominador de la primera fracción");
		denominadorUno=Leer.datoInt();
		Racionales r1 = new Racionales (numeradorUno, denominadorUno);
		System.out.println("Indique ahora el numerador de la segunda fracción");
		numeradorDos=Leer.datoInt();
		System.out.println("Indique el denominador de la segunda fracción");
		denominadorDos=Leer.datoInt();
		Racionales r2 = new Racionales (numeradorDos, denominadorDos);
	
		System.out.println("Indique que opción desea realizar");
		do {
		System.out.println("Pulse 1 para hacer operaciones");
		System.out.println("Pulse 0 para salir");
		opcion=Leer.datoInt();
		
			switch(opcion) {
		
				case 1:
					System.out.println("Ha elegido realizar operaciones");
					do {
						System.out.println("Pulse 1 para multiplicar");
						System.out.println("Pulse 2 para cambiar el signo al primer numerador");
						System.out.println("Pulse 0 para salir de esta opción");
						opcionDos=Leer.datoInt();
				
						switch(opcionDos) {
				
							case 1:
								System.out.println("Ha elegido multiplicar las fraciones");
								Operaciones o1 = new Operaciones();
								System.out.println("Su resultado es: " +o1.multiplicar(numeradorUno, denominadorUno, numeradorDos, denominadorDos));
						
							break;
							
							case 2:
								System.out.println("Ha elegido cambiar el signo al primer numerador");
								Operaciones o2 = new Operaciones ();
								System.out.println(o2.cambiarSigno(numeradorUno, denominadorUno, numeradorDos, denominadorDos));
							break;
						}
				
					}while(opcionDos !=0);
				break;
			}
		}while (opcion != 0);
		
		
	}

}
