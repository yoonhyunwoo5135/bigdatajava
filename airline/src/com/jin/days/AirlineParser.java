package com.jin.days;

import org.apache.hadoop.io.Text;

public class AirlineParser {
	private int year;
	private int month;
	private int day;
	
	public AirlineParser() {}
	
	public AirlineParser(Text value) {
		String [] airData = value.toString().split(",");
		year = Integer.parseInt(airData[0]);
	    month = Integer.parseInt(airData[1]);
	    day = Integer.parseInt(airData[3]);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
		
}
