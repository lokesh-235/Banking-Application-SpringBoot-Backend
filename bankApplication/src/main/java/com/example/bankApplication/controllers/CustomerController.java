package com.example.bankApplication.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankApplication.dto.CustomerDto;
import com.example.bankApplication.services.CustomerService;

@RestController
@RequestMapping("/api/customers")

public class CustomerController {
	
	private CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerDto> getCustomerById(@PathVariable Integer id){
		return ResponseEntity.ok(customerService.getCustomerById(id));
	}
	
	@PostMapping
	public ResponseEntity<CustomerDto> addCustomer(@RequestBody CustomerDto customerDto){
		return ResponseEntity.ok(customerService.addCustomer(customerDto));
	}
}
