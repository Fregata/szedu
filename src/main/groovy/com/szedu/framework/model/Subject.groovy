package com.szedu.framework.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotNull

//-----------------------------------------------------------------
//CREATE TABLE `subject` (
//	`subjectid` int(11) NOT NULL COMMENT '��ĿID',
//	`subjectcode` varchar(10) NOT NULL COMMENT '��Ŀ���� CNPS201301-2013��Сѧһ�꼶����,CNHS201402-2014����ж��꼶����',
//	`subjectname` varchar(30) NOT NULL COMMENT '��Ŀ����',
//	`subjectlevel` char(2) DEFAULT 'HS' COMMENT '��Ŀ���� HS-����,MS-����,PS-Сѧ',
//	`subjectperiod` varchar(4) DEFAULT '2013' COMMENT '��Ŀ��� 2013-2013��,2014-2014��,2015-2015��',
//	PRIMARY KEY (`subjectid`),
//	UNIQUE KEY `subjectcode_UNIQUE` (`subjectcode`),
//	UNIQUE KEY `subjectid_UNIQUE` (`subjectid`)
//  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ŀ ����,��ѧ,�����';
//-----------------------------------------------------------------
@Entity
class Subject {
	@Id
	@NotNull(message="subjectid is required")
	@Column(unique=true)
	int subjectid
	
	@NotNull(message="subjectcode is required")
	@Column(unique=true)
	String subjectcode
	
	@NotNull(message="subjectname is required")
	String subjectname
	
	String subjectlevel
	
	String subjectperiod
}
