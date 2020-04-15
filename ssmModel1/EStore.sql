/*
 Navicat Premium Data Transfer

 Source Server         : MyTencent
 Source Server Type    : MySQL
 Source Server Version : 50645
 Source Host           : 122.51.29.117:3306
 Source Schema         : EStore

 Target Server Type    : MySQL
 Target Server Version : 50645
 File Encoding         : 65001

 Date: 25/11/2019 22:11:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `price` float(10,2) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `image` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_book` (`category_id`),
  CONSTRAINT `fk_book` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
BEGIN;
INSERT INTO `book` VALUES (1, 'Java EE技术', 81.00, 3, 'book1.jpg');
INSERT INTO `book` VALUES (2, 'Spring Cloud微服务实战', 21.15, 3, 'book2.jpg');
INSERT INTO `book` VALUES (3, 'Python核心编程', 108.00, 3, 'book3.jpg');
INSERT INTO `book` VALUES (4, 'SpringBoot实战', 59.25, 3, 'book4.jpg');
INSERT INTO `book` VALUES (5, 'JAVA SERVLET 编程(第二版)', 38.25, 3, 'book5.jpg');
INSERT INTO `book` VALUES (6, 'XML高阶编程', 97.20, 3, 'book6.jpg');
INSERT INTO `book` VALUES (7, '精通STRUTS:基于MVC的JAVA WEB设计与开发', 36.75, 3, 'book7.jpg');
INSERT INTO `book` VALUES (8, '精通HIBERNATE：JAVA对象持久化技术详解', 44.25, 3, 'book8.jpg');
INSERT INTO `book` VALUES (9, 'SPRING IN ACTION中文版', 29.25, 3, 'book9.jpg');
INSERT INTO `book` VALUES (10, '精通EJB 3.0', 44.25, 3, 'book10.jpg');
COMMIT;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `father_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
BEGIN;
INSERT INTO `category` VALUES (1, '文学类', NULL);
INSERT INTO `category` VALUES (2, '教育类', NULL);
INSERT INTO `category` VALUES (3, '计算机类', NULL);
INSERT INTO `category` VALUES (4, '儿童类', NULL);
INSERT INTO `category` VALUES (5, '漫画类', NULL);
INSERT INTO `category` VALUES (6, '工具书类', NULL);
INSERT INTO `category` VALUES (7, '期刊类', NULL);
INSERT INTO `category` VALUES (8, '诗歌', 1);
INSERT INTO `category` VALUES (9, '散文', 1);
INSERT INTO `category` VALUES (10, '小说', 1);
INSERT INTO `category` VALUES (11, '高中', 2);
INSERT INTO `category` VALUES (12, '大学', 2);
INSERT INTO `category` VALUES (13, '软件', 3);
INSERT INTO `category` VALUES (14, '硬件', 3);
INSERT INTO `category` VALUES (15, '益智', 4);
INSERT INTO `category` VALUES (16, '生活', 4);
INSERT INTO `category` VALUES (17, '特长', 4);
INSERT INTO `category` VALUES (18, '科幻', 5);
INSERT INTO `category` VALUES (19, '冒险', 5);
INSERT INTO `category` VALUES (20, '灾难', 5);
INSERT INTO `category` VALUES (21, '农业', 6);
INSERT INTO `category` VALUES (22, '金融', 6);
INSERT INTO `category` VALUES (23, '医学', 6);
INSERT INTO `category` VALUES (24, '编程', 7);
INSERT INTO `category` VALUES (25, '图像', 7);
INSERT INTO `category` VALUES (26, '股市', 7);
COMMIT;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `zip` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `total` float(10,2) DEFAULT NULL,
  `orderDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `customer_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_order` (`customer_id`),
  CONSTRAINT `fk_order` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for orderline
-- ----------------------------
DROP TABLE IF EXISTS `orderline`;
CREATE TABLE `orderline` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num` int(11) DEFAULT NULL,
  `book_id` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_orderline` (`book_id`),
  KEY `fk_orderline_1` (`order_id`),
  CONSTRAINT `fk_orderline` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`),
  CONSTRAINT `fk_orderline_1` FOREIGN KEY (`order_id`) REFERENCES `order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for shopCar
-- ----------------------------
DROP TABLE IF EXISTS `shopCar`;
CREATE TABLE `shopCar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL DEFAULT '0',
  `book_id` int(11) NOT NULL DEFAULT '0',
  `num` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `customer_id` (`customer_id`),
  KEY `book_id` (`book_id`),
  CONSTRAINT `shopCar_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `shopCar_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
