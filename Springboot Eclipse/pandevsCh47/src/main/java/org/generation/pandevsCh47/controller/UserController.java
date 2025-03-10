package org.generation.pandevsCh47.controller;

import java.util.List;

import org.generation.pandevsCh47.exceptions.UserNotFoundException;
import org.generation.pandevsCh47.model.UserEntity;
import org.generation.pandevsCh47.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")


//PUEDO CONFIGURAR LAS POLITICAS DE CORS MEDIANTE LA ANOTACION @CROSSORIGIN

@CrossOrigin (origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})



public class UserController {

	private final UserService userService;

	@Autowired
	//@CrossOrigin --se puede usar aqui
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	//Mapear el metodo getAll ()
	
	@GetMapping ("/users")
	public List <UserEntity> getUsers (){
		return this.userService.getAll();
		
	}
	
	
	
	//Mapear el método createUser () de manera sencilla
	//@RequestBody me permite solicitar el cuerpo (atributos) del Objeto
	//Debo constuir un nuevo objeto (JSON) en Postman
	/*@PostMapping ("/new-user")
	 * public UserEntity createUser (@RequestBody UserEntity newUser) {
	 * return this.userService.createUser (newUser)}
	 * */
	
	@PostMapping ("/new-user")
	public ResponseEntity <UserEntity> createUser (@RequestBody UserEntity newUser) {
		
		
		//SE BORRA - return this.userService.createUser (newUser);
		//Necesito saber si un usuario con ciertas caracteristicas (email y username) ya existe
		//En caso de que ya exista, mandar una respuesta CONFLICT (489)
		//En caso de no existan, se crea un nuevo usuario y se lanza un Status CREATED (201)
		
		if (this.userService.findByEmail(newUser.getEmail())!= null) {
		return new ResponseEntity<> (HttpStatus.CONFLICT);
		//return ResponseEntity.status(HttpsStatus.Conflict).body(this.userService.createUser(newUser.()))

	}
		return ResponseEntity.status(HttpStatus.CREATED).body(this.userService.createUser(newUser));
	
		
	}
	
	//Mappear el método userbyId ()
	@GetMapping ("/users/{id}")
	public UserEntity findById (@PathVariable (name = "id") Long id) {
		return this.userService.userById(id);
		
		
	}
	
	//Mappear el método deleteById ()
	@DeleteMapping ("/delete-user/{id}")
	public void deleteUser (@PathVariable (name = "id") Long id) {
		this.userService.deleteUser (id);
		
	}
	
	//Mapear el método findByEmail utilizando el manejo de respuestas de STATUS HTTP
	@GetMapping ("/users/email/{email}")
	public ResponseEntity <UserEntity> findByEmail (@PathVariable(name= "email") String email) {
		
		
		if (this.userService.findByEmail(email) == null) {
		return ResponseEntity.notFound().build();
		
	}
		
	return ResponseEntity.ok(this.userService.findByEmail(email)); 
	
}
	
	//MAPEAR EL MÉTODO updateUser
	
	@PutMapping ("/update-user/{id}")
	public ResponseEntity<?> updateUser(@RequestBody UserEntity user, @PathVariable (name="id") Long id){
		
		
		try {
			return ResponseEntity.ok(this.userService.updateUser(user, id));
		} catch (UserNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	
	
	
	
	
	
	
}