
// Part 1
// There are three people waiting for the bank. Their names, in order, are Sofia, David, and Juan. Create an array that has these three names in order.

let arrayNombres = ["Sofia", "David", "Juan"];
  

console.log(arrayNombres);


// Part 2
// Two more people get added to the back of the line - Sara and Augustin. The first person in line is called to the teller. What does the queue look like?

arrayNombres.push ("Sara","Agustin");
console.log (arrayNombres);
console.log (arrayNombres [0]);

// Part 3
// It turns out David was saving a spot for his friend Renata. She shows up and goes behind him in the line. One more person (Elena) shows up and goes to the end of the line. What does the queue look like?

arrayNombres.splice (2,0, "Renata"); 
arrayNombres.push ("Elena");
console.log (arrayNombres);

// Exercise #2
// Write a JavaScript program to construct the following pattern, using a nested for loop.

// *  
// * *  
// * * *  
// * * * *  
// * * * * *

//Un bucle anindado es un bucle dentro de otro bucle. Se usa en tablas o matrices
//El bucle exterior controla las filas, mientras que el bucle interior controla las columnas.


// Exercise #3
// Write while loops to do the following:

// – Repeatedly print the value of the variable xValue, decreasing it by 0.5 each time,
// as long as xValue remains positive.
// - Print all the odd numbers between 1 - 100.
// - Write a method with a while loop to print 1 through n in square brackets. 
// For example, if n = 6 print [1] [2] [3] [4] [5] [6]
// - Write a method with a while loop that computes the sum of first n positive integers: 
// sum = 1 + 2 + 3 + … + n
// Examples:
// n = 5 sum = 15
// n = 19 sum = 190





/*
Eva acaba de comenzar su nuevo puesto como Desarrolladora Junior en un banco. Está trabajando en cuentas de clientes para una nueva aplicación de banca móvil. Se le pide que implemente una función que muestre la fecha de transacción más reciente para un cliente. Para comenzar a diseñar esto, ella comienza con 3 fechas de transacción.

const arrayFechas = ["1/01", "21/04", "31/08"];
  

const ultimaFecha = arrayFechas[arrayFechas.length-1];

console.log (ultimaFecha);



 Almacenar la fecha más reciente en una variable comparando las transacciones usando declaraciones IF. Una vez que encuentre la fecha más reciente, querrá mostrarla.
*/

