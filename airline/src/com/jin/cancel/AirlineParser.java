package com.jin.cancel;

import org.apache.hadoop.io.Text;

public class AirlineParser {
	private int year;
	private int month;
	private int cancel;
	
	public AirlineParser() {}
	
	public AirlineParser(Text value) {
		String [] airData = value.toString().split(",");
		year = Integer.parseInt(airData[0]);
	    month = Integer.parseInt(airData[1]);
	    cancel = Integer.parseInt(airData[21]);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getCancel() {
		return cancel;
	}

		
}
