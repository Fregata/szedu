package com.szedu.framework.service

import org.springframework.stereotype.Service

import com.szedu.framework.model.App

@Service
class AppManageService extends BaseService {
		
	void addApplication(App app){
		appDao.createApp(app)
	}
	
	void updateApplication(App app){
		appDao.updateApp(app)
	}
	
	List<App> listApplication(){
		String query = "from App"
		appDao.query(query)
	}
	
	void deleteApp(Class clazz, int appId){
		appDao.removeApp(clazz, appId)
	}
	
	App findApp(Class clazz, int appId){
		appDao.findAppByClazz(clazz, appId)
	}
	
}
