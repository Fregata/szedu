package com.szedu.framework.repository.impl

import org.springframework.stereotype.Repository

import com.szedu.framework.model.Researcher
import com.szedu.framework.repository.ResearcherDao

@Repository("researcherDao")
class ResearcherDaoImpl extends BaseDaoImpl implements ResearcherDao {

	@Override
	public Researcher findResearcherByName(String researcherName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Researcher findResearcherById(int researcherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Researcher findResearcherByClazz(Class clazz, int researcherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateResearher(Researcher researcher) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeResearher(Researcher researcher) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeResearher(Class clazz, int researcherId) {
		// TODO Auto-generated method stub

	}

}
