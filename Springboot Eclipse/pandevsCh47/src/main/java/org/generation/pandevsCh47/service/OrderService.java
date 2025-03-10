package org.generation.pandevsCh47.service;

import java.util.List;

import org.generation.pandevsCh47.exceptions.UserNotFoundException;
import org.generation.pandevsCh47.model.OrderEntity;
import org.generation.pandevsCh47.model.UserEntity;
import org.generation.pandevsCh47.repository.OrderRepository;
import org.generation.pandevsCh47.repository.UserRepository;
import org.generation.pandevsCh47.service.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	private final OrderRepository orderRepository;
	
	
	//Instanciar a UserRepository para tener disponible y acceder a sus métodos
	
	private final UserRepository userRepository;

	@Autowired
	public OrderService(OrderRepository orderRepository, UserRepository userRepository) {
		super();
		this.orderRepository = orderRepository;
		this.userRepository = userRepository;
	}
	
	
	//Método para acceder a todas las Orders
	public List <OrderEntity> orders() {
		return this.orderRepository.findAll();
	
	}
	
	//Método para crear una ORDER ligada a un USER
	//La nueva Order recibe los atributos de OrderDto
	
	
	public OrderEntity createOrder(OrderDto dto) {
		
		//Buscar el User mediante Id
		UserEntity user = this.userRepository.findById(dto.getIdUser())
				.orElseThrow(()-> new UserNotFoundException (dto.getIdUser()));
		
		
		//Crear la Order con dto
		OrderEntity order = new OrderEntity ();
		order.setDate(dto.getDate ());
		order.setTotal (dto.getTotal ());
		order.setUser(user);
		
		return this.orderRepository.save(order);
		
		
	}
	
	
	
}
