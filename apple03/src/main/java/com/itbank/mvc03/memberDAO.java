package com.itbank.mvc03;

public class memberDAO {
	
	public void insert(MemberDTO memberDTO) {
		System.out.println("DB연동해서 insert sql문 실행");
		System.out.println("저장된 id: " + memberDTO.getId());
		System.out.println("저장된 pw: " + memberDTO.getPw());
		System.out.println("저장된 name: " + memberDTO.getName());
		System.out.println("저장된 age: " + memberDTO.getAge());
	}
}
