package com.szedu.framework.model

//-----------------------------------------------------------------
//CREATE TABLE `researcher` (
//	`researcherid` int(11) NOT NULL COMMENT '����ԱID',
//	`researchername` varchar(18) NOT NULL COMMENT '����Ա��¼��',
//	`researcherpwd` varchar(6) NOT NULL COMMENT '����Ա��¼����',
//	`researcherdirector` char(1) NOT NULL DEFAULT 'N' COMMENT '�Ƿ�Ϊ�������� N-����,Y-��',
//	`researchersubject` int(11) DEFAULT NULL COMMENT '������õ���ĿΨһ��ʾ��',
//	`researchersuper` varchar(45) DEFAULT NULL COMMENT '����Ա��ֱ�ӹ���Ա��adminname',
//	`researchertelno` varchar(45) DEFAULT NULL COMMENT '����Ա��ϵ�绰',
//	`researcheremail` varchar(45) DEFAULT NULL COMMENT '����Ա�����ַ',
//	`researcheradmin` int(11) DEFAULT NULL COMMENT '������õ�����ԱID',
//	PRIMARY KEY (`researcherid`),
//	UNIQUE KEY `researchername_UNIQUE` (`researchername`),
//	UNIQUE KEY `researcherid_UNIQUE` (`researcherid`),
//	KEY `researchersubject_idx` (`researchersubject`),
//	KEY `researcheradmin_idx` (`researcheradmin`),
//	CONSTRAINT `researcheradmin` FOREIGN KEY (`researcheradmin`) REFERENCES `admin` (`adminid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
//	CONSTRAINT `researchersubject` FOREIGN KEY (`researchersubject`) REFERENCES `subject` (`subjectid`) ON DELETE NO ACTION ON UPDATE NO ACTION
//  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��ѧ�о�Ա';
//-----------------------------------------------------------------
class Researcher {

}
