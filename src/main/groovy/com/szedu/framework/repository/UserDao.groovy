package com.szedu.framework.repository

import java.util.Map;

import groovy.lang.Closure;

import com.szedu.framework.model.Admin

interface UserDao {
	
	List<Admin> listAdmin(String query)

	Admin findAdminByQuery(String query, Map params)
	
	Admin findAdmin(Class clazz,int adminId)
	
	void updateAdmin(Admin admin)
	
	void createAdmin(Admin admin)
	
	void deleteAdmin(Class clazz,int adminId)
	
}
