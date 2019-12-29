package com.esh.j2se.jmx;

public class Student implements StudentMBean{
	private String message = "Hello I am Eshita!";
	private int age = 29;
	public String getMessage() {
		return message;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
