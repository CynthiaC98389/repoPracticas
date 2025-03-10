package com.pruebaTecnica;


import java.util.Arrays;
import java.util.Random;


public class ArrayOrdenado {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        // Llenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100); // Números entre 0 y 99
        }

        System.out.println("Array original: " + Arrays.toString(numeros));

        // Algoritmo de burbuja para ordenar el array
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}


public class ArrayOrdenado {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        // Llenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100); // Números entre 0 y 99
        }

        System.out.println("Array original: " + Arrays.toString(numeros));

        // Algoritmo de burbuja para ordenar el array
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
