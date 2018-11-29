package ejercicio10v2;

import ejercicio10.Alumno;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// Variables
		boolean flag=false;
		int opcion, opcionDos;
		double opcionHistoria, opcionLengua, opcionMates, mediaAlumno;
		String nom="Gonzalo";
		double sumNotastodosalumnos=0;
		int numAlumnos=0;
		//Fin Variables
		
		//Objeto
		Alumno a1 = new Alumno (nom);
		//Fin Objeto
		
		//Nuestro Programa
		
		System.out.println("Bienvenido a su programa de estudiantes");
		
		do {
		flag=false;
		System.out.println("Indique la opcion ue deseaa realizar");
		System.out.println("Pulse 1 para establecer notas");
		System.out.println("Pulse 2 para modificar las notas");
		System.out.println("Pulse 3 para realizar la media");
		System.out.println("Pulse 0 para salir");
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
				flag=true;
				
				
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
				if (flag == true) {
					
				
				System.out.println("Va a realizar la media del alumno"+ a1.getNombre());
				mediaAlumno= a1.calcularMedia();
				System.out.println(mediaAlumno);
				sumNotastodosalumnos= sumNotastodosalumnos +mediaAlumno;
				numAlumnos++;
				} else
					System.out.println("No puede hacer la media de un alumno del cual no tengo notas");
				
				break;
				
			case 0:
				System.out.println("La media de todos los alumnos es :" +sumNotastodosalumnos / numAlumnos);
				System.out.println("Adiós");
			break;
		
		}
		}while(opcion != 0 );
		
		
		

	}

}
