package com.jin.WordCount;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class Reduce01 extends MapReduceBase
implements Reducer<Text, IntWritable, Text, IntWritable>/* 앞에 두개는 맵에서 출력한 값을 받음 그래서 형식이 같음*/{
	
	@Override
	public void reduce(Text key, Iterator<IntWritable> values,
			OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		int cnt=0;
		
		while (values.hasNext())
			cnt += values.next().get();
		
		output.collect(key, new IntWritable(cnt));
	}
	
}
