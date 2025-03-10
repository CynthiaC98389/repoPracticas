package org.generation.pandevsCh47.exceptions;

//La clase hereda de RunTimeException
//La interface Serializable nos permite transfroamr el objeto en un flujo
// de bytes para usarlo en otras clases

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	
	
	//Definir método constructor que evalua un parámetro
	//Como RunTimeEception puede recibir un constructor de --
	//tipo String, vamos a recibir un mensaje
	

	public UserNotFoundException(Long id) {
		super("User with id: " + id + " not found");
		
		
		
	}
	

}
