package Hadoop.InterviewHadoop;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class customKey implements WritableComparable<customKey> {

	private String fundId;
	private String deptId;
	private String adacAccountNumber;

	public String getFundId() {
		return fundId;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getAdacAccountNumber() {
		return adacAccountNumber;
	}

	public void setAdacAccountNumber(String adacAccountNumber) {
		this.adacAccountNumber = adacAccountNumber;
	}

	public void readFields(DataInput in) throws IOException {
		this.fundId = in.readUTF();
		this.deptId = in.readUTF();
		this.adacAccountNumber = in.readUTF();

	}

	public void write(DataOutput out) throws IOException {
		out.writeUTF(fundId);
		out.writeUTF(deptId);
		out.writeUTF(adacAccountNumber);

	}

	public int compareTo(customKey cust) {

		int value = 0;
		if (this.toString().equalsIgnoreCase(cust.toString()))
			value = 1;
		else
			value = 0;
		return value;
	}

	public String toString() {
		String temp = this.fundId + this.deptId + this.adacAccountNumber;
		return temp;
	}

}
