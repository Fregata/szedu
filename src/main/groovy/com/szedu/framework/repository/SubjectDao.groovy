package com.szedu.framework.repository

import groovy.lang.Closure;

import com.szedu.framework.model.Subject

interface SubjectDao {

	Subject findSubjectByCode(String subjectCode)
	
	Subject findSubjectById(int subjectId)
	
	Subject findSubjectByClazz(Class clazz,int subjectId)
	
	void updateSubject(Subject subject)
	
	void removeSubject(Subject subject)
	
	void removeSubject(Class clazz, int subjectId)
	
	List<Subject> querySubject(String query)
	
	List<Subject> querySubject(String query, Map params)
}
