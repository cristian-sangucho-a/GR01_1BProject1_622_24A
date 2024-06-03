-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-05-2024 a las 03:41:02
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

CREATE DATABASE IF NOT EXISTS tiendavideojuegos;
USE tiendavideojuegos;
SET character_set_client = 'utf8mb4';

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



CREATE TABLE IF NOT EXISTS `VIDEOJUEGO` (
  `idVideojuego` int(11) AUTO_INCREMENT PRIMARY KEY,
  `titulo` varchar(65) NOT NULL,
  `nombreDeDesarrollador` varchar(65) NOT NULL,
  `precio` double NOT NULL
);

--
-- Volcado de datos para la tabla `videojuego`
--

INSERT INTO `VIDEOJUEGO` (`titulo`, `nombreDeDesarrollador`, `precio`) VALUES
( 'Super Mario', 'Nintendo', 59.99),
( 'The Legend of Zelda', 'Nintendo', 59.99),
( 'Minecraft', 'Mojang', 29.99),
( 'Grand Theft Auto V', 'Rockstar Games', 39.99),
( 'Call of Duty: Modern Warfare', 'Infinity Ward', 49.99),
( 'Fortnite', 'Epic Games', 0),
( 'FIFA 22', 'Electronic Arts', 59.99),
( 'Cyberpunk 2077', 'CD Projekt Red', 39.99),
( 'Among Us', 'InnerSloth', 4.99),
( 'League of Legends', 'Riot Games', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `videojuego`
--

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
