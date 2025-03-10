package org.generation.poo27nov;

public class Poo2 {


public static void main(String[] args) {

			//Instanciar nuevos objetos a partir de la clase Poo
	poo27Nov arezbi = new poo27Nov("Arezbi", "Zuñiga", 26, 18.000d, "Desarrolladora");
	poo27Nov abigail = new poo27Nov("Abigail", "Sanchez", 28, 30.000d, "Desarrolladora");
	poo27Nov abigal = new poo27Nov("Abigail", "Villeda", 26, 25.000d, "Desarrolladora");
	poo27Nov mariana = new poo27Nov("Mariana", "Torres", 26, 30.000d, "Desarrolladora");

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






