package com.cg.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "transaction")

public class TransactionDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transactionId;
	private int fromCustomer;
	private int toCustomer;
	private int amount;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getFromCustomer() {
		return fromCustomer;
	}
	public void setFromCustomer(int fromCustomer) {
		this.fromCustomer = fromCustomer;
	}
	public int getToCustomer() {
		return toCustomer;
	}
	public void setToCustomer(int toCustomer) {
		this.toCustomer = toCustomer;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	 
	 
}
