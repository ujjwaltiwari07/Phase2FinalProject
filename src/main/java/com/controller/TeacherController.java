package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Student;
import com.bean.Teacher;
import com.service.StudentService;
import com.service.TeacherService;

/**
 * Servlet implementation class TeacherController
 */
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		TeacherService ss = new TeacherService();
		List<Teacher> listOftcr = ss.findAllTeacher();
		HttpSession hs = request.getSession();
		hs.setAttribute("listOftcr", listOftcr);
		response.sendRedirect("viewTeacher.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
        int tid = Integer.parseInt(request.getParameter("tid"));
        String tname = request.getParameter("tname");
        Teacher s = new Teacher();
        s.setTid(tid);
        s.setTname(tname);
        TeacherService ss = new TeacherService();
        String result = ss.storeTeacherDetails(s);
        pw.print(result);
        RequestDispatcher rd = request.getRequestDispatcher("storeTeacher.jsp");
        rd.include(request, response);
	}

}
