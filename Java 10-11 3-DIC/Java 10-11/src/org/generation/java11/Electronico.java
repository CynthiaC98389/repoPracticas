package org.generation.java11;

/**Define cuando un 
 * producto es del tipo electronico*/
/*La haerencia se hace mediante la palabra reservada extends*/

public class Electronico extends Producto{
public int mesesGarantia; 

	public Electronico (String nombre, double precio, int mesesGarantia) {
	super (nombre, precio);
	this.mesesGarantia = mesesGarantia;

	
	
	}
	
	public double calcularPrecio () {
		return precioBase * 1.16;
		
	}
	
	@Override
	public void mostrarDetalles () {
		System.out.println("Hola este es un producto electronico y su precio base: $ " + precioBase + " Meses garantia " + mesesGarantia + " Nombre Producto " );
	}
}


//@Override
//public double calcularPrecioFInal () {
//	return calcularPrecio () + 20;
//}
