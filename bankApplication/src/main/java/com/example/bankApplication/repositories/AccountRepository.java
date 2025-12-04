package com.example.bankApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankApplication.entities.Account;
import com.example.bankApplication.entities.Customer;

import java.util.List;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	List<Account> findByAccountType(String accountType);
	Customer findCustomerByAccountNumber(Long accountNumber);
	
}
