package com.jin.WordCount;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class Map01 extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> /* 앞에 두개는 입력 값, 두에 두개는 출력 값 */{

	@Override
	public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		StringTokenizer st = new StringTokenizer(
					value.toString().toLowerCase()
		);
				
		while(st.hasMoreTokens()) {
			output.collect(new Text(st.nextToken()), new IntWritable(1));
		}
		
	}
	
}

