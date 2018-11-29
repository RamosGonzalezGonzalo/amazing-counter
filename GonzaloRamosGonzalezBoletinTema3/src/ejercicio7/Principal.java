package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración Variables
		Cuenta c1;//Declarar variable arriba sin instanciar. Aquí no instaciamos, es una referencia.
		int opcion;
		double cantIngresada, cantRetirada;
		
		
			//Declaración Objeto
		
		
		c1 = new Cuenta ();//Hemos instaciado
		
			//Fin Declaración Objeto
		
		//Fin Declaración Variables
		
		
		
		//Inicio del Programa
		
		System.out.println("Bienvenido a su programa bancario");
		do {
		System.out.println("Por favor indique la opción que desee realizar");
		System.out.println("Pulse 1 para comprobar su saldo");
		System.out.println("Pulse 2 para ingresar dinero");
		System.out.println("Pulse 3 para retirar dinero");
		System.out.println("Pulse 0 para acabar");
		opcion=Leer.datoInt();
		
		
		switch(opcion) {
		
		
			case 1:
				c1.comprobarSaldoV1();//Hemos llamado al método para que imprima el saldo que tenemos.
				
			break;
			
			case 2:
				
				System.out.println("Por favor, indique la cantidad que quiere ingresar");
				cantIngresada=Leer.datoDouble();
				c1.ingresarDineroV1(cantIngresada);
				System.out.println("Ha ingresado usted: "+cantIngresada);
				c1.comprobarSaldoV1();
				
			break;
			
			case 3://Retirar dinero
				
				System.out.println("Ha seleccionado retirar dinero. Indique la cantidad.\n");
				cantRetirada=Leer.datoDouble();
				while(cantRetirada > c1.saldo) {
					
				
					System.out.println("No dispone de tanto dinero, por favor indique otra cantidad");
					cantRetirada=Leer.datoDouble();
				
				}
				
				c1.retirarDinero(cantRetirada);
				c1.comprobarSaldoV1();
				
			break;
			
			case 0://Salir del programa
				
				System.out.println("Ha acabado usted sus gestiones. Gracias por confiar en nosotros.");
	
			break;
		}
		
		}while(opcion!=0);
		
		//Fin del programa

	}

}
