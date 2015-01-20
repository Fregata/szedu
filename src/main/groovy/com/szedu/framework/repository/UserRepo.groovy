package com.szedu.framework.repository

import groovy.lang.Closure;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.szedu.framework.model.App
import com.szedu.framework.model.EntityImpl
import com.szedu.framework.model.Role
import com.szedu.framework.model.User


interface UserRepo {
	
	void save(EntityImpl entity)
    List<EntityImpl> query(String query)
    EntityImpl merge(EntityImpl entity)
    EntityImpl find(String query, Map params)
    EntityImpl find(Class clazz, Long id)
    void remove(EntityImpl entity)
    void remove(Collection<EntityImpl> items)
    void remove(Class clazz, Long id)
    void doWithTryCatch(Closure c)
    void flush()
	
	
}
