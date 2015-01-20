package com.szedu.framework.model

import javax.persistence.*
import javax.validation.constraints.NotNull

import org.springframework.security.authentication.encoding.ShaPasswordEncoder

import com.fasterxml.jackson.annotation.JsonIgnore

//-----------------------------------------------------------------
//CREATE TABLE `admin` (
//  `adminid` int(11) NOT NULL COMMENT '����Ա ID',
//  `adminname` varchar(18) NOT NULL COMMENT '����Ա��¼��',
//  `adminpwd` varchar(6) NOT NULL COMMENT '����Ա��¼����',
//  `adminlevel` char(1) NOT NULL DEFAULT 'P' COMMENT '����Ա�ȼ� P-ʡ��,C-���м�,D-���ؼ�,S-У��',
//  `adminsuper` varchar(18) DEFAULT NULL COMMENT '����Ա���ϼ�����ԱΨһ��ʾ��',
//  `admintelno` varchar(45) DEFAULT NULL COMMENT '����Ա��ϵ�绰',
//  `adminemail` varchar(45) DEFAULT NULL COMMENT '����Ա�����ַ',
//  PRIMARY KEY (`adminid`),
//  UNIQUE KEY `adminname_UNIQUE` (`adminname`),
//  UNIQUE KEY `id_UNIQUE` (`adminid`),
//  KEY `adminid_idx` (`adminsuper`)
//) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='����Ա-ʡ��,���м�,���ؼ�,У��';
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
	
	static String hash(String string) {
		return new ShaPasswordEncoder().encodePassword(string,null)
	}
}
