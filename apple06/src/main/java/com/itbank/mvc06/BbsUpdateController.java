package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsUpdateController {
	
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("update")
	public String select(Model model, BbsDTO bbsDTO) throws Exception {		
		bbsDAO.update(bbsDTO);
		
		return "bbsupdate2";
	}
	
}
