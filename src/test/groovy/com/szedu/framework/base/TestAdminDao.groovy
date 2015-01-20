package com.szedu.framework.base

import org.junit.Test

import static org.junit.Assert.*

import com.szedu.framework.model.Admin

class TestAdminDao extends BaseTestCase{

	@Test
	void find_admin_test(){
		Admin a = adminDao.findAdmin("c_admin")
		assertTrue a != null
		assertTrue "c_admin" == a.adminname
	}
}
