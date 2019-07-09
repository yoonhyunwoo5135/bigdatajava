package com.itbank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Hi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String id;
	String pw;
	
    public Hi() {
    }

	public void init(ServletConfig config) throws ServletException {
		id = config.getInitParameter("id");
		pw = config.getInitParameter("pw");
	}

	public void destroy() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("your id:" + id);
		out.println("your pw:" + pw);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
