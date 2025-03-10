package org.generation.hilos;

public class Main {
	  public static void main(String[] args) {
		//Instanciando dos ejemplos sin hilos
		      Ejemplo ejemplo1 = new Ejemplo("Carlos");
		      Ejemplo ejemplo2 = new Ejemplo("Eduardo");
		      //Corriendo metodo de clase sin hilos
		      ejemplo1.run();
		      ejemplo2.run();
		      //Termina
		      System.out.println("Termina thread main");
		      
		      System.out.println("*********************");

		      // Crea dos objetos de la clase ThreadEjemplo
		      // e inicia ambos hilos
		       // Ejemplos con hilos
		      ThreadEjemplo hilo1 = new ThreadEjemplo("hilo carlos");
		      ThreadEjemplo hilo2 = new ThreadEjemplo("hilo eduardo");

		      // Iniciar hilos
		      hilo1.start();
		      hilo2.start();
		      

		    }

		  }
