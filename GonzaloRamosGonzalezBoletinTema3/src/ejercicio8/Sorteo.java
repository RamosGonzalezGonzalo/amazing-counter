package ejercicio8;

public class Sorteo {
	
	//Atributos
	
	int numPremiado, numElegido;

	
	
	//Fin Atributos
	
	//Constructor sin Atributos.
	
	public Sorteo() {
		
	}



	
	
	//Fin Constructor sin Atributos
	
	
	//Constructor Con Los Atributos
	
	public Sorteo(int numPremiado, int numElegido) {
		this.numPremiado = numPremiado;
		this.numElegido = numElegido;
	}


	//Fin Constructor con Atributos
	
	
	//Getters And Setters
	
	public int getNumPremiado() {//Get NumPremiado
		return numPremiado;
	}





	public void setNumPremiado(int numPremiado) {//Set NumPremiado
		this.numPremiado = numPremiado;
	}





	public int getNumElegido() {//Get NumElegido
		return numElegido;
	}





	public void setNumElegido(int numElegido) {//Set NumElegido
		this.numElegido = numElegido;
	}

	
	//Fin Getters And Setters
	
	
	//Método ToString
	
	@Override
	public String toString() {
		return "Sorteo [numPremiado=" + numPremiado + ", numElegido=" + numElegido + "]";
	}
	
	//Fin Método ToString
	
	
	
	//Nuestros Métodos
	
	public int obtenerBoleto(int numBoleto) {
		
		return numBoleto;
		
	}
	
	
	public void hacerSorteo() {
		
		return
	}
	
	//Fin Nuestros Métodos
	
	
	
	

}
