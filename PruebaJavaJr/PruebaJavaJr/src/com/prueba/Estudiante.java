package com.prueba;

public class Estudiante extends Persona {
    private String carrera;
    



 public Estudiante(String nombre, int edad, String carrera) {
       super(nombre, edad);
       this.carrera = carrera;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Carrera: " + carrera);
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Cynthia", 25, "Ingeniería en Sistemas");
        estudiante.agregarHobby("Programar");
        estudiante.agregarHobby("Leer");
        estudiante.mostrarInfo();
    }
}



