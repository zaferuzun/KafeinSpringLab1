package com.kafein.dto.customer;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class CustomerLoginDto {
    @NotEmpty(message = "username boş olamaz")
    @NotNull
    private String username;
    @NotEmpty(message = "password boş olamaz")
    @NotNull
    private String password;
}
