package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection 
{
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String url = "jdbc:mysql://localhost:3306/ETutor";
		String driverName= "com.mysql.jdbc.Driver";
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(url,"root","");
		if(con == null)
		{
			System.out.println("Something Went Wrong, Database Connection Failed.");
		}
		else
		{
			 System.out.println("Database Connected Successfully");
		}
		
		return con;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		getConnection();
	}
}
