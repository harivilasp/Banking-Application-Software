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

/*Table structure for table `loandata` */

DROP TABLE IF EXISTS `loandata`;

CREATE TABLE `loandata` (
  `AccNo` int(20) DEFAULT NULL,
  `interest` int(11) DEFAULT NULL,
  `loan` int(11) DEFAULT NULL,
  `lastupdate` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `loandata` */

/*Table structure for table `logindata` */

DROP TABLE IF EXISTS `logindata`;

CREATE TABLE `logindata` (
  `userid` text NOT NULL,
  `password` text,
  `Role` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `logindata` */

insert  into `logindata`(`userid`,`password`,`Role`) values ('hari','hari','admin'),('ayush','ayush','admin'),('newadmin','newadmin','admin'),('ayushadmin','ayushadmin','admin'),('customer','cutomer','cust'),('employee','employee','emp'),('admin','admin','admin'),('newemp','newemp','emp'),('latemp','latemp','admin'),('harivilasp@gmail.com','harivilasp','admin');

/*Table structure for table `transaction` */

DROP TABLE IF EXISTS `transaction`;

CREATE TABLE `transaction` (
  `from` tinytext,
  `to` tinytext,
  `date` text,
  `amount` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `transaction` */

insert  into `transaction`(`from`,`to`,`date`,`amount`) values ('hari','ayush','2019-09-20 14:43:22.871',1500),('hari','ayush','2019-09-20 14:44:58.089',1500),('hari','ayush','2019-09-20 14:49:35.945',1200),('hari','ayush','2019-09-20 15:14:20.82',1),('hari','ayush','2019-09-20 15:16:57.656',1);

/*Table structure for table `userdata` */

DROP TABLE IF EXISTS `userdata`;

CREATE TABLE `userdata` (
  `Name` text,
  `email` text NOT NULL,
  `AccNo` text,
  `MobNo` int(10) DEFAULT NULL,
  `Address` text,
  `IFSC` int(20) DEFAULT NULL,
  `balance` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `userdata` */

insert  into `userdata`(`Name`,`email`,`AccNo`,`MobNo`,`Address`,`IFSC`,`balance`) values ('hari','hari','1000',2147483647,'Chennai',212,98),('ayush','ayush','1111',2147483647,'chandno chowk',123,12002),('admin','admin','1212',82932939,'tamil nadu',3289,10000),('newadmin','newadmin','7128',3289339,'kashmir',2221,2000),('ayushadmin','ayushadmin','3242',5432534,'shimla',2321,24234),('employee','employee','2323',23423423,'employee home',234,32444),('customer','customer','2023',23003423,'customer home',204,31444),('newemp','newemp','1312',23423433,'newemp house',23412,123312),('lateemp','latemp','24239',9834948,'latemp home',83984,8943),('hariemp','harivilasp@gmail.com','12121',34343434,'vit chennai',232,2121);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
