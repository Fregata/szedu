package com.szedu.framework.controller.login

import javax.servlet.http.HttpServletRequest
import javax.validation.Valid

import org.apache.log4j.Logger
import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*

@Controller
class LoginController{
	final Logger log = Logger.getLogger(this.class)
	@RequestMapping("/index.html")
	String userIndex(HttpServletRequest request) {
		log.debug("root request: ${request.requestURI}")
		"index"
	}
	
	@RequestMapping("/sys.html")
	String sysIndex(HttpServletRequest request) {
		log.debug("root request: ${request.requestURI}")
		"system/sys-login"
	}
	
	@RequestMapping("/login")
	String userLogin(HttpServletRequest request) {
		log.debug("root request: ${request.requestURI}")
		"index"
	}
	
	@RequestMapping(value="/sys/login.html", method=RequestMethod.POST)
	String sysLogin(HttpServletRequest request) {
		StringBuilder result = new StringBuilder()
		String username = request.getParameter("username")
		String password = request.getParameter("password")
		if("sysadmin".equalsIgnoreCase(username)&&"sysadmin".equalsIgnoreCase(password))
			result.append("/system/workbench")
		else
			result.append("/system/sys-login")
		result.toString()
	}
	
	/*
	@RequestMapping(value="/{username}",method = RequestMethod.GET,headers =["Accept=application/json"])
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody User get(@PathVariable("username") String username){
		userService.findUser(username)
	}
	
	@RequestMapping(value="/{username}",method = RequestMethod.POST,headers =["Accept=application/json"])
	@ResponseBody User update(@PathVariable("username") String username, @RequestBody @Valid User user, BindingResult result){
		userService.updateUser(user)
	}
	
	
	User initializeDemoUser(String username,String password) {
		User user = userService.findUser(username)
		if(user) return user
		
		user = new User(username:username)
		user.password = User.hash(password)
		user.enable = "active"
	
		userService.saveUser(user)
		log.debug("CREATED ADMIN: ${user.username}")
		return user
	}
	*/
}
