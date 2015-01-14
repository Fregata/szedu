package com.szedu.framework.model

class User extends Entity {
	String name
	String password
	Set<Role> roles
	Set<Application> apps
	
	Role addRole(Long id, String name){
		Role role = roles.find {r -> r.name == name}
		role = role ? role : new Role(id:id, name:name);
		roles << role
		return role
	}
	
	Boolean hasRole(String name){
		Role role = roles.find {r -> r.name == name}
		role != null
	}
	
	Set<String> getRoleNames(){
		Set names
		roles.each {r -> names << r.name}
		return names
	}
	
	Application addApp(Long id, String name){
		Application app = apps.find{a -> a.name== name}
		app = app ? app : new Application(id:id, name:name)
		apps << app
		return app
	}
	
	Boolean hasApp(String name){
		Application app = apps.find {a -> a.name == name}
		app != null
	}
	
	Set<String> getAppNames(){
		Set names
		apps.each {a -> names << a.name}
		return names
	}
		
}
