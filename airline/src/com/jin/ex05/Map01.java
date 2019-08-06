package com.jin.ex05;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Map01 extends Mapper<LongWritable, Text, Text, IntWritable> {

	@Override
	public void map(LongWritable key, Text value, Context output) throws IOException, InterruptedException {
		AirlineParser ap = new AirlineParser(value);
		
		if(ap.getDepDelay()>0) {
			output.write(new Text("dep:"+ap.getUniqueCarrier()), new IntWritable(1));				
		}
		if(ap.getArrDelay()>0) {
			output.write(new Text("arr:"+ap.getUniqueCarrier()), new IntWritable(1));				
		}

	}

}
