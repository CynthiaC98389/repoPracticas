package org.generation.unitTesting;

public class CalculadoraMain {

	public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        //Invoco los métodos
        System.out.println(calculadora.sumar(1, 1));
        System.out.println(calculadora.restar(1, 1));
        System.out.println(calculadora.multiplicar(1, 1));
        System.out.println(calculadora.dividir(1, 1));
   
	}
	}

