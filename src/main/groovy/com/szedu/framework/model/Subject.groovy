package com.szedu.framework.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotNull

//-----------------------------------------------------------------
//CREATE TABLE `subject` (
//	`subjectid` int(11) NOT NULL COMMENT '科目ID',
//	`subjectcode` varchar(10) NOT NULL COMMENT '科目代码 CNPS201301-2013届小学一年级语文,CNHS201402-2014届高中二年级语文',
//	`subjectname` varchar(30) NOT NULL COMMENT '科目名称',
//	`subjectlevel` char(2) DEFAULT 'HS' COMMENT '科目级别 HS-高中,MS-初中,PS-小学',
//	`subjectperiod` varchar(4) DEFAULT '2013' COMMENT '科目届别 2013-2013届,2014-2014届,2015-2015届',
//	PRIMARY KEY (`subjectid`),
//	UNIQUE KEY `subjectcode_UNIQUE` (`subjectcode`),
//	UNIQUE KEY `subjectid_UNIQUE` (`subjectid`)
//  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='科目 语文,数学,外语等';
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
