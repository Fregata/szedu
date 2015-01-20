package com.szedu.framework.repository

import groovy.lang.Closure;

import com.szedu.framework.model.Researcher

interface ResearcherDao {

	Researcher findResearcherByName(String researcherName)
	
	Researcher findResearcherById(int researcherId)
	
	Researcher findResearcherByClazz(Class clazz,int researcherId)
	
	void updateResearher(Researcher researcher)
	
	void removeResearher(Researcher researcher)
	
	void removeResearher(Class clazz, int researcherId)
	
}
