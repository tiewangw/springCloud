
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db01` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db01`;


DROP TABLE IF EXISTS `dept`;

CREATE TABLE `dept` (
  `deptno` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `dname` VARCHAR(60) DEFAULT NULL,
  `db_source` VARCHAR(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='部门表';

/*Data for the table `dept` */

INSERT  INTO `dept`(`deptno`,`dname`,`db_source`) VALUES
(1,'开发部','db01'),(2,'人事部','db01'),(3,'财务部','db01'),(4,'市场部','db01'),(5,'运维部','db01');


-------------------

CREATE DATABASE /*!32312 IF NOT EXISTS*/`db02` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db02`;

/*Table structure for table `dept` */

DROP TABLE IF EXISTS `dept`;

CREATE TABLE `dept` (
  `deptno` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `dname` VARCHAR(60) DEFAULT NULL,
  `db_source` VARCHAR(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='部门表';

/*Data for the table `dept` */

INSERT  INTO `dept`(`deptno`,`dname`,`db_source`) VALUES
(1,'开发部','db02'),(2,'人事部','db02'),(3,'财务部','db02'),(4,'市场部','db02'),(5,'运维部','db02');



------------------

CREATE DATABASE /*!32312 IF NOT EXISTS*/`db03` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db03`;

/*Table structure for table `dept` */

DROP TABLE IF EXISTS `dept`;

CREATE TABLE `dept` (
  `deptno` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `dname` VARCHAR(60) DEFAULT NULL,
  `db_source` VARCHAR(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='部门表';

/*Data for the table `dept` */

INSERT  INTO `dept`(`deptno`,`dname`,`db_source`) VALUES
(1,'开发部','db03'),(2,'人事部','db03'),(3,'财务部','db03'),(4,'市场部','db03'),(5,'运维部','db03');

