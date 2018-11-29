package ejercicio10;

public class Alumno {
	
	//Atributos
	
	private int edad, identificador;
	private String nombre, apellidos;
	private double notaLengua, notaMates, notaHistoria;
	
	
	//Atributos
	
	
	//Constructores
	
		//Constructor sin Atributos
	
	public Alumno() {
	}
	

		//Fin COnstructor Sin Atributos
	
		//Constructor con atributo Nombre
	
	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	
		//FIn Constructor con atributo nombre
	
	
		//Constructor con Todos los Atributos
	
	
	public Alumno(int edad, int identificador, String nombre, String apellidos, double notaLengua, double notaMates,
			double notaHistoria) {
		this.edad = edad;
		this.identificador = identificador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaLengua = notaLengua;
		this.notaMates = notaMates;
		this.notaHistoria = notaHistoria;
	}


		//Fin Constructor con Todos los Atributos
	
	//Fin Constructores
	
	
	//Getters And Setters
	
	
	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public int getIdentificador() {
		return identificador;
	}



	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public double getNotaLengua() {
		return notaLengua;
	}



	public void setNotaLengua(double notaLengua) {
		this.notaLengua = notaLengua;
	}



	public double getNotaMates() {
		return notaMates;
	}



	public void setNotaMates(double notaMates) {
		this.notaMates = notaMates;
	}



	public double getNotaHistoria() {
		return notaHistoria;
	}



	public void setNotaHistoria(double notaHistoria) {
		this.notaHistoria = notaHistoria;
	}

	
	//Fin Getters And Setters
	
	
	//Método ToString
	

	@Override
	public String toString() {
		return "Alumno [edad=" + edad + ", identificador=" + identificador + ", nombre=" + nombre + ", apellidos="
				+ apellidos + "]";
	}
	
	
	//Fin Método ToString
	
	
	//Nuestros Métodos
	
	public double calcularMedia () {
		double sumaNota, media;
		int numNotas=3;
		//sumaNota=this.notaHistoria + this.notaLengua + this.notaMates;
		sumaNota=notaHistoria +notaLengua+notaMates;
		media= sumaNota / numNotas;
		return media;
	}
	
	
	
	//Fin Nuestros Métodos
	
	
	
	
	
	

}
