-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssml4g8w
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssml4g8w/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssml4g8w/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssml4g8w/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussfufeiziliao`
--

DROP TABLE IF EXISTS `discussfufeiziliao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussfufeiziliao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=217 DEFAULT CHARSET=utf8 COMMENT='付费资料评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussfufeiziliao`
--

LOCK TABLES `discussfufeiziliao` WRITE;
/*!40000 ALTER TABLE `discussfufeiziliao` DISABLE KEYS */;
INSERT INTO `discussfufeiziliao` VALUES (211,'2021-02-05 01:40:59',1,1,'评论内容1','回复内容1'),(212,'2021-02-05 01:40:59',2,2,'评论内容2','回复内容2'),(213,'2021-02-05 01:40:59',3,3,'评论内容3','回复内容3'),(214,'2021-02-05 01:40:59',4,4,'评论内容4','回复内容4'),(215,'2021-02-05 01:40:59',5,5,'评论内容5','回复内容5'),(216,'2021-02-05 01:40:59',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussfufeiziliao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjifenshangpin`
--

DROP TABLE IF EXISTS `discussjifenshangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjifenshangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=227 DEFAULT CHARSET=utf8 COMMENT='积分商品评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjifenshangpin`
--

LOCK TABLES `discussjifenshangpin` WRITE;
/*!40000 ALTER TABLE `discussjifenshangpin` DISABLE KEYS */;
INSERT INTO `discussjifenshangpin` VALUES (221,'2021-02-05 01:40:59',1,1,'评论内容1','回复内容1'),(222,'2021-02-05 01:40:59',2,2,'评论内容2','回复内容2'),(223,'2021-02-05 01:40:59',3,3,'评论内容3','回复内容3'),(224,'2021-02-05 01:40:59',4,4,'评论内容4','回复内容4'),(225,'2021-02-05 01:40:59',5,5,'评论内容5','回复内容5'),(226,'2021-02-05 01:40:59',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussjifenshangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusskechengxinxi`
--

DROP TABLE IF EXISTS `discusskechengxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusskechengxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8 COMMENT='课程信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusskechengxinxi`
--

LOCK TABLES `discusskechengxinxi` WRITE;
/*!40000 ALTER TABLE `discusskechengxinxi` DISABLE KEYS */;
INSERT INTO `discusskechengxinxi` VALUES (201,'2021-02-05 01:40:59',1,1,'评论内容1','回复内容1'),(202,'2021-02-05 01:40:59',2,2,'评论内容2','回复内容2'),(203,'2021-02-05 01:40:59',3,3,'评论内容3','回复内容3'),(204,'2021-02-05 01:40:59',4,4,'评论内容4','回复内容4'),(205,'2021-02-05 01:40:59',5,5,'评论内容5','回复内容5'),(206,'2021-02-05 01:40:59',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusskechengxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exampaper`
--

DROP TABLE IF EXISTS `exampaper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exampaper` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `name` varchar(200) NOT NULL COMMENT '试卷名称',
  `time` int(11) NOT NULL COMMENT '考试时长(分钟)',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '试卷状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='试卷表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exampaper`
--

LOCK TABLES `exampaper` WRITE;
/*!40000 ALTER TABLE `exampaper` DISABLE KEYS */;
/*!40000 ALTER TABLE `exampaper` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `examquestion`
--

DROP TABLE IF EXISTS `examquestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `examquestion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `paperid` bigint(20) NOT NULL COMMENT '所属试卷id（外键）',
  `papername` varchar(200) NOT NULL COMMENT '试卷名称',
  `questionname` varchar(200) NOT NULL COMMENT '试题名称',
  `options` longtext COMMENT '选项，json字符串',
  `score` bigint(20) DEFAULT '0' COMMENT '分值',
  `answer` varchar(200) DEFAULT NULL COMMENT '正确答案',
  `analysis` longtext COMMENT '答案解析',
  `type` bigint(20) DEFAULT '0' COMMENT '试题类型，0：单选题 1：多选题 2：判断题 3：填空题（暂不考虑多项填空）',
  `sequence` bigint(20) DEFAULT '100' COMMENT '试题排序，值越大排越前面',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='试题表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `examquestion`
--

LOCK TABLES `examquestion` WRITE;
/*!40000 ALTER TABLE `examquestion` DISABLE KEYS */;
/*!40000 ALTER TABLE `examquestion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `examrecord`
--

DROP TABLE IF EXISTS `examrecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `examrecord` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `paperid` bigint(20) NOT NULL COMMENT '试卷id（外键）',
  `papername` varchar(200) NOT NULL COMMENT '试卷名称',
  `questionid` bigint(20) NOT NULL COMMENT '试题id（外键）',
  `questionname` varchar(200) NOT NULL COMMENT '试题名称',
  `options` longtext COMMENT '选项，json字符串',
  `score` bigint(20) DEFAULT '0' COMMENT '分值',
  `answer` varchar(200) DEFAULT NULL COMMENT '正确答案',
  `analysis` longtext COMMENT '答案解析',
  `myscore` bigint(20) NOT NULL DEFAULT '0' COMMENT '试题得分',
  `myanswer` varchar(200) DEFAULT NULL COMMENT '考生答案',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考试记录表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `examrecord`
--

LOCK TABLES `examrecord` WRITE;
/*!40000 ALTER TABLE `examrecord` DISABLE KEYS */;
/*!40000 ALTER TABLE `examrecord` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='解疑论坛';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (131,'2021-02-05 01:40:59','帖子标题1','帖子内容1',1,1,'用户名1','开放'),(132,'2021-02-05 01:40:59','帖子标题2','帖子内容2',2,2,'用户名2','开放'),(133,'2021-02-05 01:40:59','帖子标题3','帖子内容3',3,3,'用户名3','开放'),(134,'2021-02-05 01:40:59','帖子标题4','帖子内容4',4,4,'用户名4','开放'),(135,'2021-02-05 01:40:59','帖子标题5','帖子内容5',5,5,'用户名5','开放'),(136,'2021-02-05 01:40:59','帖子标题6','帖子内容6',6,6,'用户名6','开放');
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fufeiziliao`
--

DROP TABLE IF EXISTS `fufeiziliao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fufeiziliao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengbianhao` varchar(200) DEFAULT NULL COMMENT '课程编号',
  `kechengmingcheng` varchar(200) DEFAULT NULL COMMENT '课程名称',
  `ziliaomingcheng` varchar(200) DEFAULT NULL COMMENT '资料名称',
  `ziliaotupian` varchar(200) DEFAULT NULL COMMENT '资料图片',
  `jiage` int(11) DEFAULT NULL COMMENT '价格',
  `neirong` longtext COMMENT '内容',
  `ziliaoxiangqing` longtext COMMENT '资料详情',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='付费资料';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fufeiziliao`
--

LOCK TABLES `fufeiziliao` WRITE;
/*!40000 ALTER TABLE `fufeiziliao` DISABLE KEYS */;
INSERT INTO `fufeiziliao` VALUES (41,'2021-02-05 01:40:58','课程编号1','课程名称1','资料名称1','http://localhost:8080/ssml4g8w/upload/fufeiziliao_ziliaotupian1.jpg',1,'内容1','资料详情1',1,1),(42,'2021-02-05 01:40:58','课程编号2','课程名称2','资料名称2','http://localhost:8080/ssml4g8w/upload/fufeiziliao_ziliaotupian2.jpg',2,'内容2','资料详情2',2,2),(43,'2021-02-05 01:40:58','课程编号3','课程名称3','资料名称3','http://localhost:8080/ssml4g8w/upload/fufeiziliao_ziliaotupian3.jpg',3,'内容3','资料详情3',3,3),(44,'2021-02-05 01:40:58','课程编号4','课程名称4','资料名称4','http://localhost:8080/ssml4g8w/upload/fufeiziliao_ziliaotupian4.jpg',4,'内容4','资料详情4',4,4),(45,'2021-02-05 01:40:58','课程编号5','课程名称5','资料名称5','http://localhost:8080/ssml4g8w/upload/fufeiziliao_ziliaotupian5.jpg',5,'内容5','资料详情5',5,5),(46,'2021-02-05 01:40:58','课程编号6','课程名称6','资料名称6','http://localhost:8080/ssml4g8w/upload/fufeiziliao_ziliaotupian6.jpg',6,'内容6','资料详情6',6,6);
/*!40000 ALTER TABLE `fufeiziliao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jifenduihuan`
--

DROP TABLE IF EXISTS `jifenduihuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jifenduihuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinbianhao` varchar(200) DEFAULT NULL COMMENT '商品编号',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `suoxujifen` varchar(200) DEFAULT NULL COMMENT '所需积分',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `duihuanshenqing` varchar(200) DEFAULT NULL COMMENT '兑换申请',
  `shouhuodizhi` varchar(200) DEFAULT NULL COMMENT '收货地址',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='积分兑换';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jifenduihuan`
--

LOCK TABLES `jifenduihuan` WRITE;
/*!40000 ALTER TABLE `jifenduihuan` DISABLE KEYS */;
INSERT INTO `jifenduihuan` VALUES (121,'2021-02-05 01:40:59','商品编号1','商品名称1','所需积分1','学号1','学生姓名1','兑换申请1','收货地址1','13823888881','是',''),(122,'2021-02-05 01:40:59','商品编号2','商品名称2','所需积分2','学号2','学生姓名2','兑换申请2','收货地址2','13823888882','是',''),(123,'2021-02-05 01:40:59','商品编号3','商品名称3','所需积分3','学号3','学生姓名3','兑换申请3','收货地址3','13823888883','是',''),(124,'2021-02-05 01:40:59','商品编号4','商品名称4','所需积分4','学号4','学生姓名4','兑换申请4','收货地址4','13823888884','是',''),(125,'2021-02-05 01:40:59','商品编号5','商品名称5','所需积分5','学号5','学生姓名5','兑换申请5','收货地址5','13823888885','是',''),(126,'2021-02-05 01:40:59','商品编号6','商品名称6','所需积分6','学号6','学生姓名6','兑换申请6','收货地址6','13823888886','是','');
/*!40000 ALTER TABLE `jifenduihuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jifenshangpin`
--

DROP TABLE IF EXISTS `jifenshangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jifenshangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinbianhao` varchar(200) DEFAULT NULL COMMENT '商品编号',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `shangpinleixing` varchar(200) DEFAULT NULL COMMENT '商品类型',
  `shangpinguige` varchar(200) DEFAULT NULL COMMENT '商品规格',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `suoxujifen` int(11) DEFAULT NULL COMMENT '所需积分',
  `pinpai` varchar(200) DEFAULT NULL COMMENT '品牌',
  `shangpinjieshao` longtext COMMENT '商品介绍',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shangpinbianhao` (`shangpinbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='积分商品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jifenshangpin`
--

LOCK TABLES `jifenshangpin` WRITE;
/*!40000 ALTER TABLE `jifenshangpin` DISABLE KEYS */;
INSERT INTO `jifenshangpin` VALUES (111,'2021-02-05 01:40:59','商品编号1','商品名称1','商品类型1','商品规格1','http://localhost:8080/ssml4g8w/upload/jifenshangpin_tupian1.jpg',1,'品牌1','商品介绍1',1,1),(112,'2021-02-05 01:40:59','商品编号2','商品名称2','商品类型2','商品规格2','http://localhost:8080/ssml4g8w/upload/jifenshangpin_tupian2.jpg',2,'品牌2','商品介绍2',2,2),(113,'2021-02-05 01:40:59','商品编号3','商品名称3','商品类型3','商品规格3','http://localhost:8080/ssml4g8w/upload/jifenshangpin_tupian3.jpg',3,'品牌3','商品介绍3',3,3),(114,'2021-02-05 01:40:59','商品编号4','商品名称4','商品类型4','商品规格4','http://localhost:8080/ssml4g8w/upload/jifenshangpin_tupian4.jpg',4,'品牌4','商品介绍4',4,4),(115,'2021-02-05 01:40:59','商品编号5','商品名称5','商品类型5','商品规格5','http://localhost:8080/ssml4g8w/upload/jifenshangpin_tupian5.jpg',5,'品牌5','商品介绍5',5,5),(116,'2021-02-05 01:40:59','商品编号6','商品名称6','商品类型6','商品规格6','http://localhost:8080/ssml4g8w/upload/jifenshangpin_tupian6.jpg',6,'品牌6','商品介绍6',6,6);
/*!40000 ALTER TABLE `jifenshangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kechengfenlei`
--

DROP TABLE IF EXISTS `kechengfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kechengfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengleibie` varchar(200) DEFAULT NULL COMMENT '课程类别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='课程分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kechengfenlei`
--

LOCK TABLES `kechengfenlei` WRITE;
/*!40000 ALTER TABLE `kechengfenlei` DISABLE KEYS */;
INSERT INTO `kechengfenlei` VALUES (21,'2021-02-05 01:40:58','课程类别1'),(22,'2021-02-05 01:40:58','课程类别2'),(23,'2021-02-05 01:40:58','课程类别3'),(24,'2021-02-05 01:40:58','课程类别4'),(25,'2021-02-05 01:40:58','课程类别5'),(26,'2021-02-05 01:40:58','课程类别6');
/*!40000 ALTER TABLE `kechengfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kechengxinxi`
--

DROP TABLE IF EXISTS `kechengxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kechengxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengmingcheng` varchar(200) DEFAULT NULL COMMENT '课程名称',
  `kechengbianhao` varchar(200) DEFAULT NULL COMMENT '课程编号',
  `kechengleibie` varchar(200) DEFAULT NULL COMMENT '课程类别',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `kechengshipin` varchar(200) DEFAULT NULL COMMENT '课程视频',
  `kechengneirong` longtext COMMENT '课程内容',
  `xiangqing` longtext COMMENT '详情',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`),
  UNIQUE KEY `kechengbianhao` (`kechengbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='课程信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kechengxinxi`
--

LOCK TABLES `kechengxinxi` WRITE;
/*!40000 ALTER TABLE `kechengxinxi` DISABLE KEYS */;
INSERT INTO `kechengxinxi` VALUES (31,'2021-02-05 01:40:58','课程名称1','课程编号1','课程类别1','http://localhost:8080/ssml4g8w/upload/kechengxinxi_tupian1.jpg','','课程内容1','详情1',1,1),(32,'2021-02-05 01:40:58','课程名称2','课程编号2','课程类别2','http://localhost:8080/ssml4g8w/upload/kechengxinxi_tupian2.jpg','','课程内容2','详情2',2,2),(33,'2021-02-05 01:40:58','课程名称3','课程编号3','课程类别3','http://localhost:8080/ssml4g8w/upload/kechengxinxi_tupian3.jpg','','课程内容3','详情3',3,3),(34,'2021-02-05 01:40:58','课程名称4','课程编号4','课程类别4','http://localhost:8080/ssml4g8w/upload/kechengxinxi_tupian4.jpg','','课程内容4','详情4',4,4),(35,'2021-02-05 01:40:58','课程名称5','课程编号5','课程类别5','http://localhost:8080/ssml4g8w/upload/kechengxinxi_tupian5.jpg','','课程内容5','详情5',5,5),(36,'2021-02-05 01:40:58','课程名称6','课程编号6','课程类别6','http://localhost:8080/ssml4g8w/upload/kechengxinxi_tupian6.jpg','','课程内容6','详情6',6,6);
/*!40000 ALTER TABLE `kechengxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '留言内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=197 DEFAULT CHARSET=utf8 COMMENT='留言板';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (191,'2021-02-05 01:40:59',1,'用户名1','留言内容1','回复内容1'),(192,'2021-02-05 01:40:59',2,'用户名2','留言内容2','回复内容2'),(193,'2021-02-05 01:40:59',3,'用户名3','留言内容3','回复内容3'),(194,'2021-02-05 01:40:59',4,'用户名4','留言内容4','回复内容4'),(195,'2021-02-05 01:40:59',5,'用户名5','留言内容5','回复内容5'),(196,'2021-02-05 01:40:59',6,'用户名6','留言内容6','回复内容6');
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=187 DEFAULT CHARSET=utf8 COMMENT='系统公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (181,'2021-02-05 01:40:59','标题1','简介1','http://localhost:8080/ssml4g8w/upload/news_picture1.jpg','内容1'),(182,'2021-02-05 01:40:59','标题2','简介2','http://localhost:8080/ssml4g8w/upload/news_picture2.jpg','内容2'),(183,'2021-02-05 01:40:59','标题3','简介3','http://localhost:8080/ssml4g8w/upload/news_picture3.jpg','内容3'),(184,'2021-02-05 01:40:59','标题4','简介4','http://localhost:8080/ssml4g8w/upload/news_picture4.jpg','内容4'),(185,'2021-02-05 01:40:59','标题5','简介5','http://localhost:8080/ssml4g8w/upload/news_picture5.jpg','内容5'),(186,'2021-02-05 01:40:59','标题6','简介6','http://localhost:8080/ssml4g8w/upload/news_picture6.jpg','内容6');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shangpinfenlei`
--

DROP TABLE IF EXISTS `shangpinfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shangpinfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinleixing` varchar(200) DEFAULT NULL COMMENT '商品类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='商品分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shangpinfenlei`
--

LOCK TABLES `shangpinfenlei` WRITE;
/*!40000 ALTER TABLE `shangpinfenlei` DISABLE KEYS */;
INSERT INTO `shangpinfenlei` VALUES (101,'2021-02-05 01:40:59','商品类型1'),(102,'2021-02-05 01:40:59','商品类型2'),(103,'2021-02-05 01:40:59','商品类型3'),(104,'2021-02-05 01:40:59','商品类型4'),(105,'2021-02-05 01:40:59','商品类型5'),(106,'2021-02-05 01:40:59','商品类型6');
/*!40000 ALTER TABLE `shangpinfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-02-05 01:40:59');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `chushengriqi` date DEFAULT NULL COMMENT '出生日期',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (11,'2021-02-05 01:40:58','学生1','123456','学生姓名1','男','2021-02-05','13823888881'),(12,'2021-02-05 01:40:58','学生2','123456','学生姓名2','男','2021-02-05','13823888882'),(13,'2021-02-05 01:40:58','学生3','123456','学生姓名3','男','2021-02-05','13823888883'),(14,'2021-02-05 01:40:58','学生4','123456','学生姓名4','男','2021-02-05','13823888884'),(15,'2021-02-05 01:40:58','学生5','123456','学生姓名5','男','2021-02-05','13823888885'),(16,'2021-02-05 01:40:58','学生6','123456','学生姓名6','男','2021-02-05','13823888886');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueshengjifen`
--

DROP TABLE IF EXISTS `xueshengjifen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueshengjifen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `jifen` varchar(200) DEFAULT NULL COMMENT '积分',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='学生积分';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueshengjifen`
--

LOCK TABLES `xueshengjifen` WRITE;
/*!40000 ALTER TABLE `xueshengjifen` DISABLE KEYS */;
INSERT INTO `xueshengjifen` VALUES (71,'2021-02-05 01:40:58','学号1','学生姓名1','10000','备注1'),(72,'2021-02-05 01:40:58','学号2','学生姓名2','10000','备注2'),(73,'2021-02-05 01:40:58','学号3','学生姓名3','10000','备注3'),(74,'2021-02-05 01:40:58','学号4','学生姓名4','10000','备注4'),(75,'2021-02-05 01:40:58','学号5','学生姓名5','10000','备注5'),(76,'2021-02-05 01:40:58','学号6','学生姓名6','10000','备注6');
/*!40000 ALTER TABLE `xueshengjifen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueshengjifenkoujian`
--

DROP TABLE IF EXISTS `xueshengjifenkoujian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueshengjifenkoujian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `jifen` varchar(200) DEFAULT NULL COMMENT '积分',
  `koujianyuanyin` longtext COMMENT '扣减原因',
  `riqi` date DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='学生积分扣减';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueshengjifenkoujian`
--

LOCK TABLES `xueshengjifenkoujian` WRITE;
/*!40000 ALTER TABLE `xueshengjifenkoujian` DISABLE KEYS */;
INSERT INTO `xueshengjifenkoujian` VALUES (91,'2021-02-05 01:40:58','学号1','学生姓名1','10000','扣减原因1','2021-02-05'),(92,'2021-02-05 01:40:58','学号2','学生姓名2','10000','扣减原因2','2021-02-05'),(93,'2021-02-05 01:40:58','学号3','学生姓名3','10000','扣减原因3','2021-02-05'),(94,'2021-02-05 01:40:58','学号4','学生姓名4','10000','扣减原因4','2021-02-05'),(95,'2021-02-05 01:40:58','学号5','学生姓名5','10000','扣减原因5','2021-02-05'),(96,'2021-02-05 01:40:58','学号6','学生姓名6','10000','扣减原因6','2021-02-05');
/*!40000 ALTER TABLE `xueshengjifenkoujian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueshengjifenzengjia`
--

DROP TABLE IF EXISTS `xueshengjifenzengjia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueshengjifenzengjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `jifen` varchar(200) DEFAULT NULL COMMENT '积分',
  `zengjiayuanyin` longtext COMMENT '增加原因',
  `riqi` date DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='学生积分增加';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueshengjifenzengjia`
--

LOCK TABLES `xueshengjifenzengjia` WRITE;
/*!40000 ALTER TABLE `xueshengjifenzengjia` DISABLE KEYS */;
INSERT INTO `xueshengjifenzengjia` VALUES (81,'2021-02-05 01:40:58','学号1','学生姓名1','10000','增加原因1','2021-02-05'),(82,'2021-02-05 01:40:58','学号2','学生姓名2','10000','增加原因2','2021-02-05'),(83,'2021-02-05 01:40:58','学号3','学生姓名3','10000','增加原因3','2021-02-05'),(84,'2021-02-05 01:40:58','学号4','学生姓名4','10000','增加原因4','2021-02-05'),(85,'2021-02-05 01:40:58','学号5','学生姓名5','10000','增加原因5','2021-02-05'),(86,'2021-02-05 01:40:58','学号6','学生姓名6','10000','增加原因6','2021-02-05');
/*!40000 ALTER TABLE `xueshengjifenzengjia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ziliaofasong`
--

DROP TABLE IF EXISTS `ziliaofasong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ziliaofasong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengbianhao` varchar(200) DEFAULT NULL COMMENT '课程编号',
  `kechengmingcheng` varchar(200) DEFAULT NULL COMMENT '课程名称',
  `ziliaomingcheng` varchar(200) DEFAULT NULL COMMENT '资料名称',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `ziliaowendang` varchar(200) DEFAULT NULL COMMENT '资料文档',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='资料发送';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ziliaofasong`
--

LOCK TABLES `ziliaofasong` WRITE;
/*!40000 ALTER TABLE `ziliaofasong` DISABLE KEYS */;
INSERT INTO `ziliaofasong` VALUES (61,'2021-02-05 01:40:58','课程编号1','课程名称1','资料名称1','学号1','学生姓名1',''),(62,'2021-02-05 01:40:58','课程编号2','课程名称2','资料名称2','学号2','学生姓名2',''),(63,'2021-02-05 01:40:58','课程编号3','课程名称3','资料名称3','学号3','学生姓名3',''),(64,'2021-02-05 01:40:58','课程编号4','课程名称4','资料名称4','学号4','学生姓名4',''),(65,'2021-02-05 01:40:58','课程编号5','课程名称5','资料名称5','学号5','学生姓名5',''),(66,'2021-02-05 01:40:58','课程编号6','课程名称6','资料名称6','学号6','学生姓名6','');
/*!40000 ALTER TABLE `ziliaofasong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ziliaogoumai`
--

DROP TABLE IF EXISTS `ziliaogoumai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ziliaogoumai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengbianhao` varchar(200) DEFAULT NULL COMMENT '课程编号',
  `kechengmingcheng` varchar(200) DEFAULT NULL COMMENT '课程名称',
  `ziliaomingcheng` varchar(200) DEFAULT NULL COMMENT '资料名称',
  `jiage` varchar(200) DEFAULT NULL COMMENT '价格',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `goumairiqi` date DEFAULT NULL COMMENT '购买日期',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='资料购买';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ziliaogoumai`
--

LOCK TABLES `ziliaogoumai` WRITE;
/*!40000 ALTER TABLE `ziliaogoumai` DISABLE KEYS */;
INSERT INTO `ziliaogoumai` VALUES (51,'2021-02-05 01:40:58','课程编号1','课程名称1','资料名称1','价格1','学号1','学生姓名1','2021-02-05','是','','未支付'),(52,'2021-02-05 01:40:58','课程编号2','课程名称2','资料名称2','价格2','学号2','学生姓名2','2021-02-05','是','','未支付'),(53,'2021-02-05 01:40:58','课程编号3','课程名称3','资料名称3','价格3','学号3','学生姓名3','2021-02-05','是','','未支付'),(54,'2021-02-05 01:40:58','课程编号4','课程名称4','资料名称4','价格4','学号4','学生姓名4','2021-02-05','是','','未支付'),(55,'2021-02-05 01:40:58','课程编号5','课程名称5','资料名称5','价格5','学号5','学生姓名5','2021-02-05','是','','未支付'),(56,'2021-02-05 01:40:58','课程编号6','课程名称6','资料名称6','价格6','学号6','学生姓名6','2021-02-05','是','','未支付');
/*!40000 ALTER TABLE `ziliaogoumai` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-06  9:36:37
