package com.example.bankApplication.services;

import java.util.List;


import com.example.bankApplication.dto.AccountDto;
import com.example.bankApplication.dto.CustomerDto;

public interface AccountService {
	
	public AccountDto createAccount(AccountDto accountDto);
	
	AccountDto getAccountById(Long accountNumber);
	
	AccountDto deposit(Long accountNumber,Float amount);
	
	AccountDto withdraw(Long accountNumber,Float amount);
	
	List<AccountDto> getAllAccounts();
	
	void deleteAccount(Long accountNumber);
	
	List<AccountDto> getAccountsByAccountType(String accountType);
	
	
}
