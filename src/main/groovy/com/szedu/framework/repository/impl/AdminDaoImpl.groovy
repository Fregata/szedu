package com.szedu.framework.repository.impl

import groovy.lang.Closure;

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.persistence.PersistenceContextType
import javax.persistence.Query

import org.springframework.stereotype.Repository

import com.szedu.framework.model.Admin
import com.szedu.framework.repository.AdminDao

@Repository("adminDao")
class AdminDaoImpl extends BaseDaoImpl implements AdminDao {

	@Override
	public Admin findAdminByName(String adminName) {
		Query q = em.createQuery("from Admin")
		q.getResultList().get(0)
	}
	
	@Override
	public Admin findAdminById(int adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findAdminByClazz(Class clazz, int adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAdmin(Class clazz, int adminId) {
		// TODO Auto-generated method stub
		
	}

}
