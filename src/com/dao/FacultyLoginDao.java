package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bean.FacultySignupBean;

public class FacultyLoginDao 
{
	public boolean loginFaculty(FacultySignupBean facultysignupBean)
	{
		try
		{
			Connection con = DbConnection.getConnection();
			Statement stmt = con.createStatement();
			String query = "SELECT  `user` and `pass` FROM `FacultySignup` where user like '"+facultysignupBean.getUser()+"' and pass like '"+facultysignupBean.getPass()+"'";
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
