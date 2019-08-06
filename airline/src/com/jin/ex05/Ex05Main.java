package com.jin.ex05;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class Ex05Main extends Configured implements Tool{
   public static void main(String[] args) throws Exception{
      System.exit(ToolRunner.run(new Ex05Main(), args));
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
      
      MultipleOutputs.addNamedOutput(conf, "dep", TextOutputFormat.class, Text.class, IntWritable.class);
      MultipleOutputs.addNamedOutput(conf, "arr", TextOutputFormat.class, Text.class, IntWritable.class);
      
      conf.waitForCompletion(true);
      
      
      return 0;
      
   }
   
   
}

