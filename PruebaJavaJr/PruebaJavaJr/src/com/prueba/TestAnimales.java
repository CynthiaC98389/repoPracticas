package com.prueba;

public class TestAnimales {
    public static void main(String[] args) {
        Animal[] animales = { new Perro(), new Gato(), new Pajaro() };

        for (Animal animal : animales) {
            animal.hacerRuido();
            animal.comer();
            System.out.println("---------------");
        }
    }
}