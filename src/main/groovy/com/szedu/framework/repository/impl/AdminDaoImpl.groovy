package com.szedu.framework.repository.impl

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.persistence.PersistenceContextType
import javax.persistence.Query

import org.springframework.stereotype.Repository

import com.szedu.framework.model.Admin
import com.szedu.framework.repository.AdminDao
@Repository("adminDao")
class AdminDaoImpl implements AdminDao {

	@PersistenceContext(type=PersistenceContextType.EXTENDED)
	EntityManager em
	
	@Override
	public Admin findAdmin(String adminname) {
		Query q = em.createQuery("from Admin")
		q.getResultList().get(0)
	}

}
