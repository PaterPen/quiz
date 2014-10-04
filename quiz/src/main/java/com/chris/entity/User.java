package com.chris.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.chris.entity.common.AbstractEntity;


@Entity
@Table(name = "quiz_user")
public class User extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	
	private String lastName;
	
	private String email;

	private int age;
	
	public enum Attribute {
		FIRST_NAME,
		LAST_NAME,
		AGE,
		EMAIL
	}
	
	public User() {
		
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
