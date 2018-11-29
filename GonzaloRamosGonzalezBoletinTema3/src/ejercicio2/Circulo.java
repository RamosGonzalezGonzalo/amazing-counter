package ejercicio2;

public class Circulo { //Sustantivo para los objetos
	
	//Atributos. Si dudamos, mejor ponerlo. No importa que sobre
	
	double radio;
	
	
	//Constructor

	public Circulo(double radio) {
		
		this.radio = radio;
	}
	
	//Contructor sin parametros. Se utiliza para llamar a los objetos
	
	public Circulo () {
		
	}
	
	
	//Getters and Setters


	public double getRadio() {//Getter
		return radio;//El return debe ser la última linea del get.
	}


	public void setRadio(double radio) {//Setter, se pone void si no devuelve nada
		this.radio = radio;
	}


	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
	
	//Al final nuestros métodos propios
	
	//Radio desde fuera como variable
	
	public double calcularArea (double radio) {// Se pone el tipo que nos va a devolver, en este caso un double. Le damos el radio con el tipo que es double
		
		//No se puede imprimir dentro del método. No sysos.
		
		//Opción 1 con return
		return Math.PI * Math.pow(radio, 2);//Las variables tienen que llamarse igual
		
		/* Opción 2 declaramos variable double result;
		 result= Math.PI * Math.pow(radio, 2);
		 return result;
		 
		 */
		
		
		
		
	}
	
	//Opción 3. Usando valor del atributo
	
	public double calcularAreaV2 () {// Se pone el tipo que nos va a devolver, en este caso un double. Le damos el radio con el tipo que es double
		
		//No se puede imprimir dentro del método. No sysos.
		
		
		return Math.PI * Math.pow(radio, 2);
		
		
		//Siempre que tengamos el atributo arriba es mejor usarlo
		
	}
	
	//Opción 3. Declaramos la variable dentro del método
	
	public double calcularAreaV3 (double radio) {// Se pone el tipo que nos va a devolver, en este caso un double. Le damos el radio con el tipo que es double
		//Declaramos Variable
		double result;
		//Hacemos operaciones
		result=Math.PI * Math.pow(radio, 2);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	

}
