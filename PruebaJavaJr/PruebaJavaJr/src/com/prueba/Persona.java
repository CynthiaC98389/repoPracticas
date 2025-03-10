package com.prueba;

import java.util.ArrayList;
import java.util.List;


public class Persona {
	 private String nombre;
	    private int edad;
	    private List<String> hobbies;

	    public Persona(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.hobbies = new ArrayList<>();
	    }

	    public void agregarHobby(String hobby) {
	        hobbies.add(hobby);
	    }

	    public void mostrarInfo() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Edad: " + edad);
	        System.out.println("Hobbies: " + hobbies);
	    }

}
