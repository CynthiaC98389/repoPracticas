
//Crear y asignar un arreglo/ Existen 2 formas
//const numeros =[1,2,3,4,5,6]
//const frutas = new Array ("manzana","pera", "sandia") 

const numeros =[1,2,3,4,5,6] 
let frutas = new Array ("manzana","pera", "sandia") 

//en los arrays podemos acceder por medio del index
//console.log (numeros[4]) //Espero que se imprima en consola el numero 5 ya que inicia el conteo desde 0
//frutas [0] = "Uvas"// Espero que donde habia manzanas ahora haya uvas
//console.log (frutas [0]);//Imprimos el resultado de Uvas 


//Existen metodos precreados para los arreglos, porque los arreglos son Objetos
//Uno de estos medotos es indexOf()
//para usar un metodo de un arreglo se usa la syntaxis nombre_arreglo.nombreMetodo

//console.log (frutas.indexOf ("Uvas")); //Esperamos el indice de donde estan las uvas y retorna 0
//console.log (frutas.indexOf ("manzanas")) //retorna un -1 pq no existe


//Los arreglos tienen atributos y uno de ellos es la longitud,
let dinamico = [];
//console.log("length: " + dinamico.length); //vamos a esperar el largo del arreglo


//El metodo push lo que hace es agregar uno o más elementos al final de la matriz y devuelve la nueva longitud de la matriz.
numeros.push (7);
numeros.push (8);
console.log (numeros); //despues del push esperamos ver del 1 al 8
//numeros.shift (); //Esperamos ver el arreglo sin el primer elemento
//console.log (numeros);
let primerElemento = numeros.shift (); //En una variable let el primer elemento
console.log (primerElemento);  //visualizar el primer elemento
console.log (numeros);



//Slice, hace un corte en base a dos indices, el indice de inicio y el indice final ---> hace un clon (copia ) modificado de mi arreglo original

let clonFrutas = frutas.slice (2); //Con esto se extrae el arreglo clon con el elemento sandia pq el indice es 2
//console.log (clonFrutas);
let clonNumeros = numeros.slice(-2,-1)//deberiamos esperar un clon del arreglo numeros que deberia ser el 7 o 6
//console.log (clonNumeros);

//Ciclos
/*
*****
*   *
*   *
*   *
*****
*/

//for in - ciclos en las propiedades de un objeto
//for of - valores de un objeto que tiene capacidad de ser iterado
//while -  ciclos de un bloque de codigo "mientras" cierta condición es true
//do/while - > ciclo que hace un bloque de código mientras la condición espcedificada sea true

console.log (frutas.length)
for (let i=0; i <= frutas.length -1; i++ ){
// console.log ("aqui se ejecuta mi for.....")
//  console.log (i);
//   console.log (frutas [i]);// Esperamos que se impriman en consola uno a uno los valores dentro del arreglo de frutas
}


function setBastaFlag(flag){
    const abc = ["a","b","c","d"]
    let i = 0;
  //  do{
  //      console.log(abc[i]);
  //      i++
  //  }while(flag)


     while (flag) {
        console.log (abc[i]);
        i++
     }
}