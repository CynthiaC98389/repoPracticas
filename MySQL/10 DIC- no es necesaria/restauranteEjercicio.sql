-- Crear base de datos
CREATE DATABASE IF NOT EXISTS restaurante;
USE restaurante;

-- Tabla de locales
CREATE TABLE IF NOT EXISTS locales (
    id_local INT AUTO_INCREMENT PRIMARY KEY,
    nombre_local VARCHAR(100) NOT NULL,
    ubicacion VARCHAR(150) NOT NULL
);

-- Tabla de empleados
CREATE TABLE IF NOT EXISTS empleados (
    id_empleado INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    local_id INT NOT NULL,
    FOREIGN KEY (local_id) REFERENCES locales(id_local)
);

-- Tabla de ventas
CREATE TABLE IF NOT EXISTS ventas (
    id_venta INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    total DECIMAL(10, 2) NOT NULL,
    empleado_id INT NOT NULL,
    local_id INT NOT NULL,
    FOREIGN KEY (empleado_id) REFERENCES empleados(id_empleado),
    FOREIGN KEY (local_id) REFERENCES locales(id_local)
);

-- Tabla de productos
CREATE TABLE IF NOT EXISTS productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre_producto VARCHAR(100) NOT NULL,
    tipo_producto VARCHAR(50) NOT NULL
);

-- Tabla de detalle de ventas
CREATE TABLE IF NOT EXISTS detalle_ventas (
    id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    venta_id INT NOT NULL,
    producto_id INT NOT NULL,
    cantidad INT NOT NULL,
    FOREIGN KEY (venta_id) REFERENCES ventas(id_venta),
    FOREIGN KEY (producto_id) REFERENCES productos(id_producto)
);

-- Insertar datos de ejemplo en locales
INSERT INTO locales (nombre_local, ubicacion) VALUES
('Local Centro', 'Calle Principal 123'),
('Local Norte', 'Avenida Norte 456'),
('Local Sur', 'Boulevard Sur 789');

-- Insertar datos de ejemplo en empleados
INSERT INTO empleados (nombre, local_id) VALUES
('Juan Pérez', 1),
('Ana Gómez', 2),
('Carlos Ramírez', 3);

-- Insertar datos de ejemplo en productos
INSERT INTO productos (nombre_producto, tipo_producto) VALUES
('Hamburguesa', 'Comida Rápida'),
('Papas Fritas', 'Comida Rápida'),
('Refresco', 'Bebida'),
('Agua', 'Bebida');

-- Insertar datos de ejemplo en ventas
INSERT INTO ventas (fecha, total, empleado_id, local_id) VALUES
('2024-01-10', 50.00, 1, 1),
('2024-01-11', 30.00, 2, 2),
('2024-01-12', 20.00, 3, 3),
('2024-01-15', 100.00, 1, 1),
('2024-01-20', 75.00, 2, 2);

-- Insertar datos de ejemplo en detalle de ventas
INSERT INTO detalle_ventas (venta_id, producto_id, cantidad) VALUES
(1, 1, 2),
(1, 2, 1),
(2, 1, 1),
(2, 3, 2),
(3, 4, 1),
(4, 1, 3),
(4, 2, 2),
(5, 3, 3),
(5, 4, 1);

-- Consulta 1: Ventas por local
SELECT 
    l.nombre_local AS Local,
    SUM(v.total) AS Total_Ventas
FROM ventas v
INNER JOIN locales l ON v.local_id = l.id_local
WHERE MONTH(v.fecha) = MONTH(CURRENT_DATE()) AND YEAR(v.fecha) = YEAR(CURRENT_DATE())
GROUP BY l.nombre_local;

-- Consulta 2: Ventas por empleado/vendedor
SELECT 
    e.nombre AS Vendedor,
    l.nombre_local AS Local,
    SUM(v.total) AS Total_Ventas
FROM ventas v
INNER JOIN empleados e ON v.empleado_id = e.id_empleado
INNER JOIN locales l ON v.local_id = l.id_local
WHERE MONTH(v.fecha) = MONTH(CURRENT_DATE()) AND YEAR(v.fecha) = YEAR(CURRENT_DATE())
GROUP BY e.nombre, l.nombre_local;

-- Consulta 3: Total de productos por tipo de venta en cada local
SELECT 
    l.nombre_local AS Local,
    p.tipo_producto AS Tipo_Producto,
    SUM(dv.cantidad) AS Total_Productos
FROM detalle_ventas dv
INNER JOIN ventas v ON dv.venta_id = v.id_venta
INNER JOIN productos p ON dv.producto_id = p.id_producto
INNER JOIN locales l ON v.local_id = l.id_local
WHERE MONTH(v.fecha) = MONTH(CURRENT_DATE()) AND YEAR(v.fecha) = YEAR(CURRENT_DATE())
GROUP BY l.nombre_local, p.tipo_producto;
