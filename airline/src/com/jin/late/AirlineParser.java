package com.jin.late;

import org.apache.hadoop.io.Text;

public class AirlineParser {
	private String airline;
	private String delay;
	
	public AirlineParser() {}
	
	public AirlineParser(Text value) {
		String [] airData = value.toString().split(",");
		airline = airData[8];
	    delay= airData[24];
	}

	public String getAirline() {
		return airline;
	}

	public String getDelay() {
		return delay;
	}

	
}
