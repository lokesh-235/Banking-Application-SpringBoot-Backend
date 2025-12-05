package com.example.bankApplication.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankApplication.dto.CustomerDto;
import com.example.bankApplication.entities.Customer;
import com.example.bankApplication.mappers.CustomerMapper;
import com.example.bankApplication.repositories.CustomerRepository;
import com.example.bankApplication.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public CustomerDto getCustomerById(Integer id) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository
				.findById(id)
				.orElseThrow(()->
				new RuntimeException("Customer Does not exist"));
		
		CustomerDto customerDto = CustomerMapper.mapToCustomerDto(customer);
		
		return customerDto;
	}

	@Override
	public CustomerDto addCustomer(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		Customer customer =CustomerMapper.mapToCustomer(customerDto);
		customer.getAccounts().forEach(account->account.setCustomer(customer));
		Customer savedCustomer = customerRepository.save(customer);
		System.out.println(savedCustomer);
		
		
		return CustomerMapper.mapToCustomerDto(savedCustomer);
	}
	
	
	
}
