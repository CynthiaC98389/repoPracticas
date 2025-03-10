SHOW DATABASES;
SHOW TABLES;


-- Ejercicio 1: Seleccionar todos los datos de una tabla.
SELECT * FROM categorias;
SELECT * FROM Clientes;
SELECT * FROM pedidos;
SELECT * FROM pedidos_has_productos;
SELECT * FROM productos;tipo_de_usuario


-- Ejercicio 2: Seleccionar columnas específicas de una tabla.
SELECT nombre, descripcion
FROM categorias;
-- Ejercicio 3: Seleccionar datos sin duplicados.
SELECT DISTINCT Nombre, Apellido, Correo FROM clientes;

-- Ejercicio 4: Filtrar registros usando la cláusula WHERE con el operador IN.
SELECT * FROM categorias WHERE nombre IN ('Electrónica', 'Ropa');

-- Ejercicio 5: Filtrar registros usando la cláusula WHERE con el operador LIKE.
-- Esto muestra todas las categorias que tengan en el nombre una E incluida
SELECT * FROM categorias WHERE nombre LIKE '%E%';

-- Ejercicio 6: Filtrar registros usando la cláusula WHERE con el operador BETWEEN.
SELECT * FROM pedidos WHERE total BETWEEN 0 and 100; 


-- Ejercicio 7: Contar el total de registros en una tabla.
SELECT COUNT(*) FROM pedidos;

-- Ejercicio 8: Calcular el promedio de una columna numérica.
SELECT AVG(total) FROM pedidos;

-- Ejercicio 9: Sumar todos los valores de una columna numérica.
SELECT SUM(total) FROM pedidos;

-- Ejercicio 10: Obtener el valor mínimo de una columna.
SELECT MIN(total) FROM pedidos;

-- Ejercicio 11: Obtener el valor máximo de una columna.
SELECT MAX(total) FROM pedidos;


-- Ejercicio 12: Usa UNION para combinar resultados de dos consultas SELECT con diferentes filtros.
SELECT nombre, precio
FROM productos
WHERE precio < 50

UNION

SELECT nombre, precio
FROM productos
WHERE categorias_id_categorias = 'Electrónica';
-- Ejercicio 12: Unir dos tablas usando INNER JOIN y seleccionar registros relacionados.

    
-- Ejercicio 13: Unir dos tablas usando LEFT JOIN.

-- Ejercicio 14: Unir dos tablas usando RIGHT JOIN.

-- Ejercicio 14.2: Demuestra el comportamiento de INNER JOIN , LEFT JOIN.



-- Ejercicio 15: Combinar resultados de múltiples tablas usando FULL JOIN.

SELECT * FROM categorias;
SELECT * FROM productos;
SELECT productos.nombre, categorias.id_categorias
FROM productos
CROSS JOIN categorias;

-- Ejercicio 16: Borrar registros de una tabla usando DELETE.
DELETE FROM pedidos_has_productos
WHERE productos_id_productos;
-- Ejercicio 16.2: Realiza una eliminación condicional utilizando DELETE con el operador BETWEEN.

-- Ejercicio bonus(opcional) Usa DELETE con una tabla que tenga claves foráneas, asegurándote de manejar las restricciones referenciales.

-- Ejercicio 17: Renombrar una tabla.
ALTER TABLE Clientes RENAME TO Clientes_Preferidos;
Table Clientes_Preferidos;

-- Ejercicio 17.2: Usa ROUND junto con AVG para redondear el promedio de los valores a un número específico de decimales.

-- Ejercicio 18: Seleccionar todos los departamentos de una tabla sin duplicados.
SELECT DISTINCT fecha
FROM pedidos;
-- Ejercicio 19: Crear una consulta que use una función de agregación y filtrar resultados con HAVING.

-- Ejercicio 20: Crear una consulta que combine múltiples condiciones en WHERE.

-- Ejercicio 21: Combina COUNT con DISTINCT para contar valores únicos en una columna.

-- Ejercicio final (Opcional): Escribe una consultaria que escribirias para obtener información de la base de datos para una funcionalidad de tu sistema.

