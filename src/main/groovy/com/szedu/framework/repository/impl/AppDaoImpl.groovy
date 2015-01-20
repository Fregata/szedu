package com.szedu.framework.repository.impl

import org.springframework.stereotype.Repository

import com.szedu.framework.model.App
import com.szedu.framework.repository.AppDao

@Repository("appDao")
class AppDaoImpl extends BaseDaoImpl implements AppDao {

	@Override
	public App findAppById(int appId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public App findAppByName(String appName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public App findAppByClazz(Class clazz, int appId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateApp(App app) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createApp(App app) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeApp(App app) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeApp(Class clazz, int appId) {
		// TODO Auto-generated method stub

	}

}
