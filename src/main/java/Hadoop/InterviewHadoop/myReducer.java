package Hadoop.InterviewHadoop;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class myReducer extends Reducer<Text, IntWritable, Text, IntWritable>{
	
	IntWritable outValue=new IntWritable();
	
	@Override
	public void reduce(Text inputKey,Iterable<IntWritable> value,Context context) throws IOException,InterruptedException
	{
		int sum=0;
		for(IntWritable val : value)
		{
			sum=sum+val.get();
		}
		outValue.set(sum);
		context.write(inputKey,outValue);
	}

}
