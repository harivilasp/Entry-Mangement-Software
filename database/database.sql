/*
SQLyog Enterprise - MySQL GUI v8.02 RC
MySQL - 5.5.0-m2-community : Database - database
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`database` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `database`;

/*Table structure for table `hostdata` */

DROP TABLE IF EXISTS `hostdata`;

CREATE TABLE `hostdata` (
  `name` char(40) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `mobno` varchar(11) DEFAULT NULL,
  `department` char(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `visitors` */

DROP TABLE IF EXISTS `visitors`;

CREATE TABLE `visitors` (
  `name` char(43) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `mobno` varchar(11) DEFAULT NULL,
  `hostname` char(44) DEFAULT NULL,
  `department` char(44) DEFAULT NULL,
  `intime` varchar(40) DEFAULT NULL,
  `outtime` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
