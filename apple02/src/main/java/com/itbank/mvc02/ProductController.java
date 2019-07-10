package com.itbank.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	
	@RequestMapping("insert")
	public String insert(ProductDTO productDTO, ProductDAO productDAO) {
		productDAO.insert(productDTO);
		return "confirm";
	}
	@RequestMapping("delete")
	public String delete(ProductDTO productDTO, ProductDAO productDAO) {
		productDAO.delete(productDTO);
		return "delete";
	}
	@RequestMapping("select")
	public String select(ProductDTO productDTO, ProductDAO productDAO) {
		productDAO.select(productDTO);
		return "search";
	}
	@RequestMapping("mileage")
	public String mileage(ProductDTO productDTO, ProductDAO productDAO) {
		productDAO.mileage(productDTO);
		return "confirm";
	}
}
