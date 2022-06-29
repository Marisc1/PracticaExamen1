/*
create schema practica;
USE practica;

create table practica.estado(

  `id_estado` INT NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `moneda` VARCHAR(20) NOT NULL,
  `tamano` double(20,2) NOT NULL,
  `capital` VARCHAR(25) NOT NULL,
  `poblacion` int(15) NOT NULL,
  
PRIMARY KEY (`id_estado`)
);

Insert practica.estado( `id_estado`,`nombre`,`moneda`,`tamano`,`capital`,`poblacion`)values('1','NY','Dolar',2000,'NA',123123123);

create user "usuario_practica" identified by 'la_Clave';
GRANT ALL PRIVILEGES ON practica.* TO 'usuario_practica'@'%';
*/