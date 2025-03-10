package org.generation.java11;

public class Tienda {

	public static void main(String[] args) {
		
		Producto sabanaKit = new Producto ("sabana", 145.00);
		Electronico tablet = new Electronico("airPad", 15000, 3);
		Producto producto1 = new Electronico ("mouse", 135, 3);
		
		
		tablet.mostrarDetalles ();
		
		tablet.mostrarDetalles(tablet.mesesGarantia);
		System.out.println("Producto electronico " + tablet.calcularPrecio());
		System.out.println("Producto " + sabanaKit.calcularPrecio());
		
		producto1.mostrarDetalles();
		
		
		}	
		
	}

