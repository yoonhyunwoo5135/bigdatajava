package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("loginCheck")
	public String login2(String id, String pw) {
		String sId = "root";
		String sPw = "1234";
		if(sId.equals(id) && sPw.equals(pw)){
			return "loginOK";
		}
		else{
			return "loginNot";			
		}
	}
	
	@RequestMapping("memberDetail")
	public void detail() {
		System.out.println("DAO의 DB연동 처리");
		System.out.println("상세 정보 받아옴.");
		System.out.println("views 아래로 결과를 넘김.");
	}
	@RequestMapping("deleteMember")
	public void delete() {
		System.out.println("DAO의 DB연동 처리");
		System.out.println("삭제 요청");
		System.out.println("views 아래로 결과를 넘김.");
	}
	
}
