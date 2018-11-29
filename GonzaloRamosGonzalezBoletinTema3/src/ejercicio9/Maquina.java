package ejercicio9;

public class Maquina {//Sólo métodos
	
	//Atributo
	
	private Ticket t;//Poniendo este atributo podremos acceder a los atributos de nuestra clase Ticket.
	

	
	



	//Fin Atributos
	
	
	
	
	//Constructores
	
	
		//Constructor sin Atributos
	
	public Maquina() {
	}
		//Fin Constructor sin Atributos
	
	
	
	
		//Constructor con Todos Atributos
	public Maquina(Ticket t) {
		this.t = t;
	}
		//Fin COnstructor con Todos Atributos




	
	
	//Fin Constructores
	
	
	
	//Getters And Setters
	
	public Ticket getT() {//Get de t
		return t;
	}




	public void setT(Ticket t) {//Set de t
		this.t = t;
	}




	
	
	//Fin Getters And Setters
	
	
	//Método ToString
	
	@Override
	public String toString() {
		return "Maquina [t=" + t + "]";
	}
	
	//Fin método ToString
	
	
	
	
	//Nuestros Métodos
	
	public double comprarBilletes(int numTickets, double preciounitario) {
		double precioFinal;
		precioFinal= numTickets * preciounitario;
		
		return precioFinal;
		
		
	}
	public double devolverBillete (double precioF, double cantPagada) {
		double devolucion;
		
		devolucion = cantPagada - precioF;
		return devolucion;
	}
	
	
	
	
	//Fin Nuestros Métodos

}
