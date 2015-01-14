package com.szedu.framework.repository

import com.szedu.framework.model.Application
import com.szedu.framework.model.Role
import com.szedu.framework.model.User


interface UserRepo {
	
	User getUser(Long id)
	void createUser(User user)
	void removeUser(Long id)
	void updateUser(Long id)
	
	Set<Role> getRoles(Long uid)
	Role getRole(Long uid,String rName)
	void addRole(Long uid,Role role)
	void removeRole(Long uid,String rName)
	
	Set<Application> getApps(Long uid)
	Application getApp(Long uid,String aName)
	void addApp(Long rid, Application app)
	void removeApp(Long rid,String aName)
	
	
}
