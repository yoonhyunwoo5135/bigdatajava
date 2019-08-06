package com.jin.ex04;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Map01 extends Mapper<LongWritable, Text, Text, IntWritable> {

	@Override
	public void map(LongWritable key, Text value, Context output) throws IOException, InterruptedException {
		AirlineParser ap = new AirlineParser(value);
		
		for (int i = 0; i < 12; i++) {
			if(ap.getMonth()-1 == i) {
				output.getCounter(Month.values()[i]).increment(ap.getCarrierDelay());				
			}
		}

	}

}
