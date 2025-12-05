package com.example.bankApplication.mappers;

import com.example.bankApplication.dto.AccountDto;
import com.example.bankApplication.entities.Account;
import com.example.bankApplication.entities.Customer;

public class AccountMapper {
	public static Account mapToAccount(AccountDto accountDto) {
		Account account = new Account();
		
		account.setAccountType(accountDto.getAccountType());
		account.setBalance(accountDto.getBalance());
		
		return account;
	}
	
	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto = new AccountDto();
		
		accountDto.setAccountNumber(account.getAccountNumber());
		accountDto.setAccountType(account.getAccountType());
		accountDto.setBalance(account.getBalance());
		
		return accountDto;
	}
}
