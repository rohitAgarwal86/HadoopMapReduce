package webLogs;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<LongWritable, Text, WebLogsData, IntWritable>{
	
	WebLogsData data = new WebLogsData();
	IntWritable one= new IntWritable(1);
	
	public void map(LongWritable key , Text value,Context context) throws IOException, InterruptedException
	{
		String logs[] =value.toString().split("|");
		Text ipAddress =new Text(logs[0]);
		Text timeStamp =new Text(logs[1]);
		
		data.setIpAddress(ipAddress);
		data.setTimeStamp(timeStamp);
		
		context.write(data, one);
	}

}
