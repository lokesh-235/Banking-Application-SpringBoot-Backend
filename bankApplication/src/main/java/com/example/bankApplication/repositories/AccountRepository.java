package com.example.bankApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankApplication.entities.Account;
import java.util.List;



public interface AccountRepository extends JpaRepository<Account, Long>{
	List<Account> findByAccountType(String accountType);
}
