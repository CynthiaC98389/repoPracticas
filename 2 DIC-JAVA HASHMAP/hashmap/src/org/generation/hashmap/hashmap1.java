package org.generation.hashmap;


/*Esta clase es la plantilla de mi objeto que recibe
 * atributos y comportamientos (variables de instancia)
 * y (metodos  del objeto)
 * */

public class hashmap1 {

	/*declarar atributos (variables de instancia: Deben
	 * especificar el tipo de dato)
	 * */
	



	
	
	
	
	String nombre;
	String apellido;
	int edad;
	double salario;
	String puesto;
	
	
	
	public hashmap1 (String nombre, String apellido, int edad, double salario, String puesto) {
		//super();
		
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.puesto = puesto;
		
		
	}
	
	
	//Metodos de comportamiento
	public void trabajar () {
		System.out.println ("Estoy trabajando");
	}
	//Metodo para calcular el salario
	public void calcularSalario () {
		
		System.out.println ("El salario es de $ " + this.salario);
	}
	
	//Metodo para ver info
	public void informacion () {
		System.out.println ("Nombre: " + this.nombre + ", Apellido" + this.apellido + ", Edad:" + this.edad + " , El salario es" + this.salario + ", El puesto es" + this.puesto);			
}
	
	
	
	
	

	//metodos de accesibilidad y modificacion (getters y setters)	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
			
	//Metodos de conversion a String (toString)
	//Permite convertir la informacion de los objetos en String
	
	
	@Override
	
	
	public String toString() {
		return "hashmap1 [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", puesto=" + puesto + "]";
	}
	
	
	
}