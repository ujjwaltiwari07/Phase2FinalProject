package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ClassList;
import com.bean.Student;
import com.service.ClassService;
import com.service.StudentService;

/**
 * Servlet implementation class AssignClass_Student
 */
public class AssignClass_Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignClass_Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int sid = Integer.parseInt(request.getParameter("sid"));
		int cid = Integer.parseInt(request.getParameter("cid"));
		
		Student pr = new Student();
		pr.setSid(sid);
		pr.setCsid(cid);
		
		StudentService ps = new StudentService();
		String result = ps.updateStudent(pr);
		out.print(result);
		RequestDispatcher rd = request.getRequestDispatcher("Assignclass_student.jsp");
		rd.include(request, response);
	}

}
