package com.jin.ex03;

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

public class Ex03Main extends Configured implements Tool{
   public static void main(String[] args) throws Exception{
      System.exit(ToolRunner.run(new Ex03Main(), args));
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
      
      long january = conf.getCounters().findCounter(Month.january).getValue();
      long february = conf.getCounters().findCounter(Month.february).getValue();
      long march = conf.getCounters().findCounter(Month.march).getValue();
      long april = conf.getCounters().findCounter(Month.april).getValue();
      long may = conf.getCounters().findCounter(Month.may).getValue();
      long june = conf.getCounters().findCounter(Month.june).getValue();
      long july = conf.getCounters().findCounter(Month.july).getValue();
      long august = conf.getCounters().findCounter(Month.august).getValue();
      long september = conf.getCounters().findCounter(Month.september).getValue();
      long october = conf.getCounters().findCounter(Month.october).getValue();
      long november = conf.getCounters().findCounter(Month.november).getValue();
      long december = conf.getCounters().findCounter(Month.december).getValue();
      
      System.out.println("January : " + january);
      System.out.println("February : " + february);
      System.out.println("March : " + march);
      System.out.println("April : " + april);
      System.out.println("May : " + may);
      System.out.println("June : " + june);
      System.out.println("July : " + july);
      System.out.println("August : " + august);
      System.out.println("September : " + september);
      System.out.println("October : " + october);
      System.out.println("November : " + november);
      System.out.println("December : " + december);
      return 0;
   }
   
   
}

