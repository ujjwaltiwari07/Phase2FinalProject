package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.ClassService;
import com.service.SubjectService;

/**
 * Servlet implementation class Teacher_ClassDetails
 */
public class Teacher_ClassDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teacher_ClassDetails() {
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
		ClassService ps = new ClassService();
		List<Object[]> Details = ps.getClassTeacher();
		out.print("<h2>Teacher and Class Details</h2>");
		out.print("<table border=1>");
		out.print("<tr><th>Teacher Name</th><th>Class Name</th><th>Class ID</th></tr>");
		Iterator<Object[]> li =Details.iterator();
		while(li.hasNext()) {
			Object obj[] = li.next();
			out.print("<tr><td>"+obj[0]+"</td><td>"+obj[1]+"</td><td>"+obj[2]+"</td></tr>");
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
