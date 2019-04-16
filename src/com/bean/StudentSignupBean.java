package com.bean;

public class StudentSignupBean 
{
	private String name;
	private String user;
	private String pass;
	private String dob;
	private String country;
	private int mob;
	private int student_signup_id;
	
	public int getStudent_signup_id() 
	{
		return student_signup_id;
	}
	public void setStudent_signup_id(int student_signup_id) 
	{
		this.student_signup_id = student_signup_id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getUser() 
	{
		return user;
	}
	public void setUser(String user) 
	{
		this.user = user;
	}
	public String getPass() 
	{
		return pass;
	}
	public void setPass(String pass) 
	{
		this.pass = pass;
	}
	public String getDob() 
	{
		return dob;
	}
	public void setDob(String dob) 
	{
		this.dob = dob;
	}
	public String getCountry() 
	{
		return country;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}
	public int getMob() 
	{
		return mob;
	}
	public void setMob(int mob) 
	{
		this.mob = mob;
	}
}
