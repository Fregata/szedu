package com.szedu.framework.controller.login

import javax.servlet.http.HttpServletRequest

import org.apache.log4j.Logger
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping(value="/")
class LoginController {
	//final Logger log = Logger.getLogger(this.class);
	
	@RequestMapping("/login")
	String index(HttpServletRequest request){
		"index"
	}
	
}
