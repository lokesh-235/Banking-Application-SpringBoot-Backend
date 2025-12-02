package com.example.bankApplication.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankApplication.dto.AccountDto;
import com.example.bankApplication.services.AccountService;

@RestController
@RequestMapping("/apis/accounts")
public class AccountController {
	
	private AccountService accountService;
	
	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	//add account REST API
	@PostMapping
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
		return new ResponseEntity<AccountDto>(accountService.createAccount(accountDto),HttpStatus.CREATED);
	}
	
	//get account 
	@GetMapping("/{accountNumber}")
	public ResponseEntity<AccountDto> getAccountById(@PathVariable Long accountNumber){
		
		return ResponseEntity.ok(accountService.getAccountById(accountNumber));
	}
	
	//deposit amount
	@PutMapping("/{accountNumber}/deposit")
	public ResponseEntity<AccountDto> deposit(@PathVariable Long accountNumber,@RequestBody Map<String,Float> request){
		
		Float amount = request.get("amount");
		return ResponseEntity.ok(accountService.deposit(accountNumber, amount));
		
	}
	
	//withdraw amount
	@PutMapping("/{accountNumber}/withdraw")
	public ResponseEntity<AccountDto> withdraw(@PathVariable Long accountNumber,@RequestBody Map<String,Float> request){
		
		Float amount = request.get("amount");
		return ResponseEntity.ok(accountService.withdraw(accountNumber, amount));
	}
	
	//get all accounts
	@GetMapping
	public ResponseEntity<List<AccountDto>> getAllAccounts(){
		return ResponseEntity.ok(accountService.getAllAccounts());
	}
	
	//delete account
	@DeleteMapping("/{accountNumber}/delete")
	public ResponseEntity<String> deleteAccount(@PathVariable Long accountNumber){
		accountService.deleteAccount(accountNumber);
		return ResponseEntity.ok("Account deleted successfully");
	}
	
	//Get accounts by account type
	
	@GetMapping("/accountType/{accountType}")
	public ResponseEntity<List<AccountDto>> getAccountsByAccountType(@PathVariable String accountType){
		return ResponseEntity.ok(accountService.getAccountsByAccountType(accountType));
	}
}
