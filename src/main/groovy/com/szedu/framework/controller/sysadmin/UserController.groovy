package com.szedu.framework.controller.sysadmin

import javax.annotation.PostConstruct
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

import com.szedu.framework.controller.BaseController
import com.szedu.framework.model.Admin
import com.szedu.framework.service.UserManageService;
@Controller
@RequestMapping("/sys/user")
class UserController extends BaseController {
	
	@Autowired
	UserManageService userService
	
	@RequestMapping(method=RequestMethod.GET)
    @ResponseBody List<Admin> list() {
        userService.listAdmin()
    }
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody Admin get(@PathVariable String id) {
		userService.findAdmin(Admin.class, id.toInteger())
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody List<Admin> create(HttpServletRequest request) {
		
		String id = request.getParameter("id")
		String name = request.getParameter("name")
		String pwd = Admin.hash(request.getParameter("pwd"))
		String tel = request.getParameter("tel")
		String mail = request.getParameter("mail")+".com"
		String level = Admin.LEVEL_PROVENCE
		
		Admin admin = new Admin(
			adminid: id.toInteger(), 
			adminname: name, 
			adminpwd: pwd,
			adminlevel:level,
			admintelno:tel,
			adminemail:mail)
		userService.save(admin)
		userService.listAdmin()
	}
	
	@RequestMapping(value="/upt",method=RequestMethod.POST)
	@ResponseBody List<Admin> update(HttpServletRequest request) {
		String id = request.getParameter("id")
		String name = request.getParameter("name")
		String pwd = Admin.hash(request.getParameter("pwd"))
		String tel = request.getParameter("tel")
		String mail = request.getParameter("mail")+".com"
		
		Admin admin = userService.findAdmin(Admin.class, id.toInteger())
		admin.setAdminname(name)
		admin.setAdminpwd(pwd)
		admin.setAdmintelno(tel)
		admin.setAdminemail(mail)
		
		userService.updateAdmin(admin)
		userService.listAdmin()
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody List<Admin> delete(@PathVariable String id) {
		userService.deleteAdmin(Admin.class, id.toInteger())
		userService.listAdmin()
	}
	
	//@PostConstruct
	void initializeUsers() {

		List users = [[ adminid: 10001, adminname: 'Unicorn', adminpwd: '123456',adminlevel:'P',admintelno:'021-123456',adminemail:'admin@szedu.com'],
						[ adminid: 10002, adminname: 'Good Guys', adminpwd: '123456',adminlevel:'P',admintelno:'021-123456',adminemail:'admin@szedu.com'],
						[ adminid: 10003, adminname: 'Elvis', adminpwd: '123456',adminlevel:'P',admintelno:'021-123456',adminemail:'admin@szedu.com']]

		users.each {
			initializeUser(it)
		}

	}

	Admin initializeUser(Map params) {
		Admin w = userService.find("from Admin a where a.adminid = :id",[id: params.id])
		if(w)
		   return w

		w = new Admin(params)
		userService.save(w)
		return w
	}
}
