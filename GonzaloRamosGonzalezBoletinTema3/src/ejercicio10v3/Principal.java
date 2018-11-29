package ejercicio10v3;

import ejercicio10.Alumno;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// Variables
		
		int opcion, opcionDos;
		double opcionHistoria, opcionLengua, opcionMates, mediaAlumno;
		String nom="Gonzalo";
		double sumNotastodosalumnos=0;
		int numAlumnos=0;
		//Fin Variables
		Alumno [] a1;
		//Objeto
		 a1 = new Alumno [10];
		 for (int i=0; i<10; i++) {
			 
		 
			  a1[i]= new Alumno (nom);
		 }
		//Fin Objeto
		
		//Nuestro Programa
		
		System.out.println("Bienvenido a su programa de estudiantes");
		
		do {
		
		System.out.println("Indique la opcion ue deseaa realizar");
		System.out.println("Pulse 1 para establecer notas");
		System.out.println("Pulse 2 para modificar las notas");
		System.out.println("Pulse 3 para realizar la media");
		System.out.println("Pulse 0 para salir");
		opcion=Leer.datoInt();
		
		switch(opcion) {
		
			case 1:
				System.out.println("Ha elegido establecer notas para el alumno" + a1[numAlumnos].getNombre());
				System.out.println("Introduzca la nota de historia");
				opcionHistoria=Leer.datoDouble();
				a1[numAlumnos].setNotaHistoria(opcionHistoria);
				//System.out.println("Nota introducida por el usuario de historia : "+ opcionHistoria);
				System.out.println("Nota Historia: "+ a1[numAlumnos].getNotaHistoria());
				System.out.println("Introduzca la nota de lengua");
				opcionLengua=Leer.datoDouble();
				a1[numAlumnos].setNotaLengua(opcionLengua);
				System.out.println("Nota Lengua: "+ a1[numAlumnos].getNotaLengua());
				System.out.println("Introduzca la nota de mates");
				opcionMates=Leer.datoDouble();
				a1[numAlumnos].setNotaMates(opcionMates);
				System.out.println("Nota Mates: "+ a1[numAlumnos].getNotaMates());
				
				
				
			break;
			
			case 2:
				
				System.out.println("Nota Historia: "+ a1[numAlumnos].getNotaHistoria());
				System.out.println("Nota Lengua: "+ a1[numAlumnos].getNotaLengua());
				System.out.println("Nota Mates: "+ a1[numAlumnos].getNotaMates());
				
				System.out.println("Indique la nota que quiere cambiar");
				System.out.println("Pulse 1 para cambiar Historia");
				System.out.println("Pulse 2 para cambiar Lengua");
				System.out.println("Pulse 3 para cambiar Matemáticas");
				opcionDos=Leer.datoInt();
				
				switch(opcionDos) {
				
					case 1:
						System.out.println("Introduzca la nueva nota de historia");
						opcionHistoria=Leer.datoDouble();
						a1[numAlumnos].setNotaHistoria(opcionHistoria);
						//System.out.println("Nota introducida por el usuario de historia : "+ opcionHistoria);
						System.out.println("Nota Historia: "+ a1[numAlumnos].getNotaHistoria());
					break;
					
					case 2:
						System.out.println("Introduzca la nueva nota de lengua");
						opcionLengua=Leer.datoDouble();
						a1[numAlumnos].setNotaLengua(opcionLengua);
						System.out.println("Nota Lengua: "+ a1[numAlumnos].getNotaLengua());
					break;
					
					case 3:
						System.out.println("Introduzca la nueva nota de mates");
						opcionMates=Leer.datoDouble();
						a1[numAlumnos].setNotaMates(opcionMates);
						System.out.println("Nota Mates: "+ a1[numAlumnos].getNotaMates());
					break;
				}
			break;
			
			case 3:
				
					
				
				System.out.println("Va a realizar la media del alumno"+ a1[numAlumnos].getNombre());
				mediaAlumno= a1[numAlumnos].calcularMedia();
				System.out.println(mediaAlumno);
				sumNotastodosalumnos= sumNotastodosalumnos +mediaAlumno;
				numAlumnos++;
			
				
				break;
				
			case 0:
				System.out.println("La media de todos los alumnos es :" +sumNotastodosalumnos / numAlumnos);
				System.out.println("Adiós");
			break;
		
		}
		}while(opcion != 0 );
		
		
		

	}

}
