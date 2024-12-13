document.getElementById ("enviar").addEventListener ("click", function () {


    const nombre = document.querySelector("#nombre input").value.trim();
    const email = document.querySelector("#email input").value.trim();
    const password =document.querySelector("#password input").value.trim();

    if (nombre === "") { //Sirve para identificar que no este vacio
        alert ("Ingresa tu nombre, porfa");
    
    } else if (email === "") {
        alert ("falta que llenes los demas datos");

    } else if (!email.includes ("@")) {
        alert ("correo no aceptado"); 

    }else if (password ==="") {
        alert ("contraseña incorrecta");

    } else if (password.length <= 2){ //&& password.length < 50
        alert ("contraseña no segura, debe contener minimo de 5 caracteres");

    } else if (password.includes (".")) {
        alert ("la contraseña no puede tener ."); 

    } else {
        alert ("Proceso listo, te vemos en la carrera " + nombre + "!");  
        
    }
});   


