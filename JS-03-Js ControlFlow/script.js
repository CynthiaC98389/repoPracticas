//Habiamos comentado que el flujo javascript es el proceso en el cual 
//se van interprentando las lineas de tu codigo y es un flujo, se puede interrumpir,
//se puede pausar y ejecutar en un solo hilo o línea



console.log(1);
console.log(2);
console.log(3);


const jsFlow = () => {
    console.log(4);

}

// invocar
jsFlow();


//if y el else son ejecutables que modifican el flujo de control de javascript, 
//las condicionales if y else modifican el flujo al crear dos posibles bloques de codigo ejecutable que en lenguaje natural serian dos finales posibles

const mostrarMensaje = (mensaje) => {
    alert (mensaje);
}


const validarEdad = (edad) =>{
    if (edad >= 18) {
        mostrarMensaje ("bbva te presta mil pesos");}
    else{
        mostrarMensaje ("bbva necesitas tener 18 años");
    } 
    if (edad=== 25) {
        console.log ("es un buen candidato")

    }
} 

validarEdad (25);
/*Javascript utiliza estructura de control de flujo para hacer tu codigo eficiente y flexible
Estas estructuras son:
1. Condicionales (if, else, if, else), switch (con base a casos));
2. Ciclos (for, while, do... while): la manera en que controlar el flujo es por medio de iteraciones
3. Controles de salto (break): es capaz de modficicar y romper los ciclos permitiendote salir del ciclo o saltar de una iteracion especifica
*/

//switch -> es como en la vida real, tenemos una serie de casos o categorias pre
//en las cuales necesitamos que nuestros bloques de codigo se ejecuten segun sea el caso a validar

const validarNoLaborable = (dia) => {
    switch (dia){
        
        case "Lunes"; 
        case "Martes"; 
        case "Miercoles"; 
        case "Jueves"; 
        case "Viernes"; 
        case "sabado"; 

        case "Domingo";
        console.log ("dia no laborable");
        break;
        default: 
        break;
    
    } 
}

validarNoLaborable ("Sabado");