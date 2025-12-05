package com.example.bankApplication.mappers;

import java.util.stream.Collectors;

import com.example.bankApplication.dto.CustomerDto;
import com.example.bankApplication.entities.Customer;

public class CustomerMapper {
	public static Customer mapToCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		
//		customer.setId(customerDto.getId());
		customer.setName(customerDto.getName());
		customer.setAddress(customerDto.getAddress());
		customer.setPhoneNumber(customerDto.getPhoneNumber());
		customer.setAccounts(customerDto.getAccounts().stream()
				.map(AccountMapper::mapToAccount)
				.collect(Collectors.toList()));
		
		return customer;
	}
	
	public static CustomerDto mapToCustomerDto(Customer customer) {
		CustomerDto customerDto = new CustomerDto();
		
		customerDto.setId(customer.getId());
		customerDto.setName(customer.getName());
		customerDto.setAddress(customer.getAddress());
		customerDto.setPhoneNumber(customer.getPhoneNumber());
		
		customerDto.setAccounts(customer.getAccounts().stream()
				.map(AccountMapper::mapToAccountDto)
				.collect(Collectors.toList()));
		
		return customerDto;
	}
}
