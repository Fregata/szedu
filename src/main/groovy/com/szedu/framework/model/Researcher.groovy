package com.szedu.framework.model

//-----------------------------------------------------------------
//CREATE TABLE `researcher` (
//	`researcherid` int(11) NOT NULL COMMENT '教研员ID',
//	`researchername` varchar(18) NOT NULL COMMENT '教研员登录名',
//	`researcherpwd` varchar(6) NOT NULL COMMENT '教研员登录密码',
//	`researcherdirector` char(1) NOT NULL DEFAULT 'N' COMMENT '是否为教研主任 N-不是,Y-是',
//	`researchersubject` int(11) DEFAULT NULL COMMENT '外键引用到科目唯一标示符',
//	`researchersuper` varchar(45) DEFAULT NULL COMMENT '教研员的直接管理员的adminname',
//	`researchertelno` varchar(45) DEFAULT NULL COMMENT '教研员联系电话',
//	`researcheremail` varchar(45) DEFAULT NULL COMMENT '教研员邮箱地址',
//	`researcheradmin` int(11) DEFAULT NULL COMMENT '外键引用到管理员ID',
//	PRIMARY KEY (`researcherid`),
//	UNIQUE KEY `researchername_UNIQUE` (`researchername`),
//	UNIQUE KEY `researcherid_UNIQUE` (`researcherid`),
//	KEY `researchersubject_idx` (`researchersubject`),
//	KEY `researcheradmin_idx` (`researcheradmin`),
//	CONSTRAINT `researcheradmin` FOREIGN KEY (`researcheradmin`) REFERENCES `admin` (`adminid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
//	CONSTRAINT `researchersubject` FOREIGN KEY (`researchersubject`) REFERENCES `subject` (`subjectid`) ON DELETE NO ACTION ON UPDATE NO ACTION
//  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教学研究员';
//-----------------------------------------------------------------
class Researcher {

}
