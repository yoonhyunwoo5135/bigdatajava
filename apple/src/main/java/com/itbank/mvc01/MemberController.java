package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@RequestMapping("insert2")
	public void insert(MemberDTO memberDTO, memberDAO memberDAO) {
		memberDAO.insert(memberDTO);
		System.out.println("입력한 id: " + memberDTO.getId());
		System.out.println("입력한 pw: " + memberDTO.getPw());
		System.out.println("입력한 name: " + memberDTO.getName());
		System.out.println("입력한 age: " + memberDTO.getAge());
	}
	
	
}
