package com.jin.ex03;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Map01 extends Mapper<LongWritable, Text, Text, IntWritable> {

	public Month type;

	@Override
	public void map(LongWritable key, Text value, Context output) throws IOException, InterruptedException {
		AirlineParser ap = new AirlineParser(value);

		if (ap.getMonth() == 1) {
			output.write(new Text("Distance All"), new IntWritable(ap.getMonth()));
			output.getCounter(Month.january).increment(ap.getCarrierDelay());
		} else if (ap.getMonth() == 2) {
			output.getCounter(Month.february).increment(ap.getCarrierDelay());
		} else if (ap.getMonth() == 3) {
			output.getCounter(Month.march).increment(ap.getCarrierDelay());
		} else if (ap.getMonth() == 4) {
			output.getCounter(Month.april).increment(ap.getCarrierDelay());
		} else if (ap.getMonth() == 5) {
			output.getCounter(Month.may).increment(ap.getCarrierDelay());
		} else if (ap.getMonth() == 6) {
			output.getCounter(Month.june).increment(ap.getCarrierDelay());
		} else if (ap.getMonth() == 7) {
			output.getCounter(Month.july).increment(ap.getCarrierDelay());
		} else if (ap.getMonth() == 8) {
			output.getCounter(Month.august).increment(ap.getCarrierDelay());
		} else if (ap.getMonth() == 9) {
			output.getCounter(Month.september).increment(ap.getCarrierDelay());
		} else if (ap.getMonth() == 10) {
			output.getCounter(Month.october).increment(ap.getCarrierDelay());
		} else if (ap.getMonth() == 11) {
			output.getCounter(Month.november).increment(ap.getCarrierDelay());
		} else if (ap.getMonth() == 12) {
			output.getCounter(Month.december).increment(ap.getCarrierDelay());
		}

	}

}
