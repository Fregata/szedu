package com.szedu.framework.repository

import com.szedu.framework.model.Admin

interface AdminDao {

	Admin findAdmin(String adminname)
	
}
