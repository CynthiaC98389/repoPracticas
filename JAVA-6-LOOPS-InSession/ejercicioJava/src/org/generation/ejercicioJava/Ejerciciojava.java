package org.generation.ejercicioJava;
//FOR LOOPS

/*Ejercicio For: Part 3: For loops
Use the for loop to create a programm that ask 
the user to input a name and then prints 
each of the letters of the name
Hint You can use the following String functions:
lenght() -> returns the total number of characters 
of a given String
chartAt(i) -> returns the character at the given 
position(i) of a String*/
/**/
import java.util.Scanner;


public class Ejerciciojava {

	public static void main(String[] args) {
       
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.print("----Pon tu nombre, chiqux preciosx---- ");
	
	
	String palabra = scanner.nextLine();

	        
	for (int i= 0; i< palabra.length(); 
		i++) 
	{char letras = palabra.charAt(i);
		System.out.println("La posicion de cada letra de tu nombre es"
		+ " " + i + " es: " + letras);

	}

		
	scanner.close();	
		
		
	}

}
