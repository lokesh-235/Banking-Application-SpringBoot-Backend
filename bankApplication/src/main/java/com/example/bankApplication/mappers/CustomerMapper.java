package com.example.bankApplication.mappers;

import com.example.bankApplication.dto.CustomerDto;
import com.example.bankApplication.entities.Customer;

public class CustomerMapper {
	public static Customer mapToCustomer(CustomerDto customerDto) {
		Customer customer = new Customer(
				customerDto.getId(),
				customerDto.getName(),
				customerDto.getAddress(),
				customerDto.getPhoneNumber()
				);
		
		return customer;
	}
	
	public static CustomerDto mapToCustomerDto(Customer customer) {
		CustomerDto customerDto = new CustomerDto(
				customer.getId(),
				customer.getName(),
				customer.getAddress(),
				customer.getPhoneNumber()
				);
		
		return customerDto;
	}
}
