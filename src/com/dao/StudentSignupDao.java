package com.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.bean.StudentSignupBean;

public class StudentSignupDao 
{
	int i;
	public int insertStudent(StudentSignupBean studentsignupBean)
	{
		try
		{
			Connection con = DbConnection.getConnection();
			Statement stmt = con.createStatement();
			String query = "INSERT INTO `StudentSignup`(`name`, `user`, `pass`, `dob`, `country`, `mob`) VALUES ('"+studentsignupBean.getName()+"','"+studentsignupBean.getUser()+"','"+studentsignupBean.getPass()+"','"+studentsignupBean.getDob()+"','"+studentsignupBean.getCountry()+"','"+studentsignupBean.getMob()+"')";
			i = stmt.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}
}
