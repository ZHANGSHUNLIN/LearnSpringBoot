/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.18 : Database - student_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`student_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `student_db`;

/*Table structure for table `classes` */

DROP TABLE IF EXISTS `classes`;

CREATE TABLE `classes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `classes` */

insert  into `classes`(`id`,`name`) values (1,'1701'),(2,'1702'),(3,'1703');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `phone` char(11) DEFAULT NULL,
  `qq` varchar(18) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `className` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`id`,`name`,`sex`,`phone`,`qq`,`birthday`,`className`) values (4,'李四','男','13523456789','9293123','1998-12-01','1'),(5,'李四','男','13523456789','9293123','1998-12-01','1'),(6,'李四','男','13523456789','9293123','1998-12-01','2'),(11,'李四','男','13523456789','9293123','1998-12-01','1'),(12,'李四','男','13523456789','9293123','1998-12-01','1'),(13,'李四','男','13523456789','9293123','1998-12-01','1'),(14,'李四','男','13523456789','9293123','1998-12-01','2'),(15,'李四','男','13523456789','9293123','1998-12-01','2'),(16,'李四','男','13523456789','9293123','1998-12-01','1'),(17,'李四','男','13523456789','9293123','1998-12-01','1'),(18,'李四','男','13523456789','9293123','1998-12-01','2'),(19,'李四','男','13523456789','9293123','1998-12-01','1'),(20,'张三','男','13523456789','9293123','1998-12-01','2');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
