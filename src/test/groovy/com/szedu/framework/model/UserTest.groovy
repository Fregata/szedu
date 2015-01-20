package com.szedu.framework.model

import java.util.Map;

import org.junit.Test

import static org.junit.Assert.*

import com.szedu.framework.base.BaseTestCase

class UserTest extends BaseTestCase{
	
	Map<String,String> userInfo = ["jemmy":"jemmy","terry":"terry","scott":"scott"]
	
	String find_username = "jemmy"
	String update_username = "jimmy"
	String update_password = "jimmy"
	
	@Test
	void test_add_user(){
		User u = new User(username:find_username)
		u.password = User.hash(find_username)
		u.enable = User.ACTIVE
		println u.username
		userservice.saveUser(u)
	}
	
	@Test
	void test_find_user(){
		User u = userservice.findUser(find_username)
		println u.username
		assertTrue u != null
	}
	
//	@Test
//	void test_update_user(){
//		User u = userservice.findUser(find_username)
//		assertTrue u != null
//		
//		u.setUsername(update_username)
//		u.setPassword(update_password)
//		
//		u = userservice.updateUser(u)
//		assertTrue u.username == "jimmy"
//	}
}
