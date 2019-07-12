package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsDeleteController {
	
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("delete")
	public String delete(BbsDTO bbsDTO) {
		try {			
			bbsDAO.delete(bbsDTO);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return "bbsdelete2";
	}
	
}
