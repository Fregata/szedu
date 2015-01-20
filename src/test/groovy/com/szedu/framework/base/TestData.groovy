package com.szedu.framework.base

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import com.szedu.framework.model.User
import com.szedu.framework.repository.UserRepo
import com.szedu.framework.service.UserService

@Component
class TestData {
	
    @Autowired
    UserService userService

    User makeUser(Map userInfo) {
		userInfo.each {info ->
	        User user = userService.findUser(info.key)
	        if(user) return user
	
	        user = new User(username:info.key)
			user.setPassword(User.hash(info.value))
			user.setEnable(User.ACTIVE)
	        userService.updateUser(user)
		}
    }


}
