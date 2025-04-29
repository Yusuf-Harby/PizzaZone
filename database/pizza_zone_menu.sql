-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pizza_zone
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `item_name` varchar(50) NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `item_name` (`item_name`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'Eastern Liver Pizza',70),(2,'Eastern Shawarma Pizza',70),(3,'Eastern Beef Shawarma Pizza',80),(4,'Eastern Olive Pizza',65),(5,'Eastern Tuna Pizza',85),(6,'Eastern Salami Pizza',75),(7,'Eastern Smoked Meat Pizza',90),(8,'Eastern Shrimp Pizza',100),(9,'Eastern Kofta Pizza',80),(10,'Eastern Cheese Pizza',70),(11,'Eastern Vegetables Pizza',65),(12,'Eastern Meat Pizza',85),(13,'Eastern Local Sausage Pizza',80),(14,'Eastern Grilled Chicken Pizza',85),(15,'Eastern Minced Meat Pizza',70),(16,'Italian Pesto Pizza',105),(17,'Italian Carbonara Pizza',110),(18,'Italian Caprese Pizza',100),(19,'Italian Seafood Pizza',120),(20,'Italian Meat Pizza',105),(21,'Italian Mushroom Pizza',95),(22,'Italian BBQ Chicken Pizza',110),(23,'Italian Hawaiian Pizza',105),(24,'Italian Veggie Pizza',90),(25,'Italian Cheese Pizza',85),(26,'Italian Pepperoni Pizza',105),(27,'Italian Margherita Pizza',90),(28,'Espresso Affogato',50),(29,'Iced Coffee',40),(30,'Milk Shake',45),(31,'Hot Chocolate',35),(32,'Latte',50),(33,'Cappuccino',55),(34,'Espresso',40),(35,'Fanta',20),(36,'Sprite',20),(37,'Cola',25),(38,'Iced Tea',30),(39,'Fruit Punch',40),(40,'Mango Juice',45),(41,'Lemonade',30),(42,'Orange Juice',35),(43,'Stuffed Vine Leaves',30),(44,'Hummus With Pita',25),(45,'Fried Zucchini',30),(46,'Chicken Wings',40),(47,'Mozzarella Sticks',35),(48,'Caesar Salad',30),(49,'Garlic Bread',20),(50,'Onion Rings',25),(51,'French Fries',15);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-16  3:48:19
