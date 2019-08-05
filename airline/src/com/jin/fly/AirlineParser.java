package com.jin.fly;

import org.apache.hadoop.io.Text;

public class AirlineParser {
	private int	days;
	private int fly;
	
	public AirlineParser() {}
	
	public AirlineParser(Text value) {
		String [] airData = value.toString().split(",");
		days = Integer.parseInt(airData[2]);
	    fly = Integer.parseInt(airData[21]);
	}

	public int getDays() {
		return days;
	}

	public int getFly() {
		return fly;
	}
		
}
