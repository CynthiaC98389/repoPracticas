const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector('.name'); //
const $b = document.querySelector('.blog'); //Clase correcta seleccionada, se le borro porque no es ID
const $l = document.querySelector('.location');

async function displayUser(username) { //agregar funcion async
  $n.textContent = 'cargando...';

//se agrego funcion try catch 
  try {
  const response = await fetch(`${usersEndpoint}/${username}`);
  if (!response.ok) {
  throw new Error(`Error: ${response.status} ${response.statusText}`);
}

 const data = await response.json(); //PAara convertir la respuesta de api a json
 console.log(data);




 //Sire para llenar el contenido de los datos obtenidos
  $n.textContent = `${data.name}`; //cambio de comillas
  $b.textContent = `${data.blog}`;
  $l.textContent = `${data.location}`;
} catch (err) {
  handleError(err);
}
}


//Ocurre error porque la funcion await no estaba declarada dentro de una funcion por lo cual se procede a hacer la funcion


function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  $n.textContent = `Algo salió mal: ${err.message}` //Definir bien n con $n y agregar mensaje de errordescriptivo
}

displayUser('stolinski').catch(handleError);