create database estacionamento;

use estacionamento;



create table usuarios(

iduser int(11) primary key, 
usuario varchar(50), 
fone varchar(25), 
login varchar(25), 
senha varchar(25), 
perfil varchar(20)

);


create table veiculos(
codigo int(11) primary key auto_increment ,
Placa varchar (30), 
DataEntrada varchar (30), 
DataSaida varchar (30),
Obs varchar (200)
);
