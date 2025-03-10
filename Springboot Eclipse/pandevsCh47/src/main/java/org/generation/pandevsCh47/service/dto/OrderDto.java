package org.generation.pandevsCh47.service.dto;

import java.time.LocalDateTime;

//Aqui vamos a agregar las variables de instancia necesarias para construir una Order

public class OrderDto {

	private Long idUser; //id que me permite asociar la Orden al User
	private LocalDateTime date;
	private Double total;
	
	
	
	// GETTERS Y SETTERS
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
	
	
	
	
}
