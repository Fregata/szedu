package com.szedu.framework.repository.impl

import javax.persistence.Query

import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

import com.szedu.framework.exception.InputException
import com.szedu.framework.model.App
import com.szedu.framework.repository.AppDao

@Repository("appDao")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
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
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public App findAppByClazz(Class clazz, int appId) {
		em.find(clazz, appId)
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly = false)
	public void updateApp(App app) {
		em.merge(app)
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly = false)
	public void createApp(App app) {
		em.persist(app)
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly = false)
	public void removeApp(App app) {
		em.remove(app)
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly = false)
	public void removeApp(Class clazz, int appId) {
		App app = findAppByClazz(clazz, appId)
		if(app == null)
            throw new InputException("App does not exist")
		em.remove(app)
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly = true)
	public List<App> query(String query) {
		Query q = em.createQuery(query)
		q.getResultList()
	}

}
