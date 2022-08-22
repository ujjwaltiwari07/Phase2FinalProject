package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Login;
import com.service.LoginService;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		
		Login ll = new Login();
		ll.setEmail(email);
		ll.setPassword(password);
		HttpSession hs = request.getSession();
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		
		LoginService ls = new LoginService();
		String res = ls.checkLoginDetails(ll);
		if(res.equals("Success")) {
			hs.setAttribute("obj", email);
			response.sendRedirect("home.jsp");
		}
		else {
			out.print("<font style='color:red'>Failure, Try Again!</font>");
			rd.include(request, response);
		}
	}

}
