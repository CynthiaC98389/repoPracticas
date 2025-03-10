package org.generation.pandevsCh47.repository;

import org.generation.pandevsCh47.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//En esta interface extenderemos de un Repositorio existente que nos permite acceder a todos los metodos dispoibles en el mismo

// JpaRepository va a trabajar de la mano con la Entity (UserEntity) y para pder indicar que UserEntity es el modelo a trabajar, JpaRepository toma como parámetros el mismo nombre de la Entity y el tipo de dato de la PK
public interface UserRepository extends JpaRepository <UserEntity, Long> {

	//Crear metodos Query de JPA
	//El alias es u puede ser cualquiera q uno quiera
@Query ("SELECT u FROM UserEntity u  WHERE u.email = ?1")
UserEntity findByEmail (String email);



}



