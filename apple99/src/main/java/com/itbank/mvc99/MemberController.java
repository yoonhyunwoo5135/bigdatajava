package com.itbank.mvc99;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;
	
	@RequestMapping("insert.do")
	public String name(MemberDTO memberDTO) {
		dao.insert(memberDTO);
		return "memberview";
	}
}
