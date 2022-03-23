package com.kafein.dto.customer;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;
}
