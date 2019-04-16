package com.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.bean.FacultySignupBean;

public class FacultySignupDao 
{
	int i;
	public int insertFaculty(FacultySignupBean facultysignupBean)
	{
		try
		{
			Connection con = DbConnection.getConnection();
			Statement stmt = con.createStatement();
			String query = "INSERT INTO `FacultySignup`(`name`, `user`, `pass`, `dob`, `country`, `mob`, `degree`, `subject`, `time`) VALUES ('"+facultysignupBean.getName()+"','"+facultysignupBean.getUser()+"','"+facultysignupBean.getPass()+"','"+facultysignupBean.getDob()+"','"+facultysignupBean.getCountry()+"','"+facultysignupBean.getMob()+"','"+facultysignupBean.getDegree()+"','"+facultysignupBean.getSubject()+"','"+facultysignupBean.getTime()+"')";
			i = stmt.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}
}
