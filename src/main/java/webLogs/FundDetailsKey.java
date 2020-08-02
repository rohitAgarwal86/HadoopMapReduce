package webLogs;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

public class FundDetailsKey implements WritableComparable<FundDetailsKey>{
	
	private Text fundId, deptId;
	private IntWritable adacAccount;
	public Text getFundId() {
		return fundId;
	}
	public void setFundId(Text fundId) {
		this.fundId = fundId;
	}
	public Text getDeptId() {
		return deptId;
	}
	public void setDeptId(Text deptId) {
		this.deptId = deptId;
	}
	public IntWritable getAdacAccount() {
		return adacAccount;
	}
	public void setAdacAccount(IntWritable adacAccount) {
		this.adacAccount = adacAccount;
	}
	public void readFields(DataInput in) throws IOException {
		fundId.readFields(in);
		deptId.readFields(in);
		adacAccount.readFields(in);
		
		
	}
	public void write(DataOutput out) throws IOException {
		fundId.write(out);
		deptId.write(out);
		adacAccount.write(out);
		
	}
	public int compareTo(FundDetailsKey keys) {
		if(fundId.compareTo(fundId)==0)
			return deptId.compareTo(deptId);
		else
			return fundId.compareTo(fundId);
	}
	
	@Override
	public boolean equals(Object o)
	{
		FundDetailsKey key =(FundDetailsKey)o;
		if(key.getFundId().equals(fundId) && key.getDeptId().equals(deptId) && key.getAdacAccount().get()==adacAccount.get())
			return true;
		return false;
	}
	
	@Override
	public int hashCode()
	{
		int prime=31;
		int result =prime *fundId.hashCode() + deptId.hashCode();
		
		return result;
	}
	
	
}
