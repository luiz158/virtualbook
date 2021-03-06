CREATE DATABASE  IF NOT EXISTS `virtualbook` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `virtualbook`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: virtualbook
-- ------------------------------------------------------
-- Server version	5.7.10-log

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
-- Dumping data for table `tbl_event_item`
--

LOCK TABLES `tbl_event_item` WRITE;
/*!40000 ALTER TABLE `tbl_event_item` DISABLE KEYS */;
INSERT INTO `tbl_event_item` (`id`, `comment`, `price`, `quantity`, `event_id`, `item_id`) VALUES (318,NULL,0,0,NULL,32),(319,NULL,0,0,NULL,37),(320,NULL,0,0,NULL,36),(321,NULL,0,0,NULL,35),(322,NULL,0,0,NULL,32),(323,NULL,0,0,NULL,37),(324,NULL,0,0,NULL,36),(325,NULL,0,0,NULL,35),(326,NULL,0,0,NULL,32),(327,NULL,0,0,NULL,35),(328,NULL,0,0,NULL,36),(329,NULL,0,0,NULL,37),(330,NULL,0,0,NULL,32),(331,NULL,0,0,NULL,35),(332,NULL,0,0,NULL,36),(333,NULL,0,0,NULL,37),(334,NULL,0,0,NULL,32),(335,NULL,0,0,NULL,35),(336,NULL,0,0,NULL,36),(337,NULL,0,0,NULL,37),(338,NULL,0,0,NULL,32),(339,NULL,0,0,NULL,35),(340,NULL,0,0,NULL,36),(341,NULL,0,0,NULL,37),(342,NULL,0,0,NULL,32),(343,NULL,0,0,NULL,35),(344,NULL,0,0,NULL,36),(345,NULL,0,0,NULL,37),(346,NULL,0,0,NULL,32),(347,NULL,0,0,NULL,35),(348,NULL,0,0,NULL,36),(349,NULL,0,0,NULL,37),(350,NULL,0,0,NULL,32),(351,NULL,0,0,NULL,35),(352,NULL,0,0,NULL,32),(353,NULL,0,0,NULL,35),(354,NULL,0,0,NULL,32),(355,NULL,0,0,NULL,35),(356,NULL,5,50,NULL,32),(357,NULL,0,0,NULL,35),(358,NULL,4,30,NULL,32),(359,NULL,0,0,NULL,35),(360,NULL,0,0,NULL,36),(361,NULL,0,0,NULL,37),(362,NULL,4,30,NULL,32),(363,NULL,0,0,NULL,35),(364,NULL,0,0,NULL,36),(365,NULL,0,0,NULL,37),(366,NULL,4,30,NULL,32),(367,NULL,0,0,NULL,35),(368,NULL,0,0,NULL,36),(369,NULL,0,0,NULL,37),(370,NULL,4,30,NULL,32),(371,NULL,0,0,NULL,35),(372,NULL,0,0,NULL,36),(373,NULL,0,0,NULL,37),(374,NULL,5,50,NULL,32),(375,NULL,0,0,NULL,35),(376,NULL,4,30,NULL,32),(377,NULL,0,0,NULL,35),(378,NULL,0,0,NULL,36),(379,NULL,0,0,NULL,37),(380,NULL,4,30,NULL,32),(381,NULL,0,0,NULL,35),(382,NULL,0,0,NULL,36),(383,NULL,0,0,NULL,37),(384,NULL,4,30,NULL,32),(385,NULL,0,0,NULL,35),(386,NULL,0,0,NULL,36),(387,NULL,0,0,NULL,37),(388,NULL,5,50,NULL,32),(389,NULL,0,0,NULL,35),(390,NULL,5,200,66,32),(391,NULL,0,0,66,37),(392,NULL,5,150,NULL,32),(393,NULL,0,0,NULL,37),(394,NULL,0,0,NULL,36),(395,NULL,0,0,NULL,35),(396,NULL,3,100,68,32),(397,NULL,0,0,68,37),(398,NULL,0,0,68,36),(399,NULL,0,0,68,35),(400,NULL,0,0,NULL,32),(401,NULL,0,0,NULL,37),(402,NULL,0,0,NULL,36),(403,NULL,0,0,NULL,35),(408,NULL,0,0,69,32),(409,NULL,0,0,69,35),(410,NULL,0,0,69,36),(411,NULL,0,0,69,37),(412,NULL,5,50,NULL,32),(413,NULL,0,0,NULL,35),(414,NULL,5,50,NULL,32),(415,NULL,0,0,NULL,35),(416,NULL,5,50,64,32),(417,NULL,0,0,64,35),(418,NULL,5,150,67,32),(419,NULL,5,150,70,32);
/*!40000 ALTER TABLE `tbl_event_item` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-08-11 23:44:20
