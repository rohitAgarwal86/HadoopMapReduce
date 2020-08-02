package webLogs;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

public class WebLogsData implements Writable{
	
	private Text siteUrl,requestDate, timeStamp,ipAddress;
	private IntWritable requestNumber;
	
	public Text getSiteUrl() {
		return siteUrl;
	}

	public void setSiteUrl(Text siteUrl) {
		this.siteUrl = siteUrl;
	}

	public Text getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Text requestDate) {
		this.requestDate = requestDate;
	}

	public Text getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Text timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Text getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(Text ipAddress) {
		this.ipAddress = ipAddress;
	}

	public IntWritable getRequestNumber() {
		return requestNumber;
	}

	public void setRequestNumber(IntWritable requestNumber) {
		this.requestNumber = requestNumber;
	}

	public void readFields(DataInput in) throws IOException {
		requestNumber.readFields(in);
		siteUrl.readFields(in);
		requestDate.readFields(in);
		timeStamp.readFields(in);
		ipAddress.readFields(in);
		
	}

	public void write(DataOutput out) throws IOException {
		requestNumber.write(out);
		siteUrl.write(out);
		requestDate.write(out);
		timeStamp.write(out);
		ipAddress.write(out);
	}
	
	@Override
	public boolean equals(Object o)
	{
		WebLogsData data= (WebLogsData)o;
		if(data.getIpAddress().equals(ipAddress))
			return true;
		return false;
	}
	
	@Override
	public String toString()
	{
		String temp = this.ipAddress + "  " + this.timeStamp;
		return temp;
	}

		
	

}
