package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsSelectController {
	
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("select")
	public String select(Model model, BbsDTO bbsDTO) throws Exception {		
		bbsDTO = bbsDAO.select(bbsDTO);
		model.addAttribute("bbsDTO", bbsDTO);
		
		return "bbsselect2";
	}
	
}
