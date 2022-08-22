package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.SubjectService;

/**
 * Servlet implementation class Subject_TeacherDetail
 */
public class Subject_TeacherDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Subject_TeacherDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		SubjectService ps = new SubjectService();
		List<Object[]> Details = ps.getSubjectTeacher();
		out.print("<h2>Teacher and Subject Details</h2>");
		out.print("<table border=1>");
		out.print("<tr><th>Subject Name</th><th>Teacher Name</th></tr>");
		Iterator<Object[]> li =Details.iterator();
		while(li.hasNext()) {
			Object obj[] = li.next();
			out.print("<tr><td>"+obj[0]+"</td><td>"+obj[1]+"</td></tr>");
		}
		out.print("</table>");
		out.print("<br>");
		out.print("<a href='home.jsp'>Go To Main Page!</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
