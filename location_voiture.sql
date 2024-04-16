-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 16 avr. 2024 à 14:42
-- Version du serveur : 8.0.31
-- Version de PHP : 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `location_voiture`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `IdCli` int NOT NULL AUTO_INCREMENT,
  `Nom` varchar(100) NOT NULL,
  `Prenom` varchar(100) NOT NULL,
  `Adresse` varchar(200) NOT NULL,
  `Code_Postal` int NOT NULL,
  `Ville` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Pays` text NOT NULL,
  `Tel` varchar(60) NOT NULL,
  `Mail` varchar(200) NOT NULL,
  `password` varchar(60) NOT NULL,
  `Satut` text NOT NULL,
  PRIMARY KEY (`IdCli`)
) ENGINE=MyISAM AUTO_INCREMENT=1317 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`IdCli`, `Nom`, `Prenom`, `Adresse`, `Code_Postal`, `Ville`, `Pays`, `Tel`, `Mail`, `password`, `Satut`) VALUES
(1304, 'cherfaoui', 'patrice', '24 rue de l\'arbre', 92600, 'colombes', 'france', '0548632510', 'patrice07@gmail.com', '22', 'o'),
(7, 'didine\r\n', 'rayan', '2 rue la chapelle', 75003, 'paris', 'france', '0789256301', 'didine.rayan@gmail.com', 'didinecanon16', 'f'),
(203, 'chouihi', 'asma ', '20 rue de la beauté ', 16000, 'los angeles', 'algerie', '0548514750', 'asma@gmail.com', 'ha', 'f'),
(1305, 'skhvs', 'sgjvu', 'siviyfs', 46, 'siyfys', 'sogsyi', '431888884', 'slgiskgs', 'shsyis', 'shlbsis'),
(1311, 'thelis', 'jean', 'residence des lilas', 75019, 'paris', 'france', '05489624859', 'jeanthelis@gmail.com', '69', 'o'),
(1309, 'dkvdhd', 'dkgsiy', 'sdiygdiy', 26, 'dlkdhi', 'sdlsdssusds', '395995', 'doshdus', 'dojshusd', 's:djosu'),
(1310, 'vhou', 'asma', 'ain naaja', 16000, 'alger', 'algerie', '0548928562', 'asma0@gmail.com', '25', 'f'),
(1312, 'hashem', 'assaf', 'djuefhhdeizhf', 94287, 'amsterdam', 'pays bas', '021589655', 'aabbaa', '99', 'o'),
(1313, 'assaf', 'hichem', 'jdhfhfhfhfhf', 1452, 'paris', 'italie', '025863558989', 'hichem@gmail.cim', '11', 'o'),
(1314, 'assaf', 'hashem', '93 avenue colombes', 92600, 'paris', 'france', '05932485025', 'assaf@gmail.com', '77', 'f'),
(1315, 'assaf', 'hashem', '93 avenue colombes', 92600, 'paris', 'france', '05932485025', 'assaf@gmail.com', '77', 'f'),
(1316, 'halbeher', 'cenzo', 'saint ouen', 93000, 'paris', 'france ', '0586238785668', 'cenzo@gmail.com', '000', 'f');

-- --------------------------------------------------------

--
-- Structure de la table `employees`
--

DROP TABLE IF EXISTS `employees`;
CREATE TABLE IF NOT EXISTS `employees` (
  `IdAdmin` int NOT NULL AUTO_INCREMENT,
  `Nom` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Prenom` varchar(644) NOT NULL,
  `Mail` varchar(5222) NOT NULL,
  `password` varchar(60) NOT NULL,
  PRIMARY KEY (`IdAdmin`)
) ENGINE=MyISAM AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `employees`
--

INSERT INTO `employees` (`IdAdmin`, `Nom`, `Prenom`, `Mail`, `password`) VALUES
(69, 'penaud', 'louise ma', 'joris+louise=love@gmail.com', 'jorisaimelouise');

-- --------------------------------------------------------

--
-- Structure de la table `factures`
--

DROP TABLE IF EXISTS `factures`;
CREATE TABLE IF NOT EXISTS `factures` (
  `IdCli` int NOT NULL,
  `NoFact` int NOT NULL AUTO_INCREMENT,
  `Nom` varchar(100) NOT NULL,
  `Prenom` varchar(100) NOT NULL,
  `Adresse` varchar(200) NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`NoFact`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `location`
--

DROP TABLE IF EXISTS `location`;
CREATE TABLE IF NOT EXISTS `location` (
  `Immatriculation` varchar(100) NOT NULL,
  `IdCli` int NOT NULL,
  `Debut` date NOT NULL,
  `Duree` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `voitures`
--

DROP TABLE IF EXISTS `voitures`;
CREATE TABLE IF NOT EXISTS `voitures` (
  `Immatriculation` varchar(100) NOT NULL,
  `Marque` varchar(100) NOT NULL,
  `Modele` varchar(100) NOT NULL,
  `Motorisation` varchar(100) NOT NULL,
  `Puissance` int NOT NULL,
  `Nb_de_place` int NOT NULL,
  `Type` text NOT NULL,
  `Dispo` text NOT NULL,
  `Popularite` text NOT NULL,
  PRIMARY KEY (`Immatriculation`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
