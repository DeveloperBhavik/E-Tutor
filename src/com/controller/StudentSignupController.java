package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentSignupBean;
import com.dao.StudentSignupDao;

public class StudentSignupController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public void init()
	{
		
	}
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter("name");
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String dob = request.getParameter("dob");
		String country = request.getParameter("country");
		String mob = request.getParameter("mob");
		int mobile = Integer.parseInt(mob); 
		
		StudentSignupBean studentsignupBean = new StudentSignupBean();
		studentsignupBean.setName(name);
		studentsignupBean.setUser(user);
		studentsignupBean.setPass(pass);
		studentsignupBean.setDob(dob);
		studentsignupBean.setCountry(country);
		studentsignupBean.setMob(mobile);
		
		RequestDispatcher rd = null;
		
		StudentSignupDao studentsignupDao = new StudentSignupDao();
		if(studentsignupDao.insertStudent(studentsignupBean)==0)
		{
			System.out.println("Insertion Failed");
		}
		else
		{
			rd = request.getRequestDispatcher("studentlogin.jsp");
			rd.forward(request, response);
		}
	}
	public void destroy()
	{
		
	}
}
