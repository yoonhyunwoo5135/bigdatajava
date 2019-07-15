package com.itbank.mvc00;

public class CookManager{
	ICook i = null;
	
	public CookManager() {
		
	}
	public CookManager(ICook cook) {
		i = cook;
	}
	public void orderRice() {
		i.makeRice();
	}
	
	public void orderSoup() {
		i.makeSoup();
	}
}
