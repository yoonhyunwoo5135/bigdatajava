package com.member;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextStartEnd implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("bigbig18프로젝트 종료.");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("bigbig18프로젝트 시작.");
	}

}
