package com.kafein.rest;

import com.kafein.config.AppConfiguration;
import com.kafein.dto.ApplicationInfoDto;
import com.kafein.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/v1/customer")
public class CustomerQueryController {

    @Autowired
    AppConfiguration appConfiguration;

    @GetMapping("/{id}")
    public CustomerDto getCustomerById(@PathVariable("id") final Long id){

        CustomerDto customerDto = appConfiguration.getApplicationInfoDto().getDefaultCustomerDtos().stream()
                .filter(customer -> id.equals(customer.getCustomerId()))
                .findAny()
                .orElse(null);

        return customerDto;
    }

    @GetMapping("/name-and-surname")
    public CustomerDto getCustomerByNameAndSurname(@RequestParam("name") final String name,
                                                   @RequestParam("surname") final String surname){

        CustomerDto customerDto = appConfiguration.getApplicationInfoDto().getDefaultCustomerDtos().stream()
                .filter(customer -> name.equals(customer.getName()) && surname.equals(customer.getSurname()))
                .findAny()
                .orElse(null);

        return customerDto;
    }

}
