/*Tipos de datos y variables
variable: Es un espacio de memoria dentro de nuestro programa



var, let y const

var: tiene un alcance global
let: tiene un alcance local
const: es una constante, esto quiere decir que no se puede modificar!!!!

scope: alcance de mis variables



String: cadena de texto
Numbero: numero
boolean: true or false 0/1

undefined: no definidio
null. no tiene un valor
nan: no es un numero



declarar, inicializar y modificar- son diferentes
*/

//let nombre; declaro mi variable
//nombre = "Fernanda"; inicializo mi variable



let nombre = "Cynthia";



const apellido = "Castellanos";
console.log (apellido)

console.log (nombre)



let telefono = null;
console.log (telefono);





let direccion; 
console.log (direccion);

//multiples variables


let num1 =15;
let num2 = 12;
let num3 = 10;


//Encasillamiento o cohersion se refiere a una cohersion automatica
//typeof me permite saer el tipo de dato

//let precio = prompt ("Cual es tu rango de inversion");

console.log (typeof precio)


//objeto Number
let numero1 = "41";
let newNumber = Number (numero1);

console.log (typeof newNumber);

//conversion de tipo de dato string a number
//investigar sobre numeros enteros y numeros flotantes

let cp = "42084";
let numCp = parseFloat(cp);

console.log (typeof numCp)


//conversion de un numero a string
let edad = 32;
let edadString = edad.toString ();
console.log (edadString);


//investigar cambio de boolean a string

let ine = true;
let ineString = ine.toString ();
console.log (ineString);
console.log (typeof ineString);


console.log (edad + nombre);

console.log (edad * nombre);




