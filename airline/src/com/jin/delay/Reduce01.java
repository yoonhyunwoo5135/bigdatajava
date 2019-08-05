package com.jin.delay;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class Reduce01 extends MapReduceBase
implements Reducer<Text, IntWritable, Text, Text>{
	
	@Override
	public void reduce(Text key, Iterator<IntWritable> values, OutputCollector<Text, Text> output, Reporter arg3)
			throws IOException {
		
		int delay = 0;//지연 시간
		int cnt = 0;//총 지연 시간
		int fly = 0;//총 운항 횟수
		int delaycnt = 0;//총 지연 횟수
		double avg = 0;//평균 도착 지연 시간
		double delayrate = 0;//지연율
		
		while(values.hasNext()) {
			delay = values.next().get();
			fly++;
			
			if(delay > 0) {
				cnt += delay;
				delaycnt++;
			}
		}
		avg = (double)cnt / delaycnt;
		delayrate = (double)fly /delaycnt;
		
		
		String result = String.format("sum : %d avg : %f delayrate : %2f", cnt, avg, delayrate);
		
		output.collect(
				key,
				new Text(result)
			);
	}

}
