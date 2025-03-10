package org.generation.userGen.controller;

import java.util.List;

import org.generation.userGen.model.UserEntity;
import org.generation.userGen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Esta clase debe anotarse como un Controller de tipo Rest con la anotación @RestController
//En esta clase debemos `mapear` basandonos en los métodos HTTP (Get, Post, Put, Delete, Patch, Head, etc.) y definir los endpoints de nuestra API
//Podemos definir un endpoint general anotando la clase con @RequestMapping y en paréntesis el end point como String


@RestController
@RequestMapping ("/api/v1")
public class UserController {
    // Traemos a UserService mediante inyección de dependencias, creando una instancia de la misma y debemos inyectarla al constructor de la clase UserController

    private final UserService userService;
    
    // Inyectemos service dentro del constructor, y debemos indicar la inyección de dependencias mediante la anotación @Autowired
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    
    // Crear un método que nos permita `mapear` lo que vive dentro de Service
    //Este método permite recuperar a los usuarios (Get)
    @GetMapping ("/users")
    public List<UserEntity> getUsers() {
        return this.userService.getAll();    
    }
    
    
    
    
    
}
