package com.szedu.framework.model

import javax.persistence.*
import javax.validation.constraints.NotNull

//-----------------------------------------------------------------
//CREATE TABLE `app` (
//  `appid` int(11) NOT NULL COMMENT '系统唯一标示符',
//  `appname` varchar(45) NOT NULL COMMENT '系统名称',
//  `appuri` varchar(128) NOT NULL COMMENT '系统链接',
//  `appdes` tinytext NOT NULL COMMENT '系统介绍',
//  PRIMARY KEY (`appid`),
//  UNIQUE KEY `appid_UNIQUE` (`appid`),
//  UNIQUE KEY `appname_UNIQUE` (`appname`),
//  UNIQUE KEY `appuri_UNIQUE` (`appuri`)
//) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='集成系统';
//-----------------------------------------------------------------
@Entity
class App{
	
	@Id
	@Column(unique=true)
	@NotNull(message="appid is required")
	int appid
	
	@Column(unique=true)
	@NotNull(message="appname is required")
	String appname
	
	@Column(unique=true)
	@NotNull(message="appname is required")
	String appuri
	
	String appdes
	
	@ManyToMany
	@JoinTable(name="app_admin")
	@JoinColumn(name="appid",referencedColumnName="appid")
	Set<Admin> admins
	
	@ManyToMany
	@JoinTable(name="app_researcher")
	@JoinColumn(name="appid",referencedColumnName="appid")
	Set<Admin> researchers
}
