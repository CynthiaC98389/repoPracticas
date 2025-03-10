package org.generation.pandevsCh47.controller;

import java.util.EmptyStackException;
import java.util.List;

import org.generation.pandevsCh47.model.OrderEntity;
import org.generation.pandevsCh47.service.OrderService;
import org.generation.pandevsCh47.service.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1")
public class OrderController {
	private final OrderService orderService;
	
@Autowired
	public OrderController (OrderService orderService) {
		this.orderService = orderService;
		
	}
	
//Método para mapear a todas las Orders
@GetMapping ("/orders")
public ResponseEntity <List <OrderEntity>> getAll () {
	try {
	if (!this.orderService.orders ().isEmpty ()) {
		return ResponseEntity.ok(this.orderService.orders());
	}
	return ResponseEntity.badRequest ().body(this.orderService.orders());

	} catch (EmptyStackException e) {
		return ResponseEntity.notFound().build();
	}
	
	
	
}
	//Método para mapear la Orden creada
@PostMapping ("/create-order")
public ResponseEntity <OrderEntity> createOrder (@RequestBody OrderDto dto) {
	return ResponseEntity.status(HttpStatus.CREATED).body(this.orderService.createOrder(dto)); 

}







}
