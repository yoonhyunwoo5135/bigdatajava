package com.jin.ex06;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import com.jin.ex06.AirlineParser;

public class Map01 extends Mapper<LongWritable, Text, Text, IntWritable> {

	@Override
	public void map(LongWritable key, Text value, Context output) throws IOException, InterruptedException {
		AirlineParser ap = new AirlineParser(value);
		
		if(ap.getActualElapsedTime() > 0) {
			output.write(new Text("act:" + ap.getYear()), new IntWritable(ap.getActualElapsedTime()));				
		}
		if(ap.getCrselapsedTime() > 0) {
			output.write(new Text("crse:" + ap.getYear()), new IntWritable(ap.getCrselapsedTime()));				
		}

	}

}
