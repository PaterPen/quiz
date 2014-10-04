package com.chris.dao;

import com.chris.dao.common.GenericDao;
import com.chris.entity.User;

public class UserDao extends GenericDao<User>{
	public User load(long id) {
		User u = em.find(User.class, id);
		return u;
	}
}
