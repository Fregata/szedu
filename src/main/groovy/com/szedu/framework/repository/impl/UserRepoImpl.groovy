package com.szedu.framework.repository.impl

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.NoResultException
import javax.persistence.PersistenceContext
import javax.persistence.PersistenceContextType
import javax.persistence.Query

import org.apache.log4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

import com.szedu.framework.model.EntityImpl
import com.szedu.framework.repository.UserRepo
@Repository("userRepo")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
class UserRepoImpl implements UserRepo {
	final Logger log = Logger.getLogger(this.class)
	
	@PersistenceContext(type=PersistenceContextType.EXTENDED)
	EntityManager em

	@Transactional(propagation=Propagation.REQUIRED,readOnly = false)
	public void save(EntityImpl entity) {
		println "dao level uername = ${entity.class}"
		if(log.isDebugEnabled()) log.debug("save: ${entity.class}")
		em.persist(entity)
	}

	@Transactional(propagation=Propagation.SUPPORTS,readOnly = true)
	public List<EntityImpl> query(String query) {
		if(log.isDebugEnabled()) log.debug("query: ${query}")
		Query q = em.createQuery(query)
		q.getResultList()
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly = false)
	public EntityImpl merge(EntityImpl entity) {
		if(log.isDebugEnabled()) log.debug("merge: ${entity.class}")
		EntityImpl entiry
		doWithTryCatch {
			entiry = em.merge(entity)
			em.flush()	
		}
		return entiry
	}

	@Transactional(propagation=Propagation.SUPPORTS,readOnly = true)
	public EntityImpl find(String query, Map params) {
		if(log.isDebugEnabled()) log.debug("find: ${query}")
		try{
			Query q = em.createQuery(query)
			params.each {e -> q.setParameter(e.key, e.value)}
			return q.getResultList()
		}catch(NoResultException ne){
			return null
		}
	}
		

	@Transactional(propagation=Propagation.SUPPORTS,readOnly = true)
	public EntityImpl find(Class clazz, Long id) {
		if(log.isDebugEnabled()) log.debug("find: class-${clazz} id-${id}")
		em.find(clazz, id)
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly = false)
	public void remove(EntityImpl entity) {
		if(log.isDebugEnabled()) log.debug("remove: class-${entity.class} id-${entity.id}")
		em.remove(entity)
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly = false)
	public void remove(Collection<EntityImpl> items) {
		items.each {item -> em.remove(item) }
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly = false)
	public void remove(Class clazz, Long id) {
		if(log.isDebugEnabled()) log.debug("find: class-${clazz} id-${id}")
		EntityImpl entity = find(clazz, id)
		entity != null ? em.remove(entity) : log.error("Item does not exist")
	}

	
	void doWithTryCatch(Closure c) {
		
		try {
			c()
		} catch (Throwable t) {
			log.error("DAO ERROR: ${t.message}",t)
		}

	}
		
	@Transactional(propagation=Propagation.REQUIRED,readOnly = false)
	void flush() {

		doWithTryCatch {
			em.flush()
		}

	}

}
