package Hadoop.InterviewHadoop;

import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class myMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	IntWritable outvalue=new IntWritable();
	Text outKey =new Text();
	
	@SuppressWarnings("unused")
	@Override
	protected void setup(Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		try
		{
			Path [] localfiles =context.getLocalCacheFiles();
			if(localfiles !=null && localfiles.length > 0)
			{
				
			}
		}
		catch (IOException e)
		{
			
		}
	}
	
	@Override
	public void map(LongWritable key,Text value,Context context) throws IOException, InterruptedException
	{
		String [] words =value.toString().split(",");
		for(String a : words)
		{
			outKey.set(a);
			outvalue.set(1);
			context.write(outKey, outvalue);
		}
	}

}
