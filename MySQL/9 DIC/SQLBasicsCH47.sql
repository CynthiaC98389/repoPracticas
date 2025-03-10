-- Las sentencias/comandos /querys fundamentales de SQL
-- Mostrar las bases de datos
SHOW DATABASES;

SHOW TABLES;


-- Para acceder o usar una base de datos en particular
USE ch47;

-- Querys de la categoria DML

Select * FROM Clientes;

SELECT nombre, telefono
FROM Clientes;


SELECT nombre AS "name" FROM Clientes;

-- Tmabien podemos hacer condiciones como lo hacemos en programacion
-- Condicion de igualdad

SELECT * FROM Clientes WHERE nombre = "Carlos";

-- Condicion de comparación

SELECT nombre, precio FROM productos WHERE precio > 120.00;

-- Condicion de rangos

SELECT * FROM productos WHERE id_productos BETWEEN 2 AND 5;