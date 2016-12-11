-- MySQL dump 10.13  Distrib 5.7.16, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	5.7.16-log

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
-- Table structure for table `administrator`
--

DROP TABLE IF EXISTS `administrator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrator` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrator`
--

LOCK TABLES `administrator` WRITE;
/*!40000 ALTER TABLE `administrator` DISABLE KEYS */;
INSERT INTO `administrator` VALUES ('George','abc'),('JI','234'),('Mike','zxc'),('Mqke','zxc'),('qq','123'),('Qu','123'),('QW','123');
/*!40000 ALTER TABLE `administrator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `isbn` varchar(45) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `genre` varchar(45) DEFAULT NULL,
  `idBook` int(11) NOT NULL,
  PRIMARY KEY (`idBook`),
  KEY `fk_book_id_idx` (`idBook`),
  CONSTRAINT `fk_book_id` FOREIGN KEY (`idBook`) REFERENCES `merchandise` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES ('9.78E+12','intro to arabic','AB',2001),('9.78E+12','mecanics of materials','AE',2002),('9.78E+12','fluid mechanics','AE',2003),('9.78E+12','control system design','AE',2004),('9.78E+12','understanding of bioinformatics','BCB',2005),('9.78E+12','biodesign','BME',2006),('9.78E+12','medical instrumentation BK & WHITE','BME',2007),('9.78E+12','first course in continuum mechanics','BME',2008),('9.78E+12','machenics of materials','CE',2009),('9.78E+12','traffic engineering handbook','CE',2010),('9.78E+12','water treatment principles+design','CE',2011),('9.78E+12','landscape planning: environ.appl.','CE',2012),('9.78E+12','physical chemistry 2nd+printing','CH',2013),('9.78E+12','introduction to genetic engineering','CH',2014),('9.78E+12','intro to chem.emgr.thermodyn','CHE',2015),('9.78E+12','separation process engineering','CHE',2016),('9.78E+12','elem.prin.of chemical processes','CHE',2017),('9.78E+12','unit oper of chem.engineering','CHE',2018),('9.78E+12','computer systems >custom<','CS',2019),('9.78E+12','big java: early objects','CS',2020),('9.78E+12','user interface design+evaluation','CS',2021),('9.78E+12','designing interactions','CS',2022),('9.78E+12','mastering MS.visual basic 2008','CS',2023),('9.78E+12','universal principles of DES.-REV','CS',2024),('9.78E+12','programming game AI by example','CS',2025),('9.78E+12','interacitve computer graphics','CS',2026),('9.78E+12','opengl programming guide','CS',2027),('2.82E+12','kit for ece 2010','ECE',2028),('9.78E+12','practical eletrical engineering','ECE',2029),('9.78E+12','signals and systems','ECE',2030),('9.78E+12','power electronics','ECE',2031),('9.78E+12','understanding cryptography','ECE',2032),('9.78E+12','course in behavioral economics','ECON',2033),('9.78E+12','tales of the lost formicans','EN',2034),('9.78E+12','theatre studies','EN',2035),('9.78E+12','pickwick papers','EN',2036),('9.78E+12','middlemarch','EN',2037),('9.78E+12','crying of lot 49','EN',2038),('9.78E+12','zen art motorcycle maintenance','EN',2039),('9.78E+12','brave new world','EN',2040),('9.78E+12','life of galileo','EN',2041),('9.78E+12','physicists','EN',2042),('9.78E+12','frankenstein','EN',2043),('9.78E+12','benchley roundup','EN',2044),('9.78E+12','collected poems','EN',2045),('9.78E+12','poems','EN',2046),('9.78E+12','worcester account','EN',2047),('9.78E+12','pictures from brueghel','EN',2048),('9.78E+12','howl other poems','EN',2049),('9.78E+12','complete poems','EN',2050),('9.78E+12','lunch poems','EN',2051),('9.78E+12','I shall not be moved','EN',2052),('9.78E+12','guma','EN',2053),('9.78E+12','postmodern american poetry','EN',2054),('9.78E+12','leaves of grass, vol.i: poems 1855-1856','EN',2055),('9.78E+12','materials science wpi custom ed.','ES',2056),('9.78E+12','ebk materials science and engineering','ES',2057),('9.78E+12','mymathlab-access','MA',2058),('9.78E+12','thomas\'calculus','MA',2059),('9.78E+12','thomas\'calculus, early trans','MA',2060),('9.78E+12','mathmatics of investment+credit','MA',2061),('2.82E+12','applied statistics','MA',2062),('9.78E+12','john e.freund\'s mathmatics statistics','MA',2063),('9.78E+12','contemporary abstract algebra','MA',2064),('9.78E+12','partial differential equations','MA',2065),('2.82E+12','voucher for me1800','ME',2066),('9.78E+12','manufacturing engin.+tech','ME',2067),('9.78E+12','control systems engineering','ME',2068),('9.78E+12','mechanical vibrations','ME',2069),('9.78E+12','intro to thermodynam of materials','ME',2070),('9.78E+12','CB7 student ed','MKT',2071),('9.78E+12','university physics','PH',2072),('9.78E+12','fund. Of physics','PH',2073),('9.78E+12','classical mechanics','PH',2074),('9.78E+12','photonics lasers','PH',2075),('9.78E+12','cognitive psychology','PSY',2076),('9.78E+12','abnormal psychology','PSY',2077),('9.78E+12','culture+psychology','PSY',2078),('9.78E+12','music+memory','PSY',2079),('9.78E+12','psychology of music','PSY',2080);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger insert_log_book
after insert on book
for each row
begin
	insert into log(log_time, log_type, log_content, merchandise_id) values( current_date, 1, 	"insert into book " , new.idBook );
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger delete_log_book
after delete on book
for each row 
begin
	insert into log(log_time, log_type, log_content, merchandise_id) values(
			current_date, -1, "delete book " , old.idBook );
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `cloth`
--

DROP TABLE IF EXISTS `cloth`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cloth` (
  `type` varchar(255) DEFAULT NULL,
  `size` varchar(10) NOT NULL,
  `color` varchar(45) NOT NULL,
  `idCloth` int(11) NOT NULL,
  PRIMARY KEY (`idCloth`,`size`,`color`),
  KEY `id_idx` (`idCloth`),
  CONSTRAINT `fk_cloth_id` FOREIGN KEY (`idCloth`) REFERENCES `merchandise` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cloth`
--

LOCK TABLES `cloth` WRITE;
/*!40000 ALTER TABLE `cloth` DISABLE KEYS */;
INSERT INTO `cloth` VALUES ('Champion Jersey Tee','LARGE','GRAY',1001),('Champion Jersey Tee','LARGE','RED',1001),('Champion Jersey Tee','LARGE','WHITE',1001),('Champion Jersey Tee','MIDEUM','GRAY',1001),('Champion Jersey Tee','MIDEUM','RED',1001),('Champion Jersey Tee','MIDEUM','WHITE',1001),('Champion Jersey Tee','SMALL','GRAY',1001),('Champion Jersey Tee','SMALL','RED',1001),('Champion Jersey Tee','SMALL','WHITE',1001),('Champion Jersey Tee','XLARGE','GRAY',1001),('Champion Jersey Tee','XLARGE','RED',1001),('Champion Jersey Tee','XLARGE','WHITE',1001),('Champion Jersey Tee','XXLARGE','GRAY',1001),('Champion Jersey Tee','XXLARGE','RED',1001),('Champion Jersey Tee','XXLARGE','WHITE',1001),('JanSport Jersey T Shirt','LARGE','GRAY',1002),('JanSport Jersey T Shirt','LARGE','RED',1002),('JanSport Jersey T Shirt','MIDEUM','GRAY',1002),('JanSport Jersey T Shirt','MIDEUM','RED',1002),('JanSport Jersey T Shirt','SMALL','GRAY',1002),('JanSport Jersey T Shirt','SMALL','RED',1002),('JanSport Jersey T Shirt','XLARGE','GRAY',1002),('JanSport Jersey T Shirt','XLARGE','RED',1002),('JanSport Jersey T Shirt','XXLARGE','GRAY',1002),('JanSport Jersey T Shirt','XXLARGE','RED',1002),('JanSport Jersey T Shirt','XXXLARGE','GRAY',1002),('JanSport Jersey T Shirt','XXXLARGE','RED',1002),('JanSport Jersey Tee Shirt','LARGE','BLACK',1003),('JanSport Jersey Tee Shirt','LARGE','CRIMSON',1003),('JanSport Jersey Tee Shirt','LARGE','RED',1003),('JanSport Jersey Tee Shirt','MIDEUM','BLACK',1003),('JanSport Jersey Tee Shirt','MIDEUM','CRIMSON',1003),('JanSport Jersey Tee Shirt','MIDEUM','RED',1003),('JanSport Jersey Tee Shirt','SMALL','BLACK',1003),('JanSport Jersey Tee Shirt','SMALL','CRIMSON',1003),('JanSport Jersey Tee Shirt','SMALL','RED',1003),('JanSport Jersey Tee Shirt','XLARGE','BLACK',1003),('JanSport Jersey Tee Shirt','XLARGE','CRIMSON',1003),('JanSport Jersey Tee Shirt','XLARGE','RED',1003),('JanSport Jersey Tee Shirt','XXLARGE','BLACK',1003),('JanSport Jersey Tee Shirt','XXLARGE','CRIMSON',1003),('JanSport Jersey Tee Shirt','XXLARGE','RED',1003),('JanSport Jersey Tee Shirt','XXXLARGE','BLACK',1003),('JanSport Jersey Tee Shirt','XXXLARGE','CRIMSON',1003),('JanSport Jersey Tee Shirt','XXXLARGE','RED',1003),('Champion Long Sleeve Tee','LARGE','RED',1004),('Champion Long Sleeve Tee','MIDEUM','RED',1004),('Champion Long Sleeve Tee','SAMLL','RED',1004),('Champion Long Sleeve Tee','XXLARGE','RED',1004),('League Victory Falls Short Sleeve Tee','LARGE','GRAY',1005),('League Victory Falls Short Sleeve Tee','MIDEUM','GRAY',1005),('League Victory Falls Short Sleeve Tee','SMALL','GRAY',1005),('League Victory Falls Short Sleeve Tee','XLARGE','GRAY',1005),('League Victory Falls Short Sleeve Tee','XSMALL','GRAY',1005),('League Victory Falls Short Sleeve Tee','XXLARGE','GRAY',1005),('Victory Falls Short Sleeve Baseball Tee','LARGE','GRAY/RED',1006),('Victory Falls Short Sleeve Baseball Tee','MIDEUM','GRAY/RED',1006),('Victory Falls Short Sleeve Baseball Tee','SMALL','GRAY/RED',1006),('Victory Falls Short Sleeve Baseball Tee','XLARGE','GRAY/RED',1006),('Victory Falls Short Sleeve Baseball Tee','XXLARGE','GRAY/RED',1006),('League Victory Falls Triblend Long Sleeve Tee','LARGE','GRAY',1007),('League Victory Falls Triblend Long Sleeve Tee','MIDEUM','GRAY',1007),('League Victory Falls Triblend Long Sleeve Tee','SMALL','GRAY',1007),('League Victory Falls Triblend Long Sleeve Tee','XLARGE','GRAY',1007),('League Victory Falls Triblend Long Sleeve Tee','XXLARGE','GRAY',1007),('League All American Ringer Tank','LARGE','WHITE',1008),('League All American Ringer Tank','MIDEUM','WHITE',1008),('League All American Ringer Tank','SMALL','WHITE',1008),('League All American Ringer Tank','XLARGE','WHITE',1008),('League All American Ringer Tank','XXLARGE','WHITE',1008),('All American Tee','LARGE','WHITE',1009),('All American Tee','MIDEUM','WHITE',1009),('All American Tee','SMALL','WHITE',1009),('All American Tee','XLARGE','WHITE',1009),('All American Tee','XXLARGE','WHITE',1009),('All American Baseball Tee','LARGE','GRAY',1010),('All American Baseball Tee','MIDEUM','GRAY',1010),('All American Baseball Tee','SMALL','GRAY',1010),('All American Baseball Tee','XLARGE','GRAY',1010),('All American Baseball Tee','XXLARGE','GRAY',1010),('Oxford America Solid Polo','LARGE','GRAY',1011),('Oxford America Solid Polo','MIDEUM','GRAY',1011),('Oxford America Solid Polo','SMALL','GRAY',1011),('Oxford America Solid Polo','XLARGE','GRAY',1011),('Oxford America Solid Polo','XXLARGE','GRAY',1011),('Champion Crew Sweatshirt','LARGE','GRAY',1012),('Champion Crew Sweatshirt','LARGE','RED',1012),('Champion Crew Sweatshirt','MIDEUM','GRAY',1012),('Champion Crew Sweatshirt','MIDEUM','RED',1012),('Champion Crew Sweatshirt','SMALL','GRAY',1012),('Champion Crew Sweatshirt','SMALL','RED',1012),('Champion Crew Sweatshirt','XLARGE','GRAY',1012),('Champion Crew Sweatshirt','XLARGE','RED',1012),('Champion Crew Sweatshirt','XSMALL','GRAY',1012),('Champion Crew Sweatshirt','XSMALL','RED',1012),('Champion Crew Sweatshirt','XXLARGE','GRAY',1012),('Champion Crew Sweatshirt','XXLARGE','RED',1012),('Champion Hooded Sweatshirt','LARGE','GRAY',1013),('Champion Hooded Sweatshirt','LARGE','RED',1013),('Champion Hooded Sweatshirt','MIDEUM','GRAY',1013),('Champion Hooded Sweatshirt','MIDEUM','RED',1013),('Champion Hooded Sweatshirt','SMALL','GRAY',1013),('Champion Hooded Sweatshirt','SMALL','RED',1013),('Champion Hooded Sweatshirt','XLARGE','GRAY',1013),('Champion Hooded Sweatshirt','XLARGE','RED',1013),('Champion Hooded Sweatshirt','XXLARGE','GRAY',1013),('Champion Hooded Sweatshirt','XXLARGE','RED',1013),('Jansport Crewneck Sweatshirt','LARGE','RED',1014),('Jansport Crewneck Sweatshirt','MIDEUM','RED',1014),('Jansport Crewneck Sweatshirt','XLARGE','RED',1014),('Jansport Crewneck Sweatshirt','XXLARGE','RED',1014),('Under Armour Tech Quarter Zip','LARGE','BLACK',1015),('Under Armour Tech Quarter Zip','MIDEUM','BLACK',1015),('Under Armour Tech Quarter Zip','SMALL','BLACK',1015),('Under Armour Tech Quarter Zip','XLARGE','BLACK',1015),('Under Armour Tech Quarter Zip','XXLARGE','BLACK',1015),('Jansport 14 Zip Pullover','LARGE','BLUE',1016),('Jansport 14 Zip Pullover','LARGE','GRAY',1016),('Jansport 14 Zip Pullover','LARGE','RED',1016),('Jansport 14 Zip Pullover','MIDEUM','BLUE',1016),('Jansport 14 Zip Pullover','MIDEUM','GRAY',1016),('Jansport 14 Zip Pullover','MIDEUM','RED',1016),('Jansport 14 Zip Pullover','XLARGE','BLUE',1016),('Jansport 14 Zip Pullover','XLARGE','GRAY',1016),('Jansport 14 Zip Pullover','XLARGE','RED',1016),('Jansport 14 Zip Pullover','XXLARGE','BLUE',1016),('Jansport 14 Zip Pullover','XXLARGE','GRAY',1016),('Jansport 14 Zip Pullover','XXLARGE','RED',1016),('JanSport Crew Neck Sweatshirt','LARGE','GRAY',1017),('JanSport Crew Neck Sweatshirt','MIDEUM','GRAY',1017),('JanSport Crew Neck Sweatshirt','SMALL','GRAY',1017),('JanSport Crew Neck Sweatshirt','XLARGE','GRAY',1017),('JanSport Crew Neck Sweatshirt','XXLARGE','GRAY',1017),('Champion Original Reverse Weave Crew','LARGE','WHITE',1018),('Champion Original Reverse Weave Crew','MIDEUM','WHITE',1018),('Champion Original Reverse Weave Crew','XLARGE','WHITE',1018),('Champion Original Reverse Weave Crew','XXLARGE','WHITE',1018),('Champion Hooded Sweatshirt','LARGE','BLACK',1019),('Champion Hooded Sweatshirt','MIDEUM','BLACK',1019),('Champion Hooded Sweatshirt','SMALL','BLACK',1019),('Champion Hooded Sweatshirt','XSMALL','BLACK',1019),('JanSport Hoodie','MIDEUM','BLACK',1020),('JanSport Hoodie','MIDEUM','WHITE',1020),('JanSport Hoodie','SMALL','BLACK',1020),('JanSport Hoodie','SMALL','WHITE',1020),('JanSport Hoodie','XLARGE','BLACK',1020),('JanSport Hoodie','XLARGE','WHITE',1020),('JanSport Hoodie','XXLARGE','BLACK',1020),('JanSport Hoodie','XXLARGE','WHITE',1020),('Under Armour Sport Style Crew','LARGE','BLACK',1021),('Under Armour Sport Style Crew','MIDEUM','BLACK',1021),('Under Armour Sport Style Crew','SMALL','BLACK',1021),('Under Armour Sport Style Crew','XLARGE','BLACK',1021),('Under Armour Sport Style Crew','XXLARGE','BLACK',1021),('Under Armour Sport Style Crew','XXXLARGE','BLACK',1021),('Under Armour Validate Quarter Zip Mock','LARGE','BLACK',1022),('Under Armour Validate Quarter Zip Mock','MIDEUM','BLACK',1022),('Under Armour Validate Quarter Zip Mock','SMALL','BLACK',1022),('Under Armour Validate Quarter Zip Mock','XLARGE','BLACK',1022),('Under Armour Validate Quarter Zip Mock','XXLARGE','BLACK',1022),('Under Armour Validate Quarter Zip Mock','XXXLARGE','BLACK',1022),('Jansport Cambridge Shawl Collar Fleece Pullover','LARGE','GRAY',1023),('Jansport Cambridge Shawl Collar Fleece Pullover','MIDEUM','GRAY',1023),('Jansport Cambridge Shawl Collar Fleece Pullover','SMALL','GRAY',1023),('Jansport Cambridge Shawl Collar Fleece Pullover','XLARGE','GRAY',1023),('Jansport Cambridge Shawl Collar Fleece Pullover','XXLARGE','GRAY',1023),('Under Armour Sport Style Hood','LARGE','BLACK',1024),('Under Armour Sport Style Hood','MIDEUM','BLACK',1024),('Under Armour Sport Style Hood','SMALL','BLACK',1024),('Under Armour Sport Style Hood','XLARGE','BLACK',1024),('Under Armour Sport Style Hood','XXLARGE','BLACK',1024),('Under Armour Sport Style Hood','XXXLARGE','BLACK',1024),('Champion Mens Be Seen Full Zip Jacket','LARGE','GRAY',1025),('Champion Mens Be Seen Full Zip Jacket','MIDEUM','GRAY',1025),('Champion Mens Be Seen Full Zip Jacket','SMALL','GRAY',1025),('Champion Mens Be Seen Full Zip Jacket','XLARGE','GRAY',1025),('Champion Mens Be Seen Full Zip Jacket','XXLARGE','GRAY',1025),('Under Armour Storm Crew Neck Sweater','LARGE','GRAY',1026),('Under Armour Storm Crew Neck Sweater','MIDEUM','GRAY',1026),('Under Armour Storm Crew Neck Sweater','SMALL','GRAY',1026),('Under Armour Storm Crew Neck Sweater','XLARGE','GRAY',1026),('Under Armour Storm Crew Neck Sweater','XXLARGE','GRAY',1026),('Under Armour Storm Crew Neck Sweater','XXXLARGE','GRAY',1026),('Under Armour Microfleece Pullover','LARGE','GRAY',1027),('Under Armour Microfleece Pullover','MIDEUM','GRAY',1027),('Under Armour Microfleece Pullover','SMALL','GRAY',1027),('Under Armour Microfleece Pullover','XLARGE','GRAY',1027),('Under Armour Microfleece Pullover','XXLARGE','GRAY',1027),('Under Armour Microfleece Pullover','XXXLARGE','GRAY',1027),('Epic Short Sleeve Tee','LARGE','GRAY',1028),('Epic Short Sleeve Tee','LARGE','WHITE',1028),('Epic Short Sleeve Tee','MIDEUM','GRAY',1028),('Epic Short Sleeve Tee','MIDEUM','WHITE',1028),('Epic Short Sleeve Tee','SMALL','GRAY',1028),('Epic Short Sleeve Tee','SMALL','WHITE',1028),('Epic Short Sleeve Tee','XLARGE','GRAY',1028),('Epic Short Sleeve Tee','XLARGE','WHITE',1028),('Epic Short Sleeve Tee','XXLARGE','GRAY',1028),('Epic Short Sleeve Tee','XXLARGE','WHITE',1028),('veryniceone','XXSmall','red',1899),('niceone','xxl','red',1998),('coolcloth','medium','red',1999);
/*!40000 ALTER TABLE `cloth` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger insert_log_cloth
after insert on cloth
for each row
begin
	insert into log(log_time, log_type, log_content, merchandise_id) values( 	current_date, 1, "insert into cloth " , new.idCloth );
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger delete_log_cloth
after delete on cloth
for each row 
begin
	insert into log(log_time, log_type, log_content, merchandise_id) values(
			current_date, -1, "delete cloth " , old.idCloth );
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Temporary view structure for view `current_product_price`
--

DROP TABLE IF EXISTS `current_product_price`;
/*!50001 DROP VIEW IF EXISTS `current_product_price`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `current_product_price` AS SELECT 
 1 AS `id`,
 1 AS `name`,
 1 AS `price`,
 1 AS `number`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `log`
--

DROP TABLE IF EXISTS `log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `log_time` date DEFAULT NULL,
  `log_type` tinyint(1) DEFAULT NULL,
  `log_content` varchar(45) DEFAULT NULL,
  `merchandise_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log`
--

LOCK TABLES `log` WRITE;
/*!40000 ALTER TABLE `log` DISABLE KEYS */;
INSERT INTO `log` VALUES (1,'2016-12-11',1,'insert into book ',2100),(2,'2016-12-11',-1,'delete book ',2100),(3,'2016-12-11',1,'insert into cloth ',1111),(4,'2016-12-11',-1,'delete cloth ',1111),(5,'2016-12-11',1,'insert into stationery ',3111),(6,'2016-12-11',-1,'delete stationery ',3111);
/*!40000 ALTER TABLE `log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `merchandise`
--

DROP TABLE IF EXISTS `merchandise`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `merchandise` (
  `id` int(11) NOT NULL,
  `supplier_id` int(11) NOT NULL,
  `price` float DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `merchandise`
--

LOCK TABLES `merchandise` WRITE;
/*!40000 ALTER TABLE `merchandise` DISABLE KEYS */;
INSERT INTO `merchandise` VALUES (1001,1001,19,45),(1002,1002,19,34),(1003,1002,20,79),(1004,1001,28,24),(1005,1003,28,19),(1006,1003,30,23),(1007,1003,33,34),(1008,1004,30,10),(1009,1004,30,33),(1010,1004,35,22),(1011,1004,30,12),(1012,1001,35,45),(1013,1001,37,23),(1014,1002,37,22),(1015,1005,40,33),(1016,1002,45,45),(1017,1002,45,23),(1018,1001,45,12),(1019,1001,50,11),(1020,1002,50,40),(1021,1005,60,23),(1022,1005,65,11),(1023,1002,65,13),(1024,1005,70,22),(1025,1001,70,11),(1026,1005,75,22),(1027,1005,80,22),(1028,1006,28,34),(1789,1001,77,77),(1899,1002,22,33),(1998,1001,2,3),(1999,1001,12,12),(2001,2010,19,26),(2002,2010,20,79),(2003,2010,28,24),(2004,2010,28,19),(2005,2010,30,23),(2006,2070,33,34),(2007,2070,30,10),(2008,2070,30,33),(2009,2070,35,22),(2010,2070,30,12),(2011,2070,35,45),(2012,2070,37,23),(2013,2070,37,22),(2014,2070,40,33),(2015,2070,45,45),(2016,2070,45,23),(2017,2070,45,12),(2018,2070,50,11),(2019,2070,50,40),(2020,2070,60,23),(2021,2010,65,11),(2022,2020,65,13),(2023,2020,70,22),(2024,2020,70,11),(2025,2020,75,22),(2026,2020,80,22),(2027,2020,28,34),(2028,2020,45,27),(2029,2020,63,49),(2030,2020,141,33),(2031,2020,184,43),(2032,2020,68,25),(2033,2020,188,13),(2034,2020,107,13),(2035,2020,75,27),(2036,2020,73,49),(2037,2020,135,39),(2038,2020,107,49),(2039,2030,85,24),(2040,2030,185,13),(2041,2030,77,26),(2042,2030,117,26),(2043,2030,61,34),(2044,2030,178,41),(2045,2030,110,32),(2046,2030,176,24),(2047,2030,158,46),(2048,2030,197,31),(2049,2030,94,23),(2050,2030,190,19),(2051,2030,89,35),(2052,2030,67,21),(2053,2030,159,40),(2054,2030,75,42),(2055,2030,117,36),(2056,2030,70,39),(2057,2030,115,12),(2058,2030,114,23),(2059,2050,170,34),(2060,2050,85,43),(2061,2050,180,50),(2062,2050,147,16),(2063,2050,157,46),(2064,2050,140,18),(2065,2050,149,46),(2066,2050,158,28),(2067,2050,53,36),(2068,2050,119,16),(2069,2050,56,38),(2070,2050,99,32),(2071,2060,99,13),(2072,2060,66,27),(2073,2060,65,18),(2074,2060,123,34),(2075,2060,170,31),(2076,2060,175,37),(2077,2060,117,31),(2078,2060,65,32),(2079,2060,153,48),(2080,2060,51,44),(3001,3014,4,242),(3002,3014,14,229),(3003,3014,14,215),(3004,3014,14,215),(3005,3014,16,227),(3006,3014,7,215),(3007,3027,16,230),(3008,3027,16,203),(3009,3027,16,228),(3010,3027,7,203),(3011,3027,15,204),(3012,3027,16,205),(3013,3027,9,233),(3014,3027,9,244),(3015,3027,19,205),(3016,3027,8,243),(3017,3045,13,230),(3018,3045,13,245),(3019,3045,16,249),(3020,3045,16,216),(3021,3045,9,241),(3022,3045,14,211),(3023,3045,16,229),(3024,3045,19,212),(3025,3045,9,204),(3026,3096,4,248),(3027,3096,17,223),(3028,3096,12,208),(3029,3096,10,207),(3030,3096,4,221),(3031,3096,19,221),(3032,3096,6,211),(3033,3096,5,249),(3034,3096,2,240),(3035,3011,4,208),(3036,3011,17,217),(3037,3011,14,240),(3038,3011,18,229),(3039,3011,5,225),(3040,3011,17,246),(3041,3011,17,234),(3042,3011,5,207),(3043,3011,14,235),(3044,3011,4,237),(3045,3011,14,242),(3046,3022,7,229),(3047,3022,7,206),(3048,3022,7,202),(3049,3022,5,202),(3050,3022,4,232),(3051,3022,9,243),(3052,3022,16,215),(3053,3022,17,240),(3054,3022,8,207),(3055,3022,17,221),(3056,3022,7,235),(3057,3007,19,232),(3058,3007,10,249),(3059,3007,14,224),(3060,3007,16,233),(3061,3007,20,218),(3062,3007,14,232),(3063,3007,16,203),(3064,3007,14,248),(3065,3007,9,220),(3066,3007,17,229),(3067,3007,7,210),(3068,3007,13,220),(3069,3008,11,236),(3070,3008,17,218),(3071,3008,11,234),(3072,3008,14,209),(3073,3008,3,245),(3074,3008,15,233),(3075,3008,15,203),(3076,3008,7,219),(3077,3008,4,226),(3078,3008,9,236),(3079,3008,16,223),(3080,3008,18,229),(3081,3008,4,206),(3082,3008,11,248),(3083,3008,19,205),(3084,3008,9,248),(3085,3008,11,242),(3086,3008,8,209),(3087,3008,3,236),(3088,3008,6,241),(3089,3008,12,221),(3090,3008,6,226),(3091,3008,10,239),(3092,3008,4,230),(3093,3009,12,229),(3094,3009,5,208),(3095,3009,7,246),(3096,3009,3,226),(3097,3009,19,222),(3098,3009,9,207),(3099,3009,9,213),(3100,3009,12,210);
/*!40000 ALTER TABLE `merchandise` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modify`
--

DROP TABLE IF EXISTS `modify`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `modify` (
  `Merchandise_id` int(11) NOT NULL,
  `Administrator_username` varchar(45) NOT NULL,
  `Administrator_Log_log_id` int(11) NOT NULL,
  `eventID` int(11) DEFAULT NULL,
  `discount` int(11) DEFAULT NULL,
  `add_or_delete` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Merchandise_id`,`Administrator_username`,`Administrator_Log_log_id`),
  KEY `fk_Merchandise_has_Administrator_Merchandise1_idx` (`Merchandise_id`),
  CONSTRAINT `fk_Merchandise_has_Administrator_Merchandise1` FOREIGN KEY (`Merchandise_id`) REFERENCES `merchandise` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modify`
--

LOCK TABLES `modify` WRITE;
/*!40000 ALTER TABLE `modify` DISABLE KEYS */;
/*!40000 ALTER TABLE `modify` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stationery`
--

DROP TABLE IF EXISTS `stationery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stationery` (
  `st_name` varchar(255) NOT NULL,
  `idStationery` int(11) NOT NULL,
  PRIMARY KEY (`idStationery`),
  CONSTRAINT `fk_stationery_id` FOREIGN KEY (`idStationery`) REFERENCES `merchandise` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stationery`
--

LOCK TABLES `stationery` WRITE;
/*!40000 ALTER TABLE `stationery` DISABLE KEYS */;
INSERT INTO `stationery` VALUES ('A4 Size Paper 75GSm Century',3001),('F/S Size Paper 75GSM Century',3002),('A/3 Size Paper 75GSM Century',3003),('Envelop (10\"*4.5\") White TajMahal 100 pc',3004),('Envelop (11\"*8\") Cloth & Paper',3005),('Envelop A4 Size Cloth & Paper',3006),('Flopy Amkett',3007),('My Clear Bag Button Type Folder (Solo)',3008),('L Shapered Folder A/4 Size (Solo)',3009),('Plastic Stick A/4 Size (Solo)',3010),('Index Fille Plastic Coated (Solo)',3011),('Report File R-Fill (Solo)',3012),('Guard file - Durga ',3013),('Board File- Durga',3014),('Paler Flag- Corporate 3 Pd Sol 25mm*75mm',3015),('White on Slip/ pad corporate 3*3',3016),('Sprial Pad (Neelgagan) 66',3017),('Sprial Pad (Neelgagan) 88',3018),('Whiteing Pad No. 8 Milan',3019),('Short Hand Copy Milan',3020),('2Q Fancy General Register',3021),('4Q Fancy General Register',3022),('6Q Fancy General Register',3023),('2Q Fancy Stock General Register',3024),('4Q Fancy Stock General Register',3025),('6Q Fancy Stock General Register',3026),('2Q Despach Register- Monaf',3027),('4Q Despatch Registe - Monaf',3028),('6Q Despatch Register - Monaf',3029),('2Q Fancy Letter Receiving Reg.- Monaf',3030),('4Q Fancy Letter Receiving Reg.- Monaf',3031),('6Q Fancy Letter Receiving Reg.- Monaf',3032),('2Q Fancy Case Book Double Extnra - Monaf',3033),('6Q Fancy Case Book Double Extnra - Monaf',3034),('2Q Fancy Ledger Book - Monaf',3035),('4Q Fancy Ledger Book - Monaf',3036),('6Q Fancy Ledger Book - Monaf',3037),('Fancy Attendance & C.L. Register - Monaf',3038),('Note Sheet Pad - General',3039),('Signature Pad Neelgagan',3040),('Log Book Monaf',3041),('Marker Pen -Luxor',3042),('Hilighter Pen Luxor Gloliter',3043),('White Boared Pen Camlin',3044),('Pen Agni Gel',3045),('Pen Linc Smart Gel',3046),('Piol Pen Hi Tec Point 0.5',3047),('Ball Pen Refill Small - Linc',3048),('Tube Gum 700 ml Camal',3049),('Bottal Gum 700 ml Camal',3050),('File Tag 100 Pecs Bunch',3051),('Paper Pin',3052),('Gems Clip',3053),('Fevi Stick 15 gm',3054),('Stamp Pad Faber Castell 88*54 mm',3055),('Stamp Pad Faber ink 100ml 100 mk - Camlin',3056),('Sharper - Natraj',3057),('Pencil',3058),('Short Hand Pencil Natraj/Apsara',3059),('Pencil Eraser - Natraj',3060),('Scale 15 cm - Natraj',3061),('Scale 30 cm - Natraj',3062),('Easer Correction Fluid 15ml',3063),('Brown Tape - Roll 2\"- wonder',3064),('Callo Tap-Roll 1/2 Cello/ Wonder',3065),('Calculator 12 Digit Casio MJ120',3066),('Binder Clip 32mm - Solo',3067),('Document Trays - Classic No. 1738 Omga',3068),('Deluxe Pencil Cap Stand No. 1704 Omega',3069),('Pin Stabd Pin-O- Clip Deluxe 1797 Omega',3070),('Paper Cllip Round Medium - 1778 Omega',3071),('Paper Cutter Snap of Cutter Big No. 1793 Omega',3072),('Drawing Board Pin -Push Long-1721 Omega',3073),('Sponga Pad-Damper Round No. 1725 Omega',3074),('Plastic Box File Elite Box No. - 1801 Omega',3075),('Stapler 10 No - Kangaroo',3076),('Stapler H.P. 45 - Kangaroo',3077),('Stapler Pin No.10 - Kangaroo (Pocket)',3078),('Stapler Pin No.24/6 - Kangaroo (Pocket)',3079),('Paper Punching Machine Single - Kangaroo',3080),('Paper Punching Machine Double - Kangaroo',3081),('Penstand 4 Pen Plastic',3082),('Paper Weight - Glass',3083),('Scissor Corporate 100sg/1301',3084),('Tekue With Plastic hand 10',3085),('Gel Pen (Achiver)',3086),('Pen (Getter)',3087),('Pen Stand',3088),('Visiting Card Floder',3089),('Paper Clip (Chamita)',3090),('Art Pin (Clip)',3091),('Calculator (Scientific)',3092),('Guard Stand File',3093),('Engagement Pad',3094),('Stamp (Ink Pad)',3095),('Pen Drive (4GB)',3096),('Colour Pencil',3097),('Sketch Pen',3098),('Life Boy Soap Small',3099),('7 Measerment Tape (100 Metre)',3100);
/*!40000 ALTER TABLE `stationery` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger insert_log_sta
after insert on stationery
for each row
begin
	insert into log(log_time, log_type, log_content, merchandise_id) values( 	current_date, 1, "insert into stationery " , new.idStationery );
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger delete_log_stationery
after delete on stationery
for each row 
begin
	insert into log(log_time, log_type, log_content, merchandise_id) values(
			current_date, -1, "delete stationery " , old.idStationery );
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `idSupplier` int(11) NOT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idSupplier`),
  UNIQUE KEY `idSupplier_UNIQUE` (`idSupplier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1001,'8008320594','Hanes, P.O. Box 748, Rural Hall, NC 27098','Champion'),(1002,'8775415337','480 Lewis Avenue, Westfield Meriden, Meriden,  CT  06451  ','JanSport'),(1003,'9788477005','201 Lunenburg St, Fitchburg, MA 01420','Victory'),(1004,'7195744400','3690 N. ACADEMY BLVD\nCOLO. SPRINGS,CO 80917','All American'),(1005,'8887276687','1020 Hull Street\nBaltimore, MD 21230-2080','Under Armour'),(1006,'5036716453','One Bowerman Drive\nBeaverton, OR 97005','Nike'),(1007,'8007788948','3202 Lapeer Rd, Flint, MI 48503','LogoFit'),(1008,'8006273244','300 Fame Ave, Hanover, PA 17331','Lagecy Athletic'),(1009,'8006226953','Washington County, Oregon','Columbia'),(2010,'8023140057','101 PE Ave','Pearson'),(2020,'9071245079','PRH main Street','Penguin Random House '),(2030,'7872490034','32 Hill Street','Hachette Livre'),(2040,'8005529408','100 South 5th Street,Suite 700,Minneapolis, MN','Wolters Kluwer'),(2050,'2071665500','1-3 Strand London','RELX Group'),(2060,'7814005900','Needham, MA','ThomsonReuters'),(2070,'8003383987','Columbus, OG 43218','McGraw-Hill Education'),(3007,'5017826734','91 Martin Street','PILOT'),(3008,'9721437780','38 Bruce Street','UNI'),(3009,'8741235302','120 JJ Street','ZEBRA'),(3011,'8091313675',' 320 A Street ','PAPER MATE'),(3014,'8883643577','613 G Street, MA','3M'),(3022,'8471268309','470  R Street ','CROSS'),(3027,'8749247836','132 D Street, LA','Parker'),(3045,'7317835409',' 12 E Stret, PA','Sheaffer'),(3096,'5031459037','24 F Street, Oregon','Sanford');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supply`
--

DROP TABLE IF EXISTS `supply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supply` (
  `date` date DEFAULT NULL,
  `supply_number` int(11) DEFAULT NULL,
  `idSupplier` int(11) NOT NULL,
  `idMerchandise` int(11) NOT NULL,
  `Log_log_id` int(11) NOT NULL,
  PRIMARY KEY (`idMerchandise`,`idSupplier`),
  KEY `fk_supplier_id_idx` (`idSupplier`),
  CONSTRAINT `fk_merchandise_id ` FOREIGN KEY (`idMerchandise`) REFERENCES `merchandise` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_supplier_id` FOREIGN KEY (`idSupplier`) REFERENCES `supplier` (`idSupplier`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supply`
--

LOCK TABLES `supply` WRITE;
/*!40000 ALTER TABLE `supply` DISABLE KEYS */;
/*!40000 ALTER TABLE `supply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `current_product_price`
--

/*!50001 DROP VIEW IF EXISTS `current_product_price`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `current_product_price` AS (select `merchandise`.`id` AS `id`,`cloth`.`type` AS `name`,`merchandise`.`price` AS `price`,sum(`merchandise`.`number`) AS `number` from (`cloth` join `merchandise` on((`cloth`.`idCloth` = `merchandise`.`id`))) group by `merchandise`.`id`) union (select `merchandise`.`id` AS `id`,`book`.`title` AS `title`,`merchandise`.`price` AS `price`,`merchandise`.`number` AS `number` from (`book` join `merchandise` on((`book`.`idBook` = `merchandise`.`id`)))) union (select `merchandise`.`id` AS `id`,`stationery`.`st_name` AS `st_name`,`merchandise`.`price` AS `price`,`merchandise`.`number` AS `number` from (`stationery` join `merchandise` on((`stationery`.`idStationery` = `merchandise`.`id`)))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-11 17:40:37
