package com.szedu.framework.repository.impl

import org.springframework.stereotype.Repository

import com.szedu.framework.model.Application
import com.szedu.framework.model.Role
import com.szedu.framework.model.User
import com.szedu.framework.repository.UserRepo
@Repository("userRepo")
class UserRepoImpl implements UserRepo {
	private Map<Long,User> userMap
	
	UserRepoImpl(){
		userMap = new HashMap<Long,User>()
		createDummyData()
	}
	
	private void createDummyData(){
		new XmlSlurper().parse(new File('src/main/resources/user.xml')).each {user -> 
			User uszr = new User(id:user.@id.toLong(),name:user.@name,password:user.@password)
			
			Set<Role> roles = new HashSet<Role>()
			user.roles.each {role ->
				roles << new Role(id:role.@id.toLong(),name:role.@name)
			}
			
			Set<Application> apps = new HashSet<Application>()
			user.apps.each {app ->
				apps << new Application(app.@id.toLong(),name:app.@name)
			}
			
			uszr.setRoles(roles)
			uszr.setApps(apps)
			
			userMap.put(uszr.id, uszr)
		}
//		for (customer in customers.corporate.customer)
//		{
//			println "${customer.@name} works for ${customer.@company}"
//		}
	}
	
	@Override
	public User getUser(Long id) {
		return userMap.get(id)
	}

	@Override
	public void createUser(User user) {
		userMap.put(user.id, user)
	}

	@Override
	public void removeUser(Long id) {
		userMap.remove(id)
	}

	@Override
	public void updateUser(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Role> getRoles(Long uid) {
		// TODO Auto-generated method stub
		return userMap.get(uid).getRoles()
	}

	@Override
	public Role getRole(Long uid, String rName) {
		// TODO Auto-generated method stub
		return userMap.get(uid).getRoles().find {r -> r.name == rName}
	}

	@Override
	public void addRole(Long uid, Role role) {
		// TODO Auto-generated method stub
		userMap.get(uid).getRoles() << role
	}

	@Override
	public void removeRole(Long uid, String rName) {
		// TODO Auto-generated method stub
		userMap.get(uid).getRoles().remove(userMap.get(uid).getRoles().find {r -> r.name == rName})
	}

	@Override
	public Set<Application> getApps(Long uid) {
		// TODO Auto-generated method stub
		return userMap.get(uid).getApps()
	}

	@Override
	public Application getApp(Long uid, String aName) {
		// TODO Auto-generated method stub
		return userMap.get(uid).getApps().find {a -> a.name == aName}
	}

	@Override
	public void addApp(Long rid, Application app) {
		// TODO Auto-generated method stub
		userMap.get(rid).getApps() << app
	}

	@Override
	public void removeApp(Long rid, String aName) {
		// TODO Auto-generated method stub
		userMap.get(rid).getApps().remove(userMap.get(uid).getApps().find {a -> a.name == aName})
	}

}
