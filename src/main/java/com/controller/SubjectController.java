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
import com.bean.Subject;
import com.service.StudentService;
import com.service.SubjectService;

/**
 * Servlet implementation class SubjectController
 */
public class SubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		SubjectService ss = new SubjectService();
		List<Subject> listOfSub = ss.findAllSubject();
		HttpSession hs = request.getSession();
		hs.setAttribute("listOfSub", listOfSub);
		response.sendRedirect("viewSubject.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
        int subid = Integer.parseInt(request.getParameter("subid"));
        String subname = request.getParameter("subname");
        Subject s = new Subject();
        s.setSubid(subid);
        s.setSubname(subname);
        SubjectService ss = new SubjectService();
        String result = ss.storeSubjectDetails(s);
        pw.print(result);
        RequestDispatcher rd = request.getRequestDispatcher("storeSubject.jsp");
        rd.include(request, response);
	}

}
