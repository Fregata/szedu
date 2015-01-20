package com.szedu.framework.repository.impl

import org.springframework.stereotype.Repository

import com.szedu.framework.model.Subject
import com.szedu.framework.repository.SubjectDao

@Repository("subjectDao")
class SubjectDaoImpl extends BaseDaoImpl implements SubjectDao {

	@Override
	public Subject findSubjectByCode(String subjectCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject findSubjectById(int subjectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject findSubjectByClazz(Class clazz, int subjectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSubject(Subject subject) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeSubject(Subject subject) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeSubject(Class clazz, int subjectId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Subject> querySubject(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> querySubject(String query, Map params) {
		// TODO Auto-generated method stub
		return null;
	}

}
