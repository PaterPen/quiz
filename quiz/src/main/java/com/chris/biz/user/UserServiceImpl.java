package com.chris.biz.user;

import java.util.HashMap;

import com.chris.dao.UserDao;
import com.chris.entity.User;
import com.chris.entity.User.Attribute;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDao();
	
	public User createUser(HashMap<User.Attribute, String> userData) {
		User u = new User();
		u.setAge(Integer.parseInt(userData.get(Attribute.AGE)));
		u.setEmail(userData.get(Attribute.EMAIL));
		u.setFirstName(userData.get(Attribute.FIRST_NAME));
		u.setLastName(userData.get(Attribute.LAST_NAME));
		
 		userDao.persist(u);
		
		return u;
	}

	public String deleteUser(long userId) {
		User u = userDao.load(userId);
		if (u != null) {
			userDao.remove(u);
			return "User deleted successfully";
		} else {
			return "User " + userId + " could not be found,";
		}
	}
}
