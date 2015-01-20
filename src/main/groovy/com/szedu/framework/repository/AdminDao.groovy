package com.szedu.framework.repository

import groovy.lang.Closure;

import com.szedu.framework.model.Admin

interface AdminDao {
	
	Admin findAdminById(int adminId)

	Admin findAdminByName(String adminName)
	
	Admin findAdminByClazz(Class clazz,int adminId)
	
	void updateAdmin(Admin admin)
	
	void createAdmin(Admin admin)
	
	void removeAdmin(Admin admin)
	
	void removeAdmin(Class clazz,int adminId)
	
}
