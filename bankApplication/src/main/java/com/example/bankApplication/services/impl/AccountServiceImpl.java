package com.example.bankApplication.services.impl;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.bankApplication.dto.AccountDto;
import com.example.bankApplication.entities.Account;
import com.example.bankApplication.mappers.AccountMapper;
import com.example.bankApplication.repositories.AccountRepository;
import com.example.bankApplication.services.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	private AccountRepository accountRepository;
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		// TODO Auto-generated constructor stub
		this.accountRepository = accountRepository;
		
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		// TODO Auto-generated method stub
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		
		return AccountMapper.mapToAccountDto(savedAccount);
		
	}

	@Override
	public AccountDto getAccountById(Long accountNumber) {
		// TODO Auto-generated method stub
		Account account = accountRepository
				.findById(accountNumber)
				.orElseThrow(() -> new RuntimeException("Account does not exist"));
		
		return AccountMapper.mapToAccountDto(account);
	}

	@Override
	public AccountDto deposit(Long accountNumber, Float amount) {
		// TODO Auto-generated method stub
		Account account = accountRepository
				.findById(accountNumber)
				.orElseThrow(() -> new RuntimeException("Account does not exist"));
		
		Float total = account.getBalance() + amount;
		account.setBalance(total);
		Account savedAccount = accountRepository.save(account);
		
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto withdraw(Long accountNumber, Float amount) {
		// TODO Auto-generated method stub
		Account account = accountRepository
				.findById(accountNumber)
				.orElseThrow(() -> new RuntimeException("Account does not exist"));
		
		Float currentBalance = account.getBalance();
		if(currentBalance < amount)
			throw new RuntimeException( "Insufficient amount");
		Float total = currentBalance - amount;
		account.setBalance(total);
		Account savedAccount = accountRepository.save(account);
		
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public List<AccountDto> getAllAccounts() {
		// TODO Auto-generated method stub
		List<Account> accounts = accountRepository.findAll();
		
		Stream<Account> mapToAccountDtoStream = accounts.stream();
		
		List<AccountDto> accountDtos = mapToAccountDtoStream
				.map(AccountMapper::mapToAccountDto)
				.collect(Collectors.toList());
		
		
		return accountDtos;
	}

	@Override
	public void deleteAccount(Long accountNumber) {
		// TODO Auto-generated method stub
		Account account = accountRepository
				.findById(accountNumber)
				.orElseThrow(() -> new RuntimeException("Account does not exist"));
		
		accountRepository.deleteById(accountNumber);
		
		
		
	}

	@Override
	public List<AccountDto> getAccountsByAccountType(String accountType) {
		// TODO Auto-generated method stub
		
		List<Account> accounts = accountRepository.findByAccountType(accountType);
		
		Stream<Account> stream = accounts.stream();
		
		List<AccountDto> accountDtos = stream
				.map(AccountMapper::mapToAccountDto)
				.collect(Collectors.toList());
		
		return accountDtos;
	}
	
	
	
}
