
/*
Ejecuta el proyecto e intenta comprender cómo funciona.
Cambia el const fallido a verdadero y ejecútalo de nuevo.
Modifica el código para que:
Si se resuelve la promesa, se imprime en la consola "¡promesa resuelta amigo!"
Si la promesa falla, se imprime en la consola "promesa fallida"

const failed = false;

const myPromise = new Promise((resolve, reject) => { 
    if(failed)
        reject('promesa fallida');
    else
        resolve('!promesa resuelta amigo!')
});

function success(result){
  console.log(result);
}

function onFailed(error){
  console.log(error);
}

myPromise.then((result) => success(result))
.catch((error) => onFailed(error));*/

//Javascript tiene la capacidad de ser sincrono y asincrono,
//siendo la parte asincrona la parte que se encarga de administrar los flujos de control
//Como los request
//Estas opciones u operaciones asincronas permiten que el programa siga ejecutando otras 
// tareas mientras espera que la operacion actual se complete, JS es asincrono y podemos utilizar
//funciones predefinidas como set time out, promesas y async/await

//Ejemplo de una funcion sincrona

function procesoSincrono (){
//    console.log ("inicia el proceso sincrono");
    for (let i=0; i < 1e9; i++)  {}
//    console.log ("fin del proceso sincrono");
}

//console.log ("este punto es antes de la funcion");
procesoSincrono ();
//console.log ("despues de la funcion sincrona");

//asincrono
function procesoAsincrono (){
    //console.log ("Inicio el proceso asincrono");

    setTimeout (()=>{
        //console.log ("aqui termina el proceso asincrono");

    }, 5000); 
}
//en5000 es delay

//console.log ("antes de la funcion asincrona");
procesoAsincrono ();
//console.log ("despues de la funcion asincrona");

const url = "https://pokeapi.co/api/v2/pokemon/ditto";

console.log ("antes del fetch");
fetch (url, {
method: 'GET'
}).then ((response) =>{
    //console.log (response.data.name);
    return response.json ();
}).then((data)=>{ 
    console.log(data);
    localStorage.setItem("nombrePokemon", data.name);
    //localStorage.removeItem ("nombrePokemon");
}). catch ((error) =>{
    console.error ("ups no se que paso");
});
console.log ("hasta aqui llego el fetch")


function peleaPokemon () {
    const miPrimerPokemon =localStorage.getItem ("nombrePokemon");
    console.log ("primerContrincante " + miPrimerPokemon);
}


peleaPokemon ();




/*
const persona = {
    nombre: ana, 
    saluda: ()=> console.log("saluda")
}

REVISAR COMO GUARDAR LO DE DITTO EN LA WEB SE USA API JAVASCRIPT
    */



