package com.szedu.framework.repository.impl

import javax.persistence.EntityManager
import javax.persistence.NoResultException
import javax.persistence.Query

import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

import com.szedu.framework.model.Admin
import com.szedu.framework.repository.UserDao

@Repository("userDao")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
class UserDaoImpl extends BaseDaoImpl implements UserDao {

	@Transactional(propagation=Propagation.SUPPORTS,readOnly = true)
	public List<Admin> listAdmin(String query) {
		Query q = em.createQuery(query)
		q.getResultList()
	}

	@Transactional(propagation=Propagation.SUPPORTS,readOnly = true)
	public Admin findAdminByQuery(String query, Map params) {
		try {
            Query q = em.createQuery(query)
            for(Map.Entry e : params.entrySet()) {
                q.setParameter(e.key,e.value)
            }
            return q.getSingleResult()
        } catch(NoResultException ne) {
            return null
        }
	}
	
	@Transactional(propagation=Propagation.SUPPORTS,readOnly = true)
	public Admin findAdmin(Class clazz, int adminId) {
		em.find(clazz, adminId);
	}

	@Transactional(propagation=Propagation.SUPPORTS,readOnly = true)
	public void updateAdmin(Admin admin) {
		em.merge(admin);
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly = false)
	public void createAdmin(Admin admin) {
		em.persist(admin);
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly = false)
	public void deleteAdmin(Class clazz, int adminId) {
		Admin admin = em.find(clazz, adminId);
		em.remove(admin)
	}


}
