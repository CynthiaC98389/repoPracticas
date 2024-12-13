
/*
1.obtener con js el numero 1
2.obtener con js el numero 2
3.Hacer que los botones funciones
4.Crear función suma
5.crear la función resta
6.Crear la función multiplicación
7. Mostrar el resultado en nuestro html
8. Agregar como parámetros los números 1 y 2 a nuestras funciones
*/

/*let resultado;

function onInputOneChange(){
    let numero1Local = parseFloat(document.getElementById ("numero1").value);
    let numero2Local = parseFloat(document.getElementById ("numero2").value);

}*/


let resultado;

function onInputOneChange(){
    let numero1Local = parseFloat(document.getElementById("numero1").value);
    let numero2Local  = parseFloat(document.getElementById("numero2").value);
}

function operacionMatematica(typoOperacion){
    let numero1 = parseFloat(document.getElementById("numero1").value);
    let numero2 = parseFloat(document.getElementById("numero2").value);
    switch(typoOperacion){
        case "suma":
            resultado = numero1 + numero2;
            break;
        case "resta":
            resultado = numero1 - numero2;
            break;
        case "multi":
            resultado = numero1 * numero2;
            break;
        default:
             alert("syntax error");
    }
   document.getElementById("result").innerHTML = `Resultado: ${resultado}`;
}

