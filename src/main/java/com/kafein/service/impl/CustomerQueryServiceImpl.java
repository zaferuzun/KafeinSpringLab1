package com.kafein.service.impl;

import com.kafein.config.AppConfiguration;
import com.kafein.dto.customer.CustomerDto;
import com.kafein.dto.customer.response.CustomerResponse;
import com.kafein.service.CustomerQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerQueryServiceImpl implements CustomerQueryService {
    @Autowired
    AppConfiguration appConfiguration;

    @Override
    public CustomerResponse checkCustomerByNameAndSurname() {
        CustomerDto customerDto = appConfiguration.getApplicationInfoDto().getDefaultCustomerDtos().stream()
                .filter(customer -> name.equals(customer.getName()) && surname.equals(customer.getSurname()))
                .findAny()
                .orElse(null);

        return customerDto;
    }

    @Override
    public CustomerResponse checkCustomerById() {
        CustomerDto customerDto = appConfiguration.getApplicationInfoDto().getDefaultCustomerDtos().stream()
                .filter(customer -> id.equals(customer.getCustomerId()))
                .findAny()
                .orElse(null);

        return customerDto;
    }
}
