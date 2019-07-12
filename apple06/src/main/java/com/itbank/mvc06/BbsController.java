package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("bbsInsert")
	public String insert(Model model, BbsDTO dto, BbsDAO BbsDAO) throws Exception {
		BbsDAO.insert(dto);
		return "bbs3";
	}
}
