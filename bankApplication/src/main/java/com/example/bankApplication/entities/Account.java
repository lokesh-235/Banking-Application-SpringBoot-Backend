package com.example.bankApplication.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountNumber;
	private String accountType;
	private Float balance;
	
	public Account() {}
	
	public Account(Long accountNumber, String accountType, Float balance) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	
	public Long getAccountNumber() {
		// TODO Auto-generated method stub
		return accountNumber;
	}
	public String getAccountType() {
		// TODO Auto-generated method stub
		return accountType;
	}
	
	public Float getBalance() {
		return balance;
	}
	
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	
	
}
