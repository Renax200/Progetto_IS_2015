CREATE DATABASE IF NOT EXISTS magazzino;
USE magazzino;
create table IF not EXIsts Account(
email varchar(45) PRIMARY kEY,
password varchar(16) not null,
nome varchar(45),
cognome varchar(45),
nome_società varchar(45),
partita_iva varchar(20));

create table IF not EXIsts Ordine(
idOrdine integer PRIMARY kEY,
data date not null,
importo float not null,
fkaccount varchar(45),
foreign key (fkaccount) references Account(email)on delete set null on update cascade);

create table IF not EXIsts Prodotto(
idProdotto integer PRIMARY kEY,
nome varchar(45) not null,
descrizione varchar(45) not null,
numero_pezzi integer not null,
prezzo float not null,
categoria varchar(45) not null);

create table IF not EXIsts Composto(
fkprodotto integer,
fkordine integer,
quantità integer not null,
primary key(fkprodotto,fkordine),
foreign key (fkprodotto) references Prodotto(idProdotto)on delete no action on update cascade,
foreign key (fkordine) references Ordine(idOrdine)on delete no action on update cascade);

create table IF not EXIsts Transazione(
idTransazione integer primary key,
data date not null,
importo float not null,
descrizione varchar(45));

