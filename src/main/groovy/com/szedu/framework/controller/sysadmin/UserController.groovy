package com.szedu.framework.controller.sysadmin

import javax.annotation.PostConstruct
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
@RequestMapping("/user")
class UserController extends BaseController {
	
	@Autowired
	UserManageService userService
	
	@RequestMapping(method=RequestMethod.GET)
    @ResponseBody List list() {
        userService.listAdmin()
    }
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody Admin get(@PathVariable Integer id) {
		userService.findAdmin(Admin.class, id)
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody Admin create(@RequestBody @Valid Admin admin, BindingResult result) {
		if(result.hasErrors())
			throw new BindException(result)
			
		admin.adminpwd = Admin.hash(admin.adminpwd)
		admin.adminlevel = Admin.LEVEL_PROVENCE
		userService.save(admin)
		return admin
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.POST)
	@ResponseBody Admin update(@RequestBody @Valid Admin admin, @PathVariable Integer id, BindingResult result) {
		if(result.hasErrors())
			throw new BindException(result)

		userService.updateAdmin(admin)
		return admin
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	void delete(@PathVariable Integer id) {
		userService.deleteAdmin(Admin.class, id)
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
