package com.shopping;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String userName = request.getParameter("uname");
		String passWord = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

	//	System.out.println(userName);
	//	out.println("Welcome  "+userName);
		if(session.isNew()){
			
			session.setAttribute("user_name", userName);
			System.out.println(userName);
		}
		else{
			System.out.println(userName);

		}
		ServletContext servletContext = getServletContext();

		if(userName.equals(passWord)){
			RequestDispatcher requestDispatcher = servletContext
					.getRequestDispatcher("/ComputerBooksServlet");
					requestDispatcher.forward(request, response);
		}
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
