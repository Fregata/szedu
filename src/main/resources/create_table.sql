CREATE TABLE `app` (
  `appid` int(11) NOT NULL COMMENT '系统唯一标示符',
  `appname` varchar(45) NOT NULL COMMENT '系统名称',
  `appuri` varchar(128) NOT NULL COMMENT '系统链接',
  `appdes` tinytext NOT NULL COMMENT '系统介绍',
  PRIMARY KEY (`appid`),
  UNIQUE KEY `appid_UNIQUE` (`appid`),
  UNIQUE KEY `appname_UNIQUE` (`appname`),
  UNIQUE KEY `appuri_UNIQUE` (`appuri`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='集成系统';

CREATE TABLE `admin` (
  `adminid` int(11) NOT NULL COMMENT '管理员 ID',
  `adminname` varchar(18) NOT NULL COMMENT '管理员登录名',
  `adminpwd` varchar(6) NOT NULL COMMENT '管理员登录密码',
  `adminlevel` char(1) NOT NULL DEFAULT 'P' COMMENT '管理员等级 P-省级,C-地市级,D-区县级,S-校级',
  `adminsuper` varchar(18) DEFAULT NULL COMMENT '管理员的上级管理员唯一标示符',
  `admintelno` varchar(45) DEFAULT NULL COMMENT '管理员联系电话',
  `adminemail` varchar(45) DEFAULT NULL COMMENT '管理员邮箱地址',
  PRIMARY KEY (`adminid`),
  UNIQUE KEY `adminname_UNIQUE` (`adminname`),
  UNIQUE KEY `id_UNIQUE` (`adminid`),
  KEY `adminid_idx` (`adminsuper`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员-省级,地市级,区县级,校级';

CREATE TABLE `researcher` (
  `researcherid` int(11) NOT NULL COMMENT '教研员ID',
  `researchername` varchar(18) NOT NULL COMMENT '教研员登录名',
  `researcherpwd` varchar(6) NOT NULL COMMENT '教研员登录密码',
  `researcherdirector` char(1) NOT NULL DEFAULT 'N' COMMENT '是否为教研主任 N-不是,Y-是',
  `researchersubject` int(11) DEFAULT NULL COMMENT '外键引用到科目唯一标示符',
  `researchersuper` varchar(45) DEFAULT NULL COMMENT '教研员的直接管理员的adminname',
  `researchertelno` varchar(45) DEFAULT NULL COMMENT '教研员联系电话',
  `researcheremail` varchar(45) DEFAULT NULL COMMENT '教研员邮箱地址',
  `researcheradmin` int(11) DEFAULT NULL COMMENT '外键引用到管理员ID',
  PRIMARY KEY (`researcherid`),
  UNIQUE KEY `researchername_UNIQUE` (`researchername`),
  UNIQUE KEY `researcherid_UNIQUE` (`researcherid`),
  KEY `researchersubject_idx` (`researchersubject`),
  KEY `researcheradmin_idx` (`researcheradmin`),
  CONSTRAINT `researcheradmin` FOREIGN KEY (`researcheradmin`) REFERENCES `admin` (`adminid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `researchersubject` FOREIGN KEY (`researchersubject`) REFERENCES `subject` (`subjectid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教学研究员';

CREATE TABLE `subject` (
  `subjectid` int(11) NOT NULL COMMENT '科目ID',
  `subjectcode` varchar(10) NOT NULL COMMENT '科目代码 CNPS201301-2013届小学一年级语文,CNHS201402-2014届高中二年级语文',
  `subjectname` varchar(30) NOT NULL COMMENT '科目名称',
  `subjectlevel` char(2) DEFAULT 'HS' COMMENT '科目级别 HS-高中,MS-初中,PS-小学',
  `subjectperiod` varchar(4) DEFAULT '2013' COMMENT '科目届别 2013-2013届,2014-2014届,2015-2015届',
  PRIMARY KEY (`subjectid`),
  UNIQUE KEY `subjectcode_UNIQUE` (`subjectcode`),
  UNIQUE KEY `subjectid_UNIQUE` (`subjectid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='科目 语文,数学,外语等';

CREATE TABLE `app_admin` (
  `adminid` int(11) NOT NULL COMMENT '管理员唯一标示符',
  `appid` int(11) NOT NULL COMMENT '系统唯一标示符',
  PRIMARY KEY (`adminid`,`appid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子系统和管理员关联桥表';

CREATE TABLE `app_researcher` (
  `researcherid` int(11) NOT NULL COMMENT '教研员唯一标示符',
  `appid` int(11) NOT NULL COMMENT '系统唯一便是福',
  PRIMARY KEY (`appid`,`researcherid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子系统和教研员关联桥表';
