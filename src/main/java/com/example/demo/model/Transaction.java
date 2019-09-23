package com.example.demo.model;

public class Transaction {

	String from;
	String to;
	String timestamp;
	int amount;
	
	public Transaction(String from, String to, String timestamp, int amount) {
		super();
		this.from = from;
		this.to = to;
		this.timestamp = timestamp;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [from=" + from + ", to=" + to + ", timestamp=" + timestamp + ", amount=" + amount + "]";
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
