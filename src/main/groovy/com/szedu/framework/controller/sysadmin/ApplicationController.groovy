package com.szedu.framework.controller.sysadmin

import javax.servlet.http.HttpServletRequest

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

import com.szedu.framework.controller.BaseController
import com.szedu.framework.model.App
@Controller
class ApplicationController extends BaseController {
	
	@RequestMapping(value="/sys/app/list", method=RequestMethod.POST)
	@ResponseBody List<App> listApp(HttpServletRequest request) {
		appService.listApplication()
	}
	
	@RequestMapping(value="/sys/app/find", method=RequestMethod.POST)
	@ResponseBody App findApp(HttpServletRequest request) {
		String appid = request.getParameter("appid")
		appService.findApp(App.class, appid.toInteger())
	}
	
	@RequestMapping(value="/sys/app/add", method=RequestMethod.POST)
	@ResponseBody List<App> addApp(HttpServletRequest request) {
		
		String appid = request.getParameter("appid")
		String appname = request.getParameter("appname")
		String appuri = request.getParameter("appuri")
		String appdes = request.getParameter("appdes")
		
		App app = new App(appid:appid.toInteger(),appname:appname,appuri:appuri,appdes:appdes)
		appService.addApplication(app)
		
		appService.listApplication()
	}
	
	@RequestMapping(value="/sys/app/del", method=RequestMethod.POST)
	@ResponseBody List<App> delApp(HttpServletRequest request) {
		String appid = request.getParameter("appid")
		appService.deleteApp(App.class, appid.toInteger())
		appService.listApplication();
	}
	
	@RequestMapping(value="/sys/app/put", method=RequestMethod.POST)
	@ResponseBody List<App> uptApp(HttpServletRequest request) {
		String appid = request.getParameter("appid")
		String appname = request.getParameter("appname")
		String appuri = request.getParameter("appuri")
		String appdes = request.getParameter("appdes")
		
		App app = appService.findApp(App.class, appid.toInteger())
		app.setAppname(appname)
		app.setAppuri(appuri)
		app.setAppdes(appdes)
		
		appService.updateApplication(app)
		appService.listApplication()
	}
}
