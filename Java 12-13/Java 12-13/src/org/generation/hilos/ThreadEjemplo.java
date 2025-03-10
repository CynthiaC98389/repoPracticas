package org.generation.hilos;

public class ThreadEjemplo extends Thread {

    public ThreadEjemplo(String nombre) {
         // Al usar super(str), se está llamando a al constructor de la clase Thread para que el nombre del hilo se establezca con el valor proporcionado (str).
        super(nombre);
      }
     @Override
      public void run() {
        for (int i = 0; i < 20; i++) {
          System.out.println(i + " " + getName());
        }
        System.out.println("Termina thread " + getName());
      }
}

