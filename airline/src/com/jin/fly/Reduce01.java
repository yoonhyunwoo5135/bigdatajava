package com.jin.fly;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class Reduce01 extends MapReduceBase
implements Reducer<IntWritable, IntWritable, Text, IntWritable>{
	
	private IntWritable getTotalCnt(Iterator<IntWritable> values) {
		int cnt=0;
		
		while(values.hasNext()) {
			cnt +=values.next().get();
		}
		return new IntWritable(cnt);
	}
	private Text getDays(int idx) {
		Text week = new Text();
		if(idx==0)	week.set("1~10");
		else if(idx==1)	week.set("11~20");
		else if(idx==2)	week.set("21~31");
		
		
		return week;
	}
	@Override
	public void reduce(IntWritable key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter arg3)
			throws IOException {
		
		output.collect(
				getDays(key.get()), 
				getTotalCnt(values)
			);
	}

}
