package org.generation.hashmap;

public class hashmap2 {


public static void main(String[] args) {

			//Instanciar nuevos objetos a partir de la clase Poo
	hashmap1 arezbi = new hashmap1("Arezbi", "Zuñiga", 26, 18.000d, "Desarrolladora");
	hashmap1 abigail = new hashmap1("Abigail", "Sanchez", 28, 30.000d, "Desarrolladora");
	hashmap1 abigal = new hashmap1("Abigail", "Villeda", 26, 25.000d, "Desarrolladora");
	hashmap1 mariana = new hashmap1("Mariana", "Torres", 26, 30.000d, "Desarrolladora");

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
