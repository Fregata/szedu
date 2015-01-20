package com.szedu.framework.service

import org.springframework.beans.factory.annotation.Autowired

import com.szedu.framework.repository.*

class BaseService {

	@Autowired
	AdminDao adminDao
	
	@Autowired
	ResearcherDao researcherDao
	
	@Autowired
	AppDao appDao
	
	@Autowired
	SubjectDao subjectDao
	
	
}
