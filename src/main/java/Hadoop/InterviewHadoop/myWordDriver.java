package Hadoop.InterviewHadoop;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.filecache.DistributedCache;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class myWordDriver {
	
	public static void main (String [] args)throws IOException,InterruptedException,ClassNotFoundException
	{
		Configuration conf = new Configuration();
		Job job =Job.getInstance(conf);
		
		job.setJarByClass(myWordDriver.class);
		job.setMapperClass(myMapper.class);
		job.setReducerClass(myReducer.class);
		
		job.addCacheFile(new Path(args[2]).toUri());
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputKeyClass(IntWritable.class);
		
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		job.waitForCompletion(true);
		
	}

}
