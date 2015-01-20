package com.szedu.framework.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Transient
import javax.validation.constraints.NotNull

import org.springframework.security.authentication.encoding.ShaPasswordEncoder

import com.fasterxml.jackson.annotation.JsonIgnore

@Entity(name="users")
class User extends EntityImpl {
	final static String ACTIVE = "ACTIVE"
	final static String LOCK = "LOCK"
	
	@NotNull(message="Username is required")
	@Column(unique=true)
	String username
	
	@NotNull(message="Password is required")
	String password
	
	@JsonIgnore
	@Transient
	String confPassword
	String enable
	
	static String hash(String string) {
		return new ShaPasswordEncoder().encodePassword(string,null)
	}
}