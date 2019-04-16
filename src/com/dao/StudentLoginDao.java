package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bean.StudentSignupBean;

public class StudentLoginDao 
{
	public boolean loginStudent(StudentSignupBean studentsignupBean)
	{
		try
		{
			Connection con = DbConnection.getConnection();
			Statement stmt = con.createStatement();
			String query = "SELECT  `user` and `pass` FROM `StudentSignup` where user like '"+studentsignupBean.getUser()+"' and pass like '"+studentsignupBean.getPass()+"'";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
