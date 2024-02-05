package com.sathya.library;

public class Student {
	String firstname, lastname,email;
	long mobile;
	public Student(String firstname,String lastname, String email, long mobile)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile= mobile;
	}
	public String toString()
	{
		return "firstname="+firstname+"\n lastname="+lastname+"\n email="+email+"\n mobile="+mobile;
	}
}
