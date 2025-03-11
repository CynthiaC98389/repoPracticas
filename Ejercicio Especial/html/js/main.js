document.addEventListener('DOMContentLoaded', () => { // se ejetuca lo que esta dentro de la funcion
    const button = document.querySelector('.btn btn-primary my-2'); // Selecciona el botón de load products
    
    button.addEventListener('click', () => { // nos permite escuchar la funcion
        // Llama a la API
        fetch('https://fakestoreapi.com/products')
            .then(response => response.json())
            .then(data => {
                console.log('Productos cargados:', data); // Muestra los productos en la consola
                alert(`Se han cargado ${data.length} productos.`);
            })
            .catch(error => console.error('Error al cargar los productos:', error));
    });
});