package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ClassList;
import com.service.ClassService;

/**
 * Servlet implementation class AssignTeacher_Class
 */
public class AssignTeacher_Class extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignTeacher_Class() {
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
		int tid = Integer.parseInt(request.getParameter("tid"));
		int cid = Integer.parseInt(request.getParameter("cid"));
		
		ClassList pr = new ClassList();
		pr.setCid(cid);
		pr.setTcid(tid);
		
		ClassService ps = new ClassService();
		String result = ps.updateClass(pr);
		out.print(result);
		RequestDispatcher rd = request.getRequestDispatcher("Assignteacher_class.jsp");
		rd.include(request, response);
	}

}
