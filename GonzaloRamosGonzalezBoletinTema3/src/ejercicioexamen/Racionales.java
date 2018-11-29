package ejercicioexamen;

public class Racionales {
	
	//Atributos
	
	
	private int numerador;
	private int denominador;
	

	
	//Fin Atributos
	
	//constructores
	
	
		//Constructor sin atributos
	
	public Racionales() {
	}

	
		//Fin COnstructor sin atributos
	
	
		//COnstructor con Todos Atributos
	
	public Racionales(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}


	
	
		//Fin COnstructor Todos Atributos
	
	//FIn Constructores
	
	
	//Getters And Setter
	
	public int getNumerador() {//Get Numerador
		return numerador;
	}


	public void setNumerador(int numerador) {//Set Numerador
		this.numerador = numerador;
	}


	public int getDenominador() {//Get Nominador
		return denominador;
	}


	public void setDenominador(int denominador) {//Set Denominador
		this.denominador = denominador;
	}


	
	
	//Fin Getters And Setters
	
	//Metodo ToString
	
	@Override
	public String toString() {
		//return "Racionales [numerador=" + numerador + ", denominador=" + denominador + "]";
		return numerador +"/" + denominador;
	}
	
	//Fin Metodo ToString
	
	
	//Nuestros Métodos
	
}
