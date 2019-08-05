package com.jin.delay;

import org.apache.hadoop.io.Text;

public class AirlineParser {
	private String fly;
	private String delay;
	private String tailNum;
	
	public AirlineParser() {}
	
	public AirlineParser(Text value) {
		String [] airData = value.toString().split(",");
		fly = airData[21];
	    delay= airData[24];
	    tailNum = airData[10];
	}

	public String getTailNum() {
		return tailNum;
	}

	public String getFly() {
		return fly;
	}

	public String getDelay() {
		return delay;
	}
	
}
