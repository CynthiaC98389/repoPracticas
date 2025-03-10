package org.generation.poo;

public class pooJava {

	public static void main(String[] args) {

		//Instanciar nuevos objetos a partir de la clase Poo
		Poo arezbi = new Poo("Arezbi", "Zuñiga", 26, 18.000d, "Desarrolladora");
		Poo abigail = new Poo("Abigail", "Sanchez", 28, 30.000d, "Desarrolladora");
		Poo abigal = new Poo("Abigail", "Villeda", 26, 25.000d, "Desarrolladora");
		Poo mariana = new Poo("Mariana", "Torres", 26, 30.000d, "Desarrolladora");

		//Invocando metodos de comportamiento del objeto
		mariana.trabajar();
		abigal.calcularSalario();
		arezbi.informacion();


		//acceder a la informacion de los objetos (getters)
		System.out.println(abigail.getPuesto()+ "" + abigail.getSalario());

		//Modificar informacion (setters)
		double nuevoSalario = abigail.getSalario() + 5.000;
		abigail.setSalario(nuevoSalario);

		System.out.println(abigail);

		
		
	
		
		
	}

}
