//Cuando buscamos modificar un valor de un input html, generalmente utilizamos la siguiente sintaxis
//const inputOne= document.getElementsByID ("input text").value;
//const otroElemento =inputOne.getElementsByID ("")

//La estructura de como interactuamos con el Dom en JS es la siguiente
//  1. Palabra resesrvada: document
//  2. Utilizamos el metodo/Api ---> getElementbyId
//  3. Utilizamos el atributo del elemento que en este caso, conocemos previamente que es un input????
//Por este conocimiento previo sabemos que es atributo value.


document.getElementById("registrarse").addEventListener("click", function () {
    const nombre = document.querySelector("#nombre input").value.trim();
    const password = document.querySelector("#password input").value.trim();
    if (nombre === "") {
        alert("Por favor ingresa tu nombre, este campo no puede quedar vacio");
    
    } else if (password === "") {
        alert ("Contraseña incorrecta")
    } else if (password.length >= 8) {
        
        const mensaje=document.getElementById ("msj");
        //mensaje.className ="valid";
        mensaje.style.display ="none";


    }else{
            alert("Registro completo " + nombre + "!");
        }
});


//alert ("Contraseña no segura");