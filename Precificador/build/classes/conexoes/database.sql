
CREATE DATABASE precificao;
USE precificao;

CREATE TABLE IF NOT EXISTS `precificao`.`ingrediente` (
  `id` INT NOT NULL,
  `ingredienteNome` VARCHAR(45) NULL,
  `unidadeMedida` VARCHAR(45) NULL,
  `quantidadeEmbalagem` DOUBLE NULL,
  `preço` DOUBLE NULL,
  PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `precificao`.`receita` (
  `id` INT NOT NULL,
  `nomeReceita` VARCHAR(45) NULL,
  `rendimento` DOUBLE NULL,
  `unidadeMedidaRendimento` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `precificao`.`receita_ingrediente` (
  `receita_id` INT NOT NULL,
  `ingrediente_id` INT NOT NULL,
  `quantidadeIngrediente` DOUBLE NULL,
  PRIMARY KEY (`receita_id`, `ingrediente_id`),
  INDEX `fk_receita_has_ingrediente_ingrediente1_idx` (`ingrediente_id` ASC) VISIBLE,
  INDEX `fk_receita_has_ingrediente_receita_idx` (`receita_id` ASC) VISIBLE,
  CONSTRAINT `fk_receita_has_ingrediente_receita`
    FOREIGN KEY (`receita_id`)
    REFERENCES `precificao`.`receita` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_receita_has_ingrediente_ingrediente1`
    FOREIGN KEY (`ingrediente_id`)
    REFERENCES `precificao`.`ingrediente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS `precificao`.`conta` (
  `id` INT NOT NULL,
  `nomeConta` VARCHAR(45) NULL,
  `preco` DOUBLE NULL,
  PRIMARY KEY (`id`));