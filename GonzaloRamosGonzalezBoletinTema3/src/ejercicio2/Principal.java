package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result, rad;
		
		
		//Opción 1, con datos del tirón
		
		Circulo c1= new Circulo (2.3);//Declaramos el objeto con el constructor
		
		Circulo c2= new Circulo ();
		
		
		c1.calcularArea(3.5);
		
		result=c1.calcularArea(3.5);
		
		//Guardando resultado en una variable
		
		System.out.println(result);
		
		//Opción 2. Imprimiendo directamente
		
		
		System.out.println(c1.calcularArea(3.5));
		
		
		System.out.println(c1.calcularAreaV2());//Lo coge directamente del atributo
		
		
		
		//Resumen
		
		//Llamadas con c2 a todos los métodos calcularArea
		
		
		
		System.out.println(c2.calcularArea(3.9));//Se calcula con el radio dado 3,9 y no con 0.0
		
		System.out.println(c2.calcularAreaV2());//Se calcula con el radio dado por el atributo del constructor 0.0
		
		System.out.println(c2.calcularAreaV3(2.4));
		
		
		//Pedimos los datos por teclado
		
		
		System.out.println("Hola, diga el radio");
		rad=Leer.datoDouble();
		System.out.println(c2.calcularArea(rad));
		
		

	}

}
