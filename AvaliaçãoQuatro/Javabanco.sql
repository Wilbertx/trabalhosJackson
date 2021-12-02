CREATE SCHEMA IF NOT EXISTS `javabanco` DEFAULT CHARACTER SET utf8 ;
USE `javabanco` ;

CREATE TABLE IF NOT EXISTS chefs(

	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR (225) NOT NULL,
    cpf VARCHAR (11) NOT NULL,
    dataNascimento DATE NOT NULL,
    especialidade VARCHAR (15) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS clientes(

	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR (225) NOT NULL,
    cpf VARCHAR (11) NOT NULL,
    dataNascimento DATE NOT NULL,
    telefone VARCHAR (16) NOT NULL,
	PRIMARY KEY(id)
);

SELECT * FROM chefs;


    
    
    