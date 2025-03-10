CREATE DATABASE ch47;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `ch47` ;
SHOW DATABASES;

-- -----------------------------------------------------
-- Table `mydb`.`Clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Clientes` (
  `idClientes` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NULL,
  `apellido` VARCHAR(80) NULL,
  `correo` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `direccion` TEXT(250) NULL,
  PRIMARY KEY (`idClientes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Pedidos` (
  `id_pedidos` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NULL,
  `estado_pedido` VARCHAR(100) NULL,
  `total` DECIMAL(100,2) NULL,
  `Clientes_idClientes` INT NOT NULL,
  PRIMARY KEY (`id_pedidos`),
  INDEX `fk_Pedidos_Clientes_idx` (`Clientes_idClientes` ASC) VISIBLE,
  CONSTRAINT `fk_Pedidos_Clientes`
    FOREIGN KEY (`Clientes_idClientes`)
    REFERENCES `mydb`.`Clientes` (`idClientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Categorias` (
  `id_categorias` INT NOT NULL,
  `nombre` VARCHAR(80) NULL,
  `descripcion` TEXT(250) NULL,
  `fecha_creacion` DATE NULL,
  PRIMARY KEY (`id_categorias`))
ENGINE = InnoDB
COMMENT = '	';


-- -----------------------------------------------------
-- Table `mydb`.`Productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Productos` (
  `id_productos` INT NOT NULL,
  `nombre` VARCHAR(100) NULL,
  `descripcion` TEXT(250) NULL,
  `precio` DECIMAL(100,2) NULL,
  `stock` INT NULL,
  `Categorias_id_categorias` INT NOT NULL,
  PRIMARY KEY (`id_productos`),
  INDEX `fk_Productos_Categorias1_idx` (`Categorias_id_categorias` ASC) VISIBLE,
  CONSTRAINT `fk_Productos_Categorias1`
    FOREIGN KEY (`Categorias_id_categorias`)
    REFERENCES `mydb`.`Categorias` (`id_categorias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Productos_has_Pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Productos_has_Pedidos` (
  `Productos_id_productos` INT NOT NULL,
  `Pedidos_id_pedidos` INT NOT NULL,
  PRIMARY KEY (`Productos_id_productos`, `Pedidos_id_pedidos`),
  INDEX `fk_Productos_has_Pedidos_Pedidos1_idx` (`Pedidos_id_pedidos` ASC) VISIBLE,
  INDEX `fk_Productos_has_Pedidos_Productos1_idx` (`Productos_id_productos` ASC) VISIBLE,
  CONSTRAINT `fk_Productos_has_Pedidos_Productos1`
    FOREIGN KEY (`Productos_id_productos`)
    REFERENCES `mydb`.`Productos` (`id_productos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Productos_has_Pedidos_Pedidos1`
    FOREIGN KEY (`Pedidos_id_pedidos`)
    REFERENCES `mydb`.`Pedidos` (`id_pedidos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
