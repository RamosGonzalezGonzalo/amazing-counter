package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// Variables
	
		int opcion, opcionDos;
		double opcionHistoria, opcionLengua, opcionMates;
		String nom="Gonzalo";
		//Fin Variables
		
		//Objeto
		Alumno a1 = new Alumno (nom);
		//Fin Objeto
		
		//Nuestro Programa
		
		System.out.println("Bienvenido a su programa de estudiantes");
		do {
		System.out.println("Indique la opcion que deseaa realizar");
		System.out.println("Pulse 1 para establecer notas");
		System.out.println("Pulse 2 para modificar las notas");
		System.out.println("Pulse 3 para realizar la media");
		System.out.println("Pulse 0 para salir del programa");
		opcion=Leer.datoInt();
		
		switch(opcion) {
		
			case 1:
				System.out.println("Ha elegido establecer notas para el alumno" + a1.getNombre());
				System.out.println("Introduzca la nota de historia");
				opcionHistoria=Leer.datoDouble();
				a1.setNotaHistoria(opcionHistoria);
				//System.out.println("Nota introducida por el usuario de historia : "+ opcionHistoria);
				System.out.println("Nota Historia: "+ a1.getNotaHistoria());
				System.out.println("Introduzca la nota de lengua");
				opcionLengua=Leer.datoDouble();
				a1.setNotaLengua(opcionLengua);
				System.out.println("Nota Lengua: "+ a1.getNotaLengua());
				System.out.println("Introduzca la nota de mates");
				opcionMates=Leer.datoDouble();
				a1.setNotaMates(opcionMates);
				System.out.println("Nota Mates: "+ a1.getNotaMates());
				
				
				
			break;
			
			case 2:
				
				System.out.println("Nota Historia: "+ a1.getNotaHistoria());
				System.out.println("Nota Lengua: "+ a1.getNotaLengua());
				System.out.println("Nota Mates: "+ a1.getNotaMates());
				
				System.out.println("Indique la nota que quiere cambiar");
				System.out.println("Pulse 1 para cambiar Historia");
				System.out.println("Pulse 2 para cambiar Lengua");
				System.out.println("Pulse 3 para cambiar Matemáticas");
				opcionDos=Leer.datoInt();
				
				switch(opcionDos) {
				
					case 1:
						System.out.println("Introduzca la nueva nota de historia");
						opcionHistoria=Leer.datoDouble();
						a1.setNotaHistoria(opcionHistoria);
						//System.out.println("Nota introducida por el usuario de historia : "+ opcionHistoria);
						System.out.println("Nota Historia: "+ a1.getNotaHistoria());
					break;
					
					case 2:
						System.out.println("Introduzca la nueva nota de lengua");
						opcionLengua=Leer.datoDouble();
						a1.setNotaLengua(opcionLengua);
						System.out.println("Nota Lengua: "+ a1.getNotaLengua());
					break;
					
					case 3:
						System.out.println("Introduzca la nueva nota de mates");
						opcionMates=Leer.datoDouble();
						a1.setNotaMates(opcionMates);
						System.out.println("Nota Mates: "+ a1.getNotaMates());
					break;
				}
			break;
			
			case 3:
				
					
				
				System.out.println("Va a realizar la media del alumno "+ a1.getNombre());
				System.out.println("Su media es : "+a1.calcularMedia());
				
					
				
				break;
		
		}
		}while(opcion!=0);
		
		
		

	}

}
