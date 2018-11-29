package ejercicio9;

public class Ticket {
	
	//Atributos
	
	private double preciounitario;
	private int id;
	private String linea;
	
	
	
	//Fin Atributos
	
	
	//Constructores
	
		//Constructor sin Atributos
	
	public Ticket() {
	}

		//Fin Constructor sin Atributos
	
	
	
	
		//Constructor Con Todos los Atributos
	
	public Ticket(double preciounitario, int id, String linea) {
		this.preciounitario = preciounitario;
		this.id = id;
		this.linea = linea;
	}

	
	
		//Fin Constructor Con Todos los Atributos
	
	//Fin COnstructores
	
	//Getters And Setters
	
	public double getPreciounitario() {
		return preciounitario;
	}

	public void setPreciounitario(double preciounitario) {
		this.preciounitario = preciounitario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	
	
	//Fin Getters And Setters
	
	//Método ToString
	
	
	@Override
	public String toString() {
		return "Ticket [preciounitario=" + preciounitario + ", id=" + id + ", linea=" + linea + "]";
	}
	
	
	//Fin Método ToString
	
	
	//Nuestros Métodos
	
	public void imprimirDatosBillete (int numTickets) {
		
		System.out.println("Billete de la línea " + linea);
		System.out.println("Válido para "+ numTickets + " personas");
		System.out.println(id);
		
	}
	
	//Fin Nuestros Métodos

}
