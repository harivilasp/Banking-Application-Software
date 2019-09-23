package com.example.demo.model;

import org.springframework.stereotype.Component;

public class User {
	String name;
	String email;
	String accno;
	Long mobno;
	String address;
	Long ifsc;
	Long balance;
	
	
	public User(String name, String email, String accno, Long mobno, String address, Long ifsc, Long balance) {
		super();
		this.name = name;
		this.email = email;
		this.accno = accno;
		this.mobno = mobno;
		this.address = address;
		this.ifsc = ifsc;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	
	public String getAccno() {
		return accno;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public Long getMobno() {
		return mobno;
	}
	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getIfsc() {
		return ifsc;
	}
	public void setIfsc(Long ifsc) {
		this.ifsc = ifsc;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", accno=" + accno + ", mobno=" + mobno + ", address="
				+ address + ", ifsc=" + ifsc + ", balance=" + balance + "]";
	}
	
	
}
