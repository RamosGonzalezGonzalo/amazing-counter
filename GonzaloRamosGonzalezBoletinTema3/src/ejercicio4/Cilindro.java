package ejercicio4;

public class Cilindro {
	
	
	//Atributos
	
	double altura, radio;
	
	
	//Constructor con parámetros

	public Cilindro(double altura, double radio) {
		
		this.altura = altura;
		this.radio = radio;
	}
	//Fin Constructor con parámetros
	
	
	//Constructor sin parámetros
	
	public Cilindro () {
		
	}
	//Fin Constructor sin parámetros
	
	
	//Getters and Setters

	public double getAltura() {//Get de altura
		return altura;
	}


	public void setAltura(double altura) {//Set de altura
		this.altura = altura;
	}


	public double getRadio() {//Get de radio
		return radio;
	}


	public void setRadio(double radio) {//Set de radio
		this.radio = radio;
	}
	//Fin de Set and Get
	
	

	//Método To String
	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + ", radio=" + radio + "]";
	}
	//Fin Método To String
	
	
	
	
	// Nuestros Métodos
	
	public double calcularVolumenV1 (double radio, double altura) {//Método 1: Usuario nos da las medidas.
		
		//Declaramos la variables
		double resultadoArea, resultadoVolumen;
		
		//Fin declaración variables
		
		//Operaciones
		
		resultadoArea= Math.PI * Math.pow(radio, 2);
		resultadoVolumen= resultadoArea * altura;
		return resultadoVolumen;
		
		//Fin Operaciones
		
		
	//Fin de nuestros métodos
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
