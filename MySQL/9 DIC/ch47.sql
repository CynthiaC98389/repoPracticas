

CREATE DATABASE ch47;
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `ch47` ;

-- -----------------------------------------------------
-- Table `mydb`.`Clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch47`.`Clientes` (
  `id_clientes` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NOT NULL,
  `apellido` VARCHAR(80) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `direccion` TEXT(250) NOT NULL,
  PRIMARY KEY (`id_clientes`))
ENGINE = InnoDB;

INSERT INTO `ch47`.`Clientes` (`nombre`, `apellido`, `correo`, `telefono`, `direccion`) 
VALUES
('Juan', 'Pérez', 'juan.perez@gmail.com', '5551234567', 'Calle Falsa 123, Ciudad A'),
('Ana', 'Gómez', 'ana.gomez@yahoo.com', '5557654321', 'Avenida Central 45, Ciudad B'),
('Luis', 'Martínez', 'luis.martinez@hotmail.com', '5559876543', 'Calle Norte 89, Ciudad C'),
('Sofía', 'López', 'sofia.lopez@gmail.com', '5556781234', 'Boulevard Sur 56, Ciudad A'),
('Carlos', 'Ramírez', 'carlos.ramirez@outlook.com', '5554325678', 'Calle Este 78, Ciudad B');

-- -----------------------------------------------------
-- Table `mydb`.`pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch47`.`pedidos` (
  `id_pedidos` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `estado_pedido` VARCHAR(100) NOT NULL,
  `total` DOUBLE NOT NULL,
  `Clientes_id_clientes` INT NOT NULL,
  PRIMARY KEY (`id_pedidos`),
  INDEX `fk_pedidos_Clientes_idx` (`Clientes_id_clientes` ASC) VISIBLE,
  CONSTRAINT `fk_pedidos_Clientes`
    FOREIGN KEY (`Clientes_id_clientes`)
    REFERENCES `ch47`.`Clientes` (`id_clientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO `ch47`.`pedidos` (`fecha`, `estado_pedido`, `total`, `Clientes_id_clientes`) VALUES
('2024-01-15', 'Pendiente', 525.00, 1),
('2024-01-18', 'Enviado', 1250.00, 2),
('2024-02-01', 'Entregado', 55.00, 3),
('2024-02-10', 'Cancelado', 0.00, 4),
('2024-03-05', 'Pendiente', 50.00, 5);




-- -----------------------------------------------------
-- Table `mydb`.`categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch47`.`categorias` (
  `id_categorias` INT NOT NULL,
  `nombre` VARCHAR(80) NOT NULL,
  `descripcion` TEXT(250) NOT NULL,
  `fecha_creacion` DATE NOT NULL,
  PRIMARY KEY (`id_categorias`))
ENGINE = InnoDB;

INSERT INTO `ch47`.`categorias` (`id_categorias`, `nombre`, `descripcion`, `fecha_creacion`) 
VALUES
(1, 'Electrónica', 'Productos de tecnología y gadgets', '2023-01-01'),
(2, 'Hogar', 'Productos para el hogar y decoración', '2023-02-15'),
(3, 'Jardinería', 'Herramientas y accesorios para jardín', '2023-03-20'),
(4, 'Ropa', 'Prendas de vestir y accesorios', '2023-04-10'),
(5, 'Deportes', 'Artículos deportivos y accesorios', '2023-05-05');

-- -----------------------------------------------------
-- Table `mydb`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch47`.`productos` (
  `id_productos` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `descripcion` TEXT(250) NOT NULL,
  `precio` DOUBLE NOT NULL,
  `stock` INT NOT NULL,
  `categorias_id_categorias` INT NOT NULL,
  PRIMARY KEY (`id_productos`),
  INDEX `fk_productos_categorias1_idx` (`categorias_id_categorias` ASC) VISIBLE,
  CONSTRAINT `fk_productos_categorias1`
    FOREIGN KEY (`categorias_id_categorias`)
    REFERENCES `ch47`.`categorias` (`id_categorias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO `ch47`.`productos` (`nombre`, `descripcion`, `precio`, `stock`, `categorias_id_categorias`) VALUES
('Smartphone', 'Teléfono móvil con pantalla táctil', 500.00, 50, 1),
('TV 4K', 'Televisor de alta definición', 1200.00, 20, 1),
('Sofá', 'Sofá de tres plazas', 800.00, 10, 2),
('Maceta Grande', 'Maceta decorativa para exteriores', 30.00, 100, 3),
('Camiseta Deportiva', 'Camiseta de material ligero', 25.00, 200, 4),
('Balón de Fútbol', 'Balón oficial tamaño 5', 20.00, 150, 5);

-- -----------------------------------------------------
-- Table `mydb`.`pedidos_has_productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch47`.`pedidos_has_productos` (
  `pedidos_id_pedidos` INT NOT NULL,
  `productos_id_productos` INT NOT NULL,
  PRIMARY KEY (`pedidos_id_pedidos`, `productos_id_productos`),
  INDEX `fk_pedidos_has_productos_productos1_idx` (`productos_id_productos` ASC) VISIBLE,
  INDEX `fk_pedidos_has_productos_pedidos1_idx` (`pedidos_id_pedidos` ASC) VISIBLE,
  CONSTRAINT `fk_pedidos_has_productos_pedidos1`
    FOREIGN KEY (`pedidos_id_pedidos`)
    REFERENCES `ch47`.`pedidos` (`id_pedidos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedidos_has_productos_productos1`
    FOREIGN KEY (`productos_id_productos`)
    REFERENCES `ch47`.`productos` (`id_productos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



