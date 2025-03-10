package org.generation.java11;

/*Las interfaces son contratos entre las clases
 * que definen como debe ser la clase
 * y como se debe de comportar para asegurarnos
 * que esta clase cumpla con lo que necesitamos*
 */

interface Vendible {
	//int constant= 10;
	//double VERSYS= 10;
	void mostrarDetalles ();
	double calcularPrecio ();
	
} 

public class Producto implements Vendible {
//public abstract class Producto {
	public String nombre;
	public double precioBase;
	
	public Producto (String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	
	//public abstract double calcularPrecioFinal ();
		
	public void mostrarDetalles () {
		System.out.println ("Nombre producto: " + nombre + "precio base: $ " + precioBase);
		
	}
	
	
	
	
	 @Override
	    public double calcularPrecio() {
	        return precioBase; // Devuelve el precio base, puedes modificar la lógica aquí
	    }
	
	 
	 
	 // 	 public double mostrarDetalles (String mesesGarantia) {
	 public void mostrarDetalles (String mesesGarantia) {
		 System.out.println("Nombre producto: " + nombre + "precio base: $ " + precioBase + "mesesGarantia " + mesesGarantia); 
	 }
	 
	 //public double mostrarDetalles(int mesesGarantia) {

	 public void mostrarDetalles(int mesesGarantia) {
		 System.out.println("Nombre producto: " + nombre + "precio base: $ " + precioBase + "mesesGarantia " + mesesGarantia); 
	 }
	 
	 
	}

