package com.chris.biz.user;

import java.util.HashMap;

import com.chris.entity.User;

public interface UserService {
	public User createUser(HashMap<User.Attribute, String> userData);
	
	public String deleteUser(long userId);
}
