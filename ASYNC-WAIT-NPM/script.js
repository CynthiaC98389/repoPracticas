/*

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
*/

    
    
    
const url = "https://pokeapi.co/api/v2/pokemon/ditto";
    
//console.log ("antes del fetch");
fetch (url, {
method: 'GET'
}).then ((response) =>{
    //console.log (response.data.name);
    return response.json ();
}).then((data)=>{ 
    //console.log(data);
    localStorage.setItem("nombrePokemon", data.name);
    //localStorage.removeItem ("nombrePokemon");
}). catch ((error) =>{
    //console.error ("ups no se que paso");
});
//console.log ("hasta aqui llego el fetch")


function peleaPokemon () {
    const miPrimerPokemon =localStorage.getItem ("nombrePokemon");
    //console.log ("primerContrincante " + miPrimerPokemon);
}


peleaPokemon ();

//promesas
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
.catch((error) => onFailed(error));

//ASYNC AWAIT


//funciones dummy o mock
//Se usan para hacer pruebas y se usa un fetch pero sin hacer request
//no hay rejected, solo se resuelve, no es capaz de ser rechazada
function dummyFetch(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            reject("datosDummys");
        },3000)
    })
}
//desde el uso de la palabra reservada async, estas declarando que la funcion es asincrona por lo tanto retorna una promesa
//Dentro de una funciona asincrona, creas una variable const o let para colocar un await Y despues colocar la función fetch o función asíncrona
//con el await te ahorras el then y catch ya que lo maneja por ti automaticamente, solo se puede usar en funciones asincronas. espera el resultado de la promesa sin bloquear el resto del programa
//Igual se puede usar rejected o resolved
//Async y await funcionan juntos, NO SEPARADOS

async function functionAsync (){
    try {
        const data = await dummyFetch(); // aqui "esperamos" a que la promesa se resuelva"
        console.log (data); // aqui esperamos a que nos imprima datos dummy
} catch (err) {
        console.error ("error de dummy" + err)
    }
}

functionAsync (); 