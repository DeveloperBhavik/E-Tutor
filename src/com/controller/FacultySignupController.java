package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.FacultySignupBean;
import com.dao.FacultySignupDao;

public class FacultySignupController extends HttpServlet
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
		String degree = request.getParameter("degree");
		String subject = request.getParameter("subject");
		String time = request.getParameter("time");
		
		FacultySignupBean facultysignupBean = new FacultySignupBean();
		facultysignupBean.setName(name);
		facultysignupBean.setUser(user);
		facultysignupBean.setPass(pass);
		facultysignupBean.setDob(dob);
		facultysignupBean.setCountry(country);
		facultysignupBean.setMob(mobile);
		facultysignupBean.setDegree(degree);
		facultysignupBean.setSubject(subject);
		facultysignupBean.setTime(time);
		
		RequestDispatcher rd = null;
		
		FacultySignupDao facultysignupDao = new FacultySignupDao();
		if(facultysignupDao.insertFaculty(facultysignupBean)==0)
		{
			System.out.println("Insertion Failed");
		}
		else
		{
			rd = request.getRequestDispatcher("facultylogin.jsp");
			rd.forward(request, response);
		}
	}
	public void destroy()
	{
		
	}
	
}
