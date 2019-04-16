package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentSignupBean;
import com.dao.StudentLoginDao;

public class StudentLoginController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public void init()
	{
		
	}
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		
		StudentSignupBean studentsignupBean = new StudentSignupBean();
		studentsignupBean.setUser(uname);
		studentsignupBean.setPass(password);
		
		RequestDispatcher rd = null;
		
		StudentLoginDao studentloginDao = new StudentLoginDao();
		if(studentloginDao.loginStudent(studentsignupBean) == false)
		{
			rd = request.getRequestDispatcher("studentlogin.jsp");
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
