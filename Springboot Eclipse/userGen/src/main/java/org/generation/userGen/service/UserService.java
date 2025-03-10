package org.generation.userGen.service;
import java.util.ArrayList;
import java.util.List;

import org.generation.userGen.model.UserEntity;
import org.springframework.stereotype.Service;

//Debemos anotar esta clase como un Service con la anotación @Service
//En esta clase definimos los métodos que correspondan a la lógica comercial




@Service

public class UserService {
	
    // Vamos a emular una DB mediante una Lista, donde los elementos de la lista viven en el constructor de la clase

	
    private final List<UserEntity> user = new ArrayList<UserEntity>();
    
    // La lista va a recibir usuarios de tipo UserEntity y se agregan en el constructor
    public UserService() {
        user.add(new UserEntity(1L, "danieldlcm", "daniel@gen.org", "genmx"));
        user.add(new UserEntity(2L, "fer.ramos", "fercita@gmail.com", "burbuja123"));
        user.add(new UserEntity(3L,"Irving", "Irving@gmail.com", "Password"));
        user.add(new UserEntity(4L, "ArezbiOa", "arez@gmail.com", "ch47"));
        user.add(new UserEntity(5L, "crisgamboa","cristian@gmail.org","cristian123"));
        user.add(new UserEntity(99L, "alexSV", "a@b.c", "pass"));
        user.add(new UserEntity(6L, "AbyBonita", "aby@gen.org", "Pa$$w0rd"));
        user.add(new UserEntity(11L, "abbyvi", "abby@gmail.com", "68346829"));
        user.add(new UserEntity(26L,"xamitl.hernandez","xamitlhernandez@gmail.com","xa09"));
        user.add(new UserEntity(14L, "Luis Garduño", "gardunoarrietaj@gmail.com", "akatsuki"));
        user.add(new UserEntity(62L,"Mayte", "mayte@gmail.com", "ch_47Zz"));
        user.add(new UserEntity(13L, "Xaxiry Gonzalez", "Xaxiry.magaly@gmail.com", "Xamagor4"));
    	
    }

    // Método para consultar todos los usuarios disponible

    public List<UserEntity> getAll() {
        return user;
    }
	
	
	

    
    
}
