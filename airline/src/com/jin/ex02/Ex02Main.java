package com.jin.ex02;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class Ex02Main extends Configured implements Tool{
   public static void main(String[] args) throws Exception{
      System.exit(ToolRunner.run(new Ex02Main(), args));
   }

   @Override
   public int run(String[] arg0) throws Exception {
      
      Job conf = Job.getInstance(getConf(), "ArrDep");
      
      //conf.setJobName("delay test");
      
      // 출력 형식 지정
      conf.setOutputKeyClass(Text.class);
      conf.setOutputValueClass(IntWritable.class);
      
      // Map Reduce
      conf.setMapperClass(Map01.class);
      conf.setReducerClass(Reduce01.class);
      
      // 입출력 형식 지정
      conf.setInputFormatClass(TextInputFormat.class);
      conf.setOutputFormatClass(TextOutputFormat.class);
      
      // 입출력 경로 지정
      FileInputFormat.setInputPaths(conf, new Path(arg0[0]));
      FileOutputFormat.setOutputPath(conf, new Path(arg0[1]));
      
      conf.waitForCompletion(true);
      
      long nonZeroCnt = conf.getCounters().findCounter(DistanceCount.nonZeroCnt).getValue();
      long ZeroCnt = conf.getCounters().findCounter(DistanceCount.ZeroCnt).getValue();
      
      System.out.println("nonZeroCnt : " + nonZeroCnt);
      System.out.println("ZeroCnt : " + ZeroCnt);
      return 0;
   }
   
   
}

