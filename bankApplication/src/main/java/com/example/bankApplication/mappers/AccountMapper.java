package com.example.bankApplication.mappers;

import com.example.bankApplication.dto.AccountDto;
import com.example.bankApplication.entities.Account;

public class AccountMapper {
	public static Account mapToAccount(AccountDto accountDto) {
		Account account = new Account(
				accountDto.getAccountNumber(),
				accountDto.getAccountType(),
				accountDto.getBalance()
				);
		
		return account;
	}
	
	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto = new AccountDto(
				account.getAccountNumber(),
				account.getAccountType(),
				account.getBalance()
				);
		
		return accountDto;
	}
}
