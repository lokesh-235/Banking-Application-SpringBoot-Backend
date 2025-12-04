package com.example.bankApplication.services;

import com.example.bankApplication.dto.CustomerDto;

public interface CustomerService {
	CustomerDto getCustomerById(Integer id);
}
