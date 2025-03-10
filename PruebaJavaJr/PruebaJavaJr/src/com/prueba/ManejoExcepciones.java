package com.prueba;
import java.util.Scanner;


public class ManejoExcepciones {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Ingresa el denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No puedes dividir por cero.");
        } finally {
            scanner.close();
        }
    }

}
