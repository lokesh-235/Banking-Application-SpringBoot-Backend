package com.example.bankApplication.dto;

import java.util.List;

public class CustomerDto {
    
	private Integer id;
	private String name;
	private String address;
	private String phoneNumber;
	private List<AccountDto> accounts;
	
	public CustomerDto() {}
	
	public CustomerDto(Integer id, String name, String address, String phoneNumber,List<AccountDto> accounts) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.accounts = accounts;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public List<AccountDto> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountDto> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nid = "+this.id+"\n"
				+"name = "+this.name+"\n";
	}
}
