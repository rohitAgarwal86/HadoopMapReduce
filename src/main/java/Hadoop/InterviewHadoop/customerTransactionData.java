package Hadoop.InterviewHadoop;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Writable;

public class customerTransactionData implements Writable {

	private int transactionId;
	private String transactionDate;
	private int customerID;
	private String customerName;
	private double amount;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public customerTransactionData() {

	}

	public void readFields(DataInput in) throws IOException {
		this.transactionId = in.readInt();
		this.transactionDate = in.readUTF();
		this.customerID = in.readInt();
		this.customerName = in.readUTF();
		this.amount = in.readDouble();

	}

	public void write(DataOutput out) throws IOException {
		out.writeInt(this.transactionId);
		out.writeUTF(this.transactionDate);
		out.writeInt(this.customerID);
		out.writeUTF(this.customerName);
		out.writeDouble(this.amount);
	}

	public String toString() {
		String temp = this.transactionId + this.transactionDate + this.customerID + this.customerName + this.amount;
		return temp;
	}

}
