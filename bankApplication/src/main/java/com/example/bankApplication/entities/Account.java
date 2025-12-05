package com.example.bankApplication.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountNumber;
	
	private String accountType;
	
	private Float balance;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;
	
	
	public Account() {}
	
	public Account(Long accountNumber, String accountType, Float balance, Customer customer) {
	
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.customer = customer;
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
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
}
