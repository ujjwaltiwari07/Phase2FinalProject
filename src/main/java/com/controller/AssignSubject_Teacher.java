package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ClassList;
import com.bean.Subject;
import com.bean.Teacher;
import com.service.ClassService;
import com.service.SubjectService;

/**
 * Servlet implementation class AssignSubject_Teacher
 */
public class AssignSubject_Teacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignSubject_Teacher() {
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
		int subid = Integer.parseInt(request.getParameter("subid"));
		
		Subject pr = new Subject();
		pr.setSubid(subid);
		pr.setTsid(tid);
		
		SubjectService ps = new SubjectService();
		String result = ps.updateSubject(pr);
		out.print(result);
		RequestDispatcher rd = request.getRequestDispatcher("Assignsub_tcr.jsp");
		rd.include(request, response);
	}

}
