package com.example.bankApplication.dto;



public class AccountDto {
	
	private Long accountNumber;
	private String accountType;
	private Float balance;
	
	public AccountDto() {}
	
	public AccountDto(Long accountNumber,String accountType,Float balance) {
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
}
