package com.jin.stat;

import org.apache.hadoop.io.Text;

public class AirlineParser {
	private String year;
	private String month;
	
	public AirlineParser() {}
	
	public AirlineParser(Text value) {
		String [] airData = value.toString().split(",");
		year = airData[0];
	    month = airData[1];
	}
	
	
	public String getYear() {
		return year;
	}
	public String getMonth() {
		return month;
	}
		
}
