package com.itbank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String driver;

	public Hello() {
		
	}

	public void init(ServletConfig config) throws ServletException {
		driver = config.getInitParameter("driver");
	}

	public void destroy() {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("yout driver: " + driver);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
	}

}
