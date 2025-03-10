package org.generation.userGen.model;

//Crear nuestro Objeto Modelo, es decir, el objeto con las variables de instancia (atributos) y metodos (comportamientos)


public class UserEntity {
	//Atributos (variables de instancia )
	private Long id;
	private String username;
	private String email;
	private String password;
	
	// Método constructor
	
	public UserEntity(Long id, String username, String email, String password) {
		//NO SE PORQUE LO PONE super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	
	//GETTERS Y SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	
	
}
