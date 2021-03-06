package com.jin.late;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

import com.jin.late.AirlineParser;

public class Map01 extends MapReduceBase
implements Mapper<LongWritable, Text, Text, IntWritable>{

	@Override
	public void map(LongWritable key, Text value, 
			OutputCollector<Text, IntWritable> output, Reporter arg3)
			throws IOException {
		
		AirlineParser ap = new AirlineParser(value);
		if(!ap.getDelay().equals("0") && !ap.getDelay().equals("NA")) {
			
			output.collect(new Text(ap.getAirline()), new IntWritable(1));
		}
	}

}
