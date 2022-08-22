package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ClassList;
import com.service.ClassService;

/**
 * Servlet implementation class ClassReport
 */
public class ClassReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassReport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		int cid = Integer.parseInt(request.getParameter("cid"));
		ClassList s = new ClassList();
        s.setCid(cid);
        ClassService ss = new ClassService();
        List<Object[]> Details = ss.getClassReport(cid);
		out.print("<table border=1>");
		out.print("<table border=1>");
		out.print("<tr><th>Class Section</th><th>Class ID</th><th>Student ID</th><th>Student Name</th><th>Student Age</th></tr>");
		Iterator<Object[]> li =Details.iterator();
		while(li.hasNext()) {
			Object obj[] = li.next();
			out.print("<tr><td>"+obj[0]+"</td><td>"+obj[1]+"</td><td>"+obj[2]+"</td><td>"+obj[3]+"</td><td>"+obj[4]+"</td></tr>");
		}
		out.print("</table>");
		out.print("<br>");
		out.print("<a href='Teacher_ClassDetails'>View Teacher And Class Details</a><br>");
		out.print("<a href='home.jsp'>Go To Main Page!</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
