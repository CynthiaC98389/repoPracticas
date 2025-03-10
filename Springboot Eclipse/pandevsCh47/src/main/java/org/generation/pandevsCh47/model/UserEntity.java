package org.generation.pandevsCh47.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//Tenemos que convertir nuestra clase Java en una entidad usando la anotación @Entity
//Para indicar que esta Entidad se va a transformar en una Tabla, debemos anotar con @Table



@Entity
@Table (name = "users")


public class UserEntity {
	
	
	@Id // Anota que este atributo es una PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)// Genere un valor automático mediante una estrategia de tipo IDENTITY (AutoIncrementable) 
	
	@Column (name = "id_user" )
	
	private Long id;
	
	@Column (name = "username",length = 30, nullable = false, unique = true)
	private String username;
	
	
	@Column (name = "email", length = 80, nullable = false, unique = true)
	private String email;
	
	
	
	@Column (name = "password", length = 60, nullable = false, unique = false)
	private String password;
	
	
	/* ESTO SE TRABAJA EN PROYECTOS CON ORDENES------ SE PUEDE INCLUIR EN NUESTRO PROYECTO
	 * ******************************
	 * ******************************
	 * *****************************
	 * ******************************
	 * 
	@Column (columnDefinition = "DATETIME")
	private LocalDateTime date;
	
	@Column (columnDefinition = "DOUBLE (7,2)". nullable= false, unique= false)
	private Double price; 
	*/
	
	
	//--------------------------------
	
	//--Relación con Order 1:N
	//-------------------------
	
	
	//Hay que añadirlo al constructor y generar sus Getter y Setters
	
	@OneToMany (mappedBy = "user")
	private List <OrderEntity> orders;
	
	
	
	//JPA me pide tener dentro de mi Entity un constructor vacío
	
	public UserEntity() {
		
	}

	
	

	public UserEntity(Long id, String username, String email, String password, List<OrderEntity> orders) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.orders = orders;
	}




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

	
	
	
	
	
	
	
	
	
	

	public List<OrderEntity> getOrders() {
		return orders;
	}




	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}




	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}




	@Override
	public int hashCode() {
		return Objects.hash(email, id, orders, password, username);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(orders, other.orders) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}




}
