//EJERCICIO 1
//let pagos = prompt ("Ingresa tus pago del mes")
//alert ("Calcularemos el costo de tus pagos del mes con una tarifa de $3 y un interés del 0.1%")

//function calcularCostos (pago)
   // const tarifa =3;
   // const interés = 0.001;

   // return pago +0.0001;





//EJERCICIO 2
//PARTE 1
let tu = prompt ("Escribe tu nombre");
let nombre1 = prompt ("Escribe el nombre de tu 1er amigo");
let añoNacimiento1 = prompt ("Escribe el año de nacimiento");
let nombre2 = prompt ("Escribe el nombre de tu 2do amigo");
let añoNacimiento2 = prompt ("Escribe el año de nacimiento");
let nombre3 = prompt ("Escribe el nombre de tu 3er amigo");
let añoNacimiento3 = prompt ("Escribe el año de nacimiento");

console.log ("Bienvenidos "+tu+ ", " +nombre1+", "+nombre2+" y "+nombre3);

//EJERCICIO 2
//PARTE 2

function edadActual (añoNacimiento) {
    return 2024 - añoNacimiento;
}
/*Convertir string años a numero */
let edad1 = edadActual(Number(añoNacimiento1)); 
let edad2 = edadActual(Number(añoNacimiento2));
let edad3 = edadActual(Number(añoNacimiento3));

//PARTE 3
 console.log("Bienvenido " +nombre1+ " tu edad actual es " +edad1+ " años.");
 console.log("Bienvenido " +nombre2+ " tu edad actual es " +edad2+ " años.");
 console.log("Bienvenido " +nombre3+ " tu edad actual es " +edad3+ " años.");




