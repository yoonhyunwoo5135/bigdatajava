package com.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Signin extends HttpServlet {
	private static final long serialVersionUID = 1L;  
	String adminId;
	
    public Signin() {
    }

	public void init(ServletConfig config) throws ServletException {
		adminId = config.getInitParameter("adminId");
		System.out.println("adminId: " + adminId);
		System.out.println("서블릿 시작");
	}

	public void destroy() {
		System.out.println("서블릿 종료");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("회원가입한 아이디: " + id);
		out.println("회원가입한 패스워드: " + pw);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
