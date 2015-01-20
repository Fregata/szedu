package com.szedu.framework.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.szedu.framework.model.User
import com.szedu.framework.repository.UserRepo

@Service
class UserService {
	
	@Autowired
	UserRepo userRepo
	
	void saveUser(User user){
		println "service level uername = ${user.username}"
		userRepo.save(user)
	}
	
	User findUser(String username){
		userRepo.find("from User u where u.username = :username", [username:username])
	}
	
	User updateUser(User user){
		userRepo.merge(user)
	}
	
}
