package com.szedu.framework.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotNull

//-----------------------------------------------------------------
//CREATE TABLE `app` (
//	`appid` int(11) NOT NULL COMMENT 'ϵͳΨһ��ʾ��',
//	`appname` varchar(45) NOT NULL COMMENT 'ϵͳ����',
//	`appuri` varchar(128) NOT NULL COMMENT 'ϵͳ����',
//	`appdes` tinytext NOT NULL COMMENT 'ϵͳ����',
//	PRIMARY KEY (`appid`),
//	UNIQUE KEY `appid_UNIQUE` (`appid`),
//	UNIQUE KEY `appname_UNIQUE` (`appname`),
//	UNIQUE KEY `appuri_UNIQUE` (`appuri`)
//  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='����ϵͳ';
//-----------------------------------------------------------------
@Entity
class App{
	
	@Id
	@NotNull(message="appid is required")
	@Column(unique=true)
	int appid
	
	@NotNull(message="appname is required")
	@Column(unique=true)
	String appname
	
	@NotNull(message="appname is required")
	@Column(unique=true)
	String appuri
	
	String appdes
}
