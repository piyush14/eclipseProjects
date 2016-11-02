package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServelet
 */
@WebInitParam(name = "paramValue", value = "paramvalue")
public class LoginServelet extends HttpServlet {
	
	String paramValue;
	String paramValueAnnoted;

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    public void init(ServletConfig config){
    	this.paramValue = config.getInitParameter("myParam");
    	this.paramValueAnnoted = config.getInitParameter("paramValue");

//    	System.out.println(myParam);
//    	PrintWriter out  = 
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserName = request.getParameter("uname");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(UserName.equals(password)){
			out.println("<html><head><h1>Login Successful<br />"
					+ "Param Value : " + paramValue +"  "+paramValueAnnoted
					+ "</h1><head></html>");
		}
		else{
			out.println("<html><head><h1>Login not Successful<br />"
					+ "Param Value : " + paramValue +"  "+paramValueAnnoted
					+ "</h1><head></html>");
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
