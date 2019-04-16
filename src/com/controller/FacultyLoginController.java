package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.FacultySignupBean;
import com.dao.FacultyLoginDao;

public class FacultyLoginController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public void init()
	{
		
	}
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		
		FacultySignupBean facultysignupBean = new FacultySignupBean();
		facultysignupBean.setUser(uname);
		facultysignupBean.setPass(password);
		
		RequestDispatcher rd = null;
		
		FacultyLoginDao facultyloginDao = new FacultyLoginDao();
		if(facultyloginDao.loginFaculty(facultysignupBean) == false)
		{
			rd = request.getRequestDispatcher("facultylogin.jsp");
			rd.forward(request, response);
		}
		else
		{
			rd = request.getRequestDispatcher("");
			rd.forward(request, response);
		}
		
	}
	public void destroy()
	{
		
	}

}
