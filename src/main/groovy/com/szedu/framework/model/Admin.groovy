package com.szedu.framework.model

import javax.persistence.*
import javax.validation.constraints.NotNull

import org.springframework.security.authentication.encoding.ShaPasswordEncoder

import com.fasterxml.jackson.annotation.JsonIgnore

//-----------------------------------------------------------------
//CREATE TABLE `admin` (
//	`adminid` int(11) NOT NULL COMMENT '管理员 ID',
//	`adminname` varchar(18) NOT NULL COMMENT '管理员登录名',
//	`adminpwd` varchar(6) NOT NULL COMMENT '管理员登录密码',
//	`adminlevel` char(1) NOT NULL DEFAULT 'P' COMMENT '管理员等级 P-省级,C-地市级,D-区县级,S-校级',
//	`adminsuper` varchar(18) DEFAULT NULL COMMENT '管理员的上级管理员唯一标示符',
//	`admintelno` varchar(45) DEFAULT NULL COMMENT '管理员联系电话',
//	`adminemail` varchar(45) DEFAULT NULL COMMENT '管理员邮箱地址',
//	PRIMARY KEY (`adminid`),
//	UNIQUE KEY `adminname_UNIQUE` (`adminname`),
//	UNIQUE KEY `id_UNIQUE` (`adminid`),
//	KEY `adminid_idx` (`adminsuper`)
//  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员-省级,地市级,区县级,校级';
//-----------------------------------------------------------------
@Entity
class Admin {
	
	final static LEVEL_PROVENCE = "P"
	final static LEVEL_CITY     = "C"
	final static LEVEL_DISTRICT = "D"
	final static LEVEL_SCHOOL   = "S"
	
	@Id
	@NotNull(message="adminid is required")
	@Column(unique=true)
	int adminid
	
	@NotNull(message="adminname is required")
	@Column(unique=true)
	String adminname
	
	@NotNull(message="password is required")
	String adminpwd
	
	@JsonIgnore
	@Transient
	String repwd
	
	String adminlevel
	String adminsuper
	String admintelno
	String adminemail
	
	@ManyToMany
	@JoinTable(name="app_admin")
	@JoinColumn(name="adminid",referencedColumnName="adminid")
	Set<App> apps
	
	
	static String hash(String string) {
		return new ShaPasswordEncoder().encodePassword(string,null)
	}
}
