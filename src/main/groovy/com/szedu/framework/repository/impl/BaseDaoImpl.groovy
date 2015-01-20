package com.szedu.framework.repository.impl

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.persistence.PersistenceContextType

import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

class BaseDaoImpl {

	@PersistenceContext(type=PersistenceContextType.EXTENDED)
	EntityManager em
	
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
