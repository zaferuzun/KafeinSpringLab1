package com.kafein.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerDto {
    private Long customerId;
    private String name;
    private String surname;
    private String username;
    private String password;
    private int height;
    private int weight;
    private Date birthdate;
}
