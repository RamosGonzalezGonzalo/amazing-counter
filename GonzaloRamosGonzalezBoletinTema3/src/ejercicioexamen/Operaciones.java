package ejercicioexamen;

public class Operaciones {
	
	//ATRIBUTOS
	private Racionales r1;
	private Racionales r2;
	//Fin Atributos
	
	
	//COnstructores
	
		//Constructor Sin atributos
	
	public Operaciones() {
	}
	
		//Fin COnstructor sin atributos
	
		//Constructor Con Todos Los Atributos
	
	public Operaciones(Racionales r1, Racionales r2) {
		super();
		this.r1 = r1;
		this.r2 = r2;
	}
	
		//Fin Constructor Con Todos Los Atributos
	
	
	//Fin COnstructores
	
	
	
	//Nuestros Metodos
	
	public int multiplicar (int numeradorUno, int denominadorUno, int numeradorDos, int denominadorDos) {
		int numeradorTotal, denominadorTotal, calculoFinal;
		
		numeradorTotal=numeradorUno * numeradorDos;
		denominadorTotal=denominadorUno * denominadorDos;
		calculoFinal = numeradorTotal / denominadorTotal;
		
		return calculoFinal;
	}
	
	public int cambiarSigno (int numeradorUno, int denominadorUno, int numeradorDos, int denominadorDos) {
		int negativo= -1, resultado;
		resultado=numeradorUno * negativo;
		
		return resultado;
		
		
	/*public Racionales multiplicarRacionales(Racionales r1, Racionales r2) {
		
		int numerador=0;
		int denominador=0;
		numerador = r1. * numeradorDos;
		denominador = denominadorUno * denominadorDos;
		
		Racionales r3= new Racionales (numerador, denominador);
		return r3;
	}*/
		
	}

		



	

}
