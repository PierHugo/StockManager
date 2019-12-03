-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mer. 27 nov. 2019 à 14:18
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT = @@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS = @@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION = @@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `stock`
--
drop database if exists stocks;
drop database if exists stock;
CREATE DATABASE IF NOT EXISTS `stock` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;

drop user if exists 'Utilisateur'@'%';
CREATE USER 'Utilisateur'@'%' IDENTIFIED by 'password';
GRANT USAGE ON *.* TO 'Utilisateur'@'%';

USE `stock`;

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur`
(
    `mail_user`   varchar(255) NOT NULL,
    `nom_user`    varchar(255) DEFAULT NULL,
    `prenom_user` varchar(255) DEFAULT NULL,
    `password`    varchar(255) DEFAULT NULL,
    PRIMARY KEY (`mail_user`),
    UNIQUE KEY `USER_mail_user_uindex` (`mail_user`)
);

--
-- Déchargement des données de la table `user`
--

INSERT INTO `utilisateur` (`mail_user`, `nom_user`, `prenom_user`, `password`) VALUES
('pierhugocarpentier36@gmail.com', 'Carpentier', 'Pier-Hugo', '6007d824a59a256e20cecdcb01c204f3fece7d804f3ca76e71b2a5e5e91ad068');
COMMIT;

grant select, insert on stock.utilisateur to 'Utilisateur'@'%';
commit;

/*!40101 SET CHARACTER_SET_CLIENT = @OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS = @OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION = @OLD_COLLATION_CONNECTION */;
