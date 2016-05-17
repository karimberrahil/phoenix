-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Lun 25 Avril 2016 à 01:08
-- Version du serveur: 5.5.47-0+deb8u1
-- Version de PHP: 5.6.19-0+deb8u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `EPVNDB`
--

-- --------------------------------------------------------

--
-- Structure de la table `don`
--

CREATE TABLE IF NOT EXISTS `don` (
  `Projet_idProjet` int(11) NOT NULL,
  `User_idUser` int(11) NOT NULL,
  `montant` int(11) DEFAULT NULL,
  `typeDons` int(11) DEFAULT NULL,
  `dateEcheance` date DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Projet_idProjet`,`User_idUser`),
  KEY `fk_Projet_has_User_User1_idx` (`User_idUser`),
  KEY `fk_Projet_has_User_Projet_idx` (`Projet_idProjet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `play_evolutions`
--

CREATE TABLE IF NOT EXISTS `play_evolutions` (
  `id` int(11) NOT NULL,
  `hash` varchar(255) NOT NULL,
  `applied_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `apply_script` text,
  `revert_script` text,
  `state` varchar(255) DEFAULT NULL,
  `last_problem` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `play_evolutions`
--

INSERT INTO `play_evolutions` (`id`, `hash`, `applied_at`, `apply_script`, `revert_script`, `state`, `last_problem`) VALUES
(1, '327499940cc773032f69f67d7691d66fcb72e537', '2016-04-24 19:41:49', 'create table project (\nid                        integer auto_increment not null,\ntitle                     varchar(255),\ndescription               varchar(255),\nid_parent                 integer,\ntotal_amount              integer,\ndonation_amount           integer,\nis_validate               tinyint(1) default 0,\nis_completed              tinyint(1) default 0,\nconstraint pk_project primary key (id))\n;\n\ncreate table user (\nid                        integer auto_increment not null,\nadresse_mail              varchar(255),\nusername                  varchar(255),\nmot_de_passe              varchar(255),\nadresse_maison            varchar(255),\ncode_postal               integer,\ndate_de_naissance         datetime,\nnom                       varchar(255),\npermission                integer,\nprenom                    varchar(255),\nsexe                      varchar(255),\nville                     varchar(255),\nconstraint pk_user primary key (id))\n;', 'SET FOREIGN_KEY_CHECKS=0;\n\ndrop table project;\n\ndrop table user;\n\nSET FOREIGN_KEY_CHECKS=1;', 'applied', '');

-- --------------------------------------------------------

--
-- Structure de la table `project`
--

CREATE TABLE IF NOT EXISTS `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `id_parent` int(11) DEFAULT NULL,
  `total_amount` int(11) DEFAULT NULL,
  `donation_amount` int(11) DEFAULT NULL,
  `is_validate` tinyint(1) DEFAULT '0',
  `is_completed` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `project`
--

INSERT INTO `project` (`id`, `title`, `description`, `id_parent`, `total_amount`, `donation_amount`, `is_validate`, `is_completed`) VALUES
(1, 'Premier projet', 'Un projet', -1, 1000, 0, 1, 0),
(2, 'Un sous projet', 'sous projet', 1, 100, 0, 1, 0);

-- --------------------------------------------------------

--
-- Structure de la table `projet`
--

CREATE TABLE IF NOT EXISTS `projet` (
  `idProjet` int(11) NOT NULL,
  `projetParent` int(11) NOT NULL,
  `auteur` int(11) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `description` mediumtext,
  `typeProjet` varchar(45) DEFAULT NULL,
  `montantCible` int(11) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idProjet`,`projetParent`,`auteur`),
  KEY `fk_Projet_Projet1_idx` (`projetParent`),
  KEY `fk_Projet_User1_idx` (`auteur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adresse_mail` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `mot_de_passe` varchar(255) DEFAULT NULL,
  `adresse_maison` varchar(255) DEFAULT NULL,
  `code_postal` int(11) DEFAULT NULL,
  `date_de_naissance` datetime DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `permission` int(11) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `sexe` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `don`
--
ALTER TABLE `don`
  ADD CONSTRAINT `fk_Projet_has_User_Projet` FOREIGN KEY (`Projet_idProjet`) REFERENCES `projet` (`idProjet`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Projet_has_User_User1` FOREIGN KEY (`User_idUser`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `projet`
--
ALTER TABLE `projet`
  ADD CONSTRAINT `fk_Projet_Projet1` FOREIGN KEY (`projetParent`) REFERENCES `projet` (`idProjet`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Projet_User1` FOREIGN KEY (`auteur`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
