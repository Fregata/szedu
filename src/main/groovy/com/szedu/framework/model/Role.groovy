package com.szedu.framework.model

import javax.persistence.Entity
import javax.persistence.Transient
import javax.validation.constraints.NotNull

@Entity(name="authorities")
class Role extends EntityImpl {
	
	@NotNull(message="Username is required")
	String username
	
	@NotNull(message="Authority is required")
	String authority
	
	@Transient
	Set<App> apps
	
	Set<App> getAppSet(){
		if(apps == null)
			apps = new HashSet<App>();
		return apps
	}
	
	App addApp(String id, String name){
		App app = apps.find{a -> a.name== name}
		app = app ? app : new App(id:id, name:name)
		apps << app
		return app
	}
	
	Boolean hasApp(String name){
		App app = apps.find {a -> a.name == name}
		app != null
	}
	
	Set<String> getAppNames(){
		Set names
		apps.each {a -> names << a.name}
		return names
	}
}
