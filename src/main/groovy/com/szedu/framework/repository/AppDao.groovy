package com.szedu.framework.repository

import com.szedu.framework.model.App

interface AppDao {

	List<App> query(String query)
	
	App findAppById(int appId)
	
	App findAppByName(String appName)
	
	App findAppByClazz(Class clazz,int appId)
	
	void updateApp(App app)
	
	void createApp(App app)
	
	void removeApp(App app)
	
	void removeApp(Class clazz,int appId)
	
}
