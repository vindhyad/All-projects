package com.cg.bankapplication.beans;

public class TransactionDetails {
 private long fromAccountNo;
 private long toAccountNo;
 private double amount;
public long getFromAccountNo() {
	return fromAccountNo;
}
public void setFromAccountNo(long fromAccountNo) {
	this.fromAccountNo = fromAccountNo;
}
public long getToAccountNo() {
	return toAccountNo;
}
public void setToAccountNo(long toAccountNo) {
	this.toAccountNo = toAccountNo;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
}
