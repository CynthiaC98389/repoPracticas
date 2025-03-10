package org.generation.hilos;

public class Ejemplo {

}


public class Ejemplo {
    // atributo string nombre
      private String name;
      //constructor
      public Ejemplo(String name) {
        this.name = name;
      }

      public void run() {
          // imprime nombre
        for (int i = 0; i < 20; i++) {
          System.out.println(i + " " + getName());
        }
        //Terminaje
        System.out.println("Termina withOutthread " + getName());
      }

      private String getName() {
        return name;
      }
    }

