package com.jin.ex03;

import org.apache.hadoop.io.Text;

public class AirlineParser {
	private String fly;
	private String delay;
	private String tailNum;
	private int arrDelay;
	private int depDelay;
	private int distance;
	private String uniqueCarrier;
	private int month;
	private int carrierDelay;
	
	
	final static int NONDELAY = 0;
	
	private int getDigitFromStr(String str, int defalutDigit) {
		if("NA".equalsIgnoreCase(str)) return defalutDigit;
		return Integer.parseInt(str);
	}
	
	public AirlineParser() {}
	
	public AirlineParser(Text value) {
		String [] airData = value.toString().split(",");
		uniqueCarrier = airData[8];
		fly = airData[21];
	    delay= airData[24];
	    tailNum = airData[10];
	    month = Integer.parseInt(airData[1]);
	    carrierDelay = getDigitFromStr(airData[25], NONDELAY);
	    distance = Integer.parseInt(airData[18]);
	    arrDelay = getDigitFromStr(airData[14], NONDELAY);
	    arrDelay = getDigitFromStr(airData[15], NONDELAY);
	}
	
	
	
	public int getMonth() {
		return month;
	}

	public int getCarrierDelay() {
		return carrierDelay;
	}

	public int getDistance() {
		return distance;
	}

	public String getUniqueCarrier() {
		return uniqueCarrier;
	}

	public static int getNondelay() {
		return NONDELAY;
	}

	public int getArrDelay() {
		return arrDelay;
	}
	
	public int getDepDelay() {
		return depDelay;
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
