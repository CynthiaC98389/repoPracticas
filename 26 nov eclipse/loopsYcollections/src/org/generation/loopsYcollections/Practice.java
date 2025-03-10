package org.generation.loopsYcollections;

public class Practice {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		/*Loops: While, do while*/

	int contador = 1;
	
	while (contador <= 5 ){
		System.out.println("Iteracion" + contador);
		contador ++;
	}
	System.out.println("-----------------");

	
	
	/*doWhile*/
	int contadorDoWhile = 1;
	do {
		System.out.println ("IteracionDoWhile" + contadorDoWhile);
		contadorDoWhile++;
	}while (contadorDoWhile <= 5);
	
	System.out.println("-----------------");
	
	/*For
	 * Las condiciones de los for se basan en 3 partes: 
	 * 1. La inicializacion -> se inicializa el contador
	 * 2.Ondicion ->se utiliza la comparacion de dos variables el inicializador 
	 * y la cantidad o la condicion que delimite N de iteraciones,
	 * y de preferencia se iguala =
	 * 3. el incremento o actualizacion del contador  
	 * */
	for (int i= 0; i<=5; i++) {
		System.out.println("Contador For:" + i);
		

	}

	
	/*
	 * ForEach Java
	 * *Utiliza la palabra reservada for, similar a como usa un For puro
	 * en lugar de recibir condicional de tres partes (inicializador condicion, incremento)
	 *  va a utilizar una estructura de parametros
	 *  (TipodeElemento elemento (identificadorElemento):collection (array,ArrayList.set,map)
	 
			*/
	
	System.out.println("-------FOR EACH----------");
	String[] names = {"Porygon ","Bigotes ", "Tati " ,"Gladys ", "Liz"};
	String miFamilia="";
	for(String name: names) {
		miFamilia += name;		
	}
	System.out.println(miFamilia);
		}
	
}
