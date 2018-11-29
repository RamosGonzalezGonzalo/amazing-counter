package ejercicio7;

public class Cuenta {
	
	//Atributos
	
	double saldo;
	String nombreTitular, iban;
	
	
	//Fin Atributos
	
	//Constructores
	
		//Constructor sin Atributos
	
	public Cuenta() {
		
	}
	
		//Fin Constructor sin Atributos
	
		//Constructor con Atributos
	
	public Cuenta(double saldo, String nombreTitular, String iban) {
		super();
		this.saldo = saldo;
		this.nombreTitular = nombreTitular;
		this.iban = iban;
	}

	
	
		//Fin Constructor con atributos
	
	//Fin Constructores
	
	//Getters and Setters
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	
	
	//Fin Getters Setter
	
	//Método ToString
	
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", nombreTitular=" + nombreTitular + ", iban=" + iban + "]";
	}
	
	//Fin Método ToString
	
	
	
	
	//Nuestros Métodos. Casos en lo que haya que actualizar y devolverlo, hacemos las 2 cosas juntas.
	
		//Metodo de Comprobar
	
	public void comprobarSaldoV1() {//Usamos el atributo que tenemos arriba.
		
		System.out.println("Su saldo: "+100+saldo );
		
	}
	
		//Fin Método Comprobar
	
		//Método Ingresar
	
	
	public void ingresarDineroV1(double cantIngresada) {//Usamos una variable que nos da el usuario
		
		saldo= saldo + cantIngresada;
		
	}
	
		//Fin Método Ingresar
	
	public void retirarDinero (double cantRetirada) {
		
		saldo= saldo - cantRetirada;
		
		
	}
	
	
	
	//Fin de Nuestros Métodos
	
	
	
	
	

}
