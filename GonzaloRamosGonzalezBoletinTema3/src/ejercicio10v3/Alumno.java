package ejercicio10v3;

public class Alumno {
	
	//Atributos
	
	private int edad, identificador;
	private String nombre, apellidos;
	private double [] notas= {0.0, 0.0, 0.0};
	//private double arrayNotas [];
	
	
	
	
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
		this.notas[0] = notaLengua;
		this.notas[1] = notaMates;
		this.notas[2] = notaHistoria;
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
		return notas[0];
	}



	public void setNotaLengua(double notaLengua) {
		this.notas[0] = notaLengua;
	}



	public double getNotaMates() {
		return notas[1];
	}



	public void setNotaMates(double notaMates) {
		this.notas[1] = notaMates;
	}



	public double getNotaHistoria() {
		return notas[2];
	}



	public void setNotaHistoria(double notaHistoria) {
		this.notas[2] = notaHistoria;
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
		sumaNota=this.getNotaHistoria() +this.getNotaLengua()+ this.getNotaMates();
		media= sumaNota / numNotas;
		return media;
	}
	
	
	
	//Fin Nuestros Métodos
	
	
	
	
	
	

}
