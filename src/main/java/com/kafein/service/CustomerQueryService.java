package com.kafein.service;

import com.kafein.dto.customer.response.CustomerResponse;

public interface CustomerQueryService {

    public CustomerResponse checkCustomerByNameAndSurname();

    public CustomerResponse checkCustomerById();
}
