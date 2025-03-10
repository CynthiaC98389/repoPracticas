package org.generation.pandevsCh47.service;

import java.util.List;

import org.generation.pandevsCh47.exceptions.UserNotFoundException;
import org.generation.pandevsCh47.model.UserEntity;
import org.generation.pandevsCh47.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	//Instanciar UserRepository a e inyectarlo en el constructor
	private final UserRepository userRepository;
	
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	//Metodo para obtener a todos los User
	
	public List <UserEntity> getAll() {
		return this.userRepository.findAll();
		
	}
	
	//Metodo para crear un nuevo Usuario
	public UserEntity createUser (UserEntity newUser) {
		return this.userRepository.save(newUser);
		
	}
	

	//Método para obtener un único usuario por su id
	/*Puedo convertirel metodo a tipo Optional <> ya que el metodo `findById es de tipo Opcional
	 * public Opcional UserEntity userById (Long id) {
		return this.userRepository.findById(id)
		
	*/	
		
	//Para poder manejar el método, debemos crear una Excepción ligada al método Optional
	//Esa Exception es de tipo RunTimeException para indicar que un usuario no se encontro por su ID
	public UserEntity userById (Long id) {
		return this.userRepository
				.findById(id)
				.orElseThrow (()-> new UserNotFoundException (id));
		
	
	}
	
	//Metodo para eliminar un usuario por ID
		public void deleteUser (Long id) {
			if (this.userRepository.existsById(id)) {
				this.userRepository.deleteById(id);
			} else {
				throw new UserNotFoundException (id);
			}
			
	
		
		
	}

		//Método para recuperar por Email
		public UserEntity findByEmail (String email) {
			return this.userRepository.findByEmail(email);
		}
		
		
		
		
		//GetAll, GetByID, GetByEmail, Posto1, Post02, DeletebuID, PUT, PATCH
		
		
		
		
		//Método para actualizar al User
		public UserEntity updateUser (UserEntity user, Long id) {
			return this.userRepository.findById (id)
					.map(userField -> {
						userField.setUsername(user.getUsername());
						return this.userRepository.save(userField);
						
					})
			.orElseThrow(()-> new UserNotFoundException (id));
			
		}
		
		
		
		
		
		
}
