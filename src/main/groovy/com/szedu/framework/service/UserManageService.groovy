package com.szedu.framework.service

import org.springframework.stereotype.Service

import com.szedu.framework.model.Admin

@Service
class UserManageService extends BaseService {
		
	void updateAdmin(Admin admin){
		userDao.updateAdmin(admin)
	}
	
	List<Admin> listAdmin(){
		String query = "from Admin"
		userDao.listAdmin(query)
	}
	
	void deleteAdmin(Class clazz, int adminId){
		userDao.deleteAdmin(clazz, adminId)
	}
	
	Admin findAdmin(Class clazz, int adminId){
		userDao.findAdmin(clazz, adminId)
	}
	
	Admin find(String query, Map params){
		userDao.findAdminByQuery(query, params)
	}
	
	void save(Admin admin){
		userDao.createAdmin(admin)
	}
	
}
