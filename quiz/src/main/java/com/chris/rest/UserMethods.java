package com.chris.rest;
 
import java.util.HashMap;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.chris.biz.user.UserServiceImpl;
import com.chris.entity.User;
import com.chris.entity.User.Attribute;
 
@Path("/user")
public class UserMethods {
	UserServiceImpl service = new UserServiceImpl();
	
	@POST
	@Path("/create")
	public void createUserMethod(@FormParam("firstName") String firstName, @FormParam("lastName") String lastName, @FormParam("age") int age, @FormParam("email") String email) {
		
		HashMap<User.Attribute, String> userData = new HashMap<User.Attribute, String>();
		userData.put(Attribute.EMAIL, email);
		userData.put(Attribute.AGE, Integer.toString(age));
		userData.put(Attribute.FIRST_NAME, firstName);
		userData.put(Attribute.LAST_NAME, lastName);
		
		service.createUser(userData);
	}
	
	@GET
	@Path("/delete/{userId}")
	public String deleteUser(@PathParam("userId") long userId) {
		String result = service.deleteUser(userId);
		return result;
	}
 
	@GET
	@Path("/get/{userId}")
	public String getUser(@PathParam("userId") int userId) {
		return "" + userId;
	}
}