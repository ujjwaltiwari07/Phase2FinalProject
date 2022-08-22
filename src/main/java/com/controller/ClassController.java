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

import com.bean.ClassList;
import com.service.ClassService;


/**
 * Servlet implementation class ClassController
 */
public class ClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ClassService ss = new ClassService();
		List<ClassList> listOfCls = ss.findAllClass();
		HttpSession hs = request.getSession();
		hs.setAttribute("listOfCls", listOfCls);
		response.sendRedirect("viewClass.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
        int cid = Integer.parseInt(request.getParameter("cid"));
        String section = request.getParameter("section");
        ClassList s = new ClassList();
        s.setCid(cid);
        s.setSection(section);
        ClassService ss = new ClassService();
        String result = ss.storeClassDetails(s);
        pw.print(result);
        RequestDispatcher rd = request.getRequestDispatcher("storeClass.jsp");
        rd.include(request, response);
	}

}
