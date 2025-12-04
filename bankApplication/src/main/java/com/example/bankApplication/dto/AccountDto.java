package com.example.bankApplication.dto;



public class AccountDto {
	
	private Long accountNumber;
	private String accountType;
	private Float balance;
	private CustomerDto customerDto;
	
	public AccountDto() {}
	
	public AccountDto(Long accountNumber,String accountType,Float balance,CustomerDto customerDto) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.customerDto = customerDto;
	}
	
	public Long getAccountNumber() {
		// TODO Auto-generated method stub
		return this.accountNumber;
	}
	public String getAccountType() {
		// TODO Auto-generated method stub
		return this.accountType;
	}
	
	public Float getBalance() {
		return this.balance;
	}
	
	public CustomerDto getCustomerDto() {
		return this.customerDto;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "account Number = "+this.accountNumber+"\n"
				+"account Type = "+this.accountType+"\n"
				+"balance = "+this.balance+"\n"
				+customerDto;
	}
}
