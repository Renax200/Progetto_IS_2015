CREATE DATABASE  IF NOT EXISTS `magazzino` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `magazzino`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: magazzino
-- ------------------------------------------------------
-- Server version	5.7.9-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `email` varchar(45) NOT NULL,
  `password` varchar(16) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `cognome` varchar(45) DEFAULT NULL,
  `nome_società` varchar(45) DEFAULT NULL,
  `partita_iva` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `composto`
--

DROP TABLE IF EXISTS `composto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `composto` (
  `fkprodotto` int(11) NOT NULL,
  `fkordine` int(11) NOT NULL,
  `quantità` int(11) NOT NULL,
  PRIMARY KEY (`fkprodotto`,`fkordine`),
  KEY `fkordine` (`fkordine`),
  CONSTRAINT `composto_ibfk_1` FOREIGN KEY (`fkprodotto`) REFERENCES `prodotto` (`idProdotto`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `composto_ibfk_2` FOREIGN KEY (`fkordine`) REFERENCES `ordine` (`idOrdine`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `composto`
--

LOCK TABLES `composto` WRITE;
/*!40000 ALTER TABLE `composto` DISABLE KEYS */;
/*!40000 ALTER TABLE `composto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordine`
--

DROP TABLE IF EXISTS `ordine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordine` (
  `idOrdine` int(11) NOT NULL,
  `data` date NOT NULL,
  `importo` float NOT NULL,
  `fkaccount` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idOrdine`),
  KEY `fkaccount` (`fkaccount`),
  CONSTRAINT `ordine_ibfk_1` FOREIGN KEY (`fkaccount`) REFERENCES `account` (`email`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordine`
--

LOCK TABLES `ordine` WRITE;
/*!40000 ALTER TABLE `ordine` DISABLE KEYS */;
/*!40000 ALTER TABLE `ordine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prodotto`
--

DROP TABLE IF EXISTS `prodotto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prodotto` (
  `idProdotto` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `descrizione` varchar(45) NOT NULL,
  `numero_pezzi` int(11) NOT NULL,
  `prezzo` float NOT NULL,
  `categoria` varchar(45) NOT NULL,
  PRIMARY KEY (`idProdotto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prodotto`
--

LOCK TABLES `prodotto` WRITE;
/*!40000 ALTER TABLE `prodotto` DISABLE KEYS */;
/*!40000 ALTER TABLE `prodotto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transazione`
--

DROP TABLE IF EXISTS `transazione`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transazione` (
  `idTransazione` int(11) NOT NULL,
  `data` date NOT NULL,
  `importo` float NOT NULL,
  `descrizione` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTransazione`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transazione`
--

LOCK TABLES `transazione` WRITE;
/*!40000 ALTER TABLE `transazione` DISABLE KEYS */;
/*!40000 ALTER TABLE `transazione` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-16 13:48:55
