package com.kafein.dto.customer;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class CustomerRegisterDto {

    @NotEmpty(message = "name boş olamaz")
    @Size(min = 2, max = 20, message = "isim {min} ile {max} arasında olmalı")
    private String name;
    private String surname;
    @NotEmpty(message = "username boş olamaz")
    @Pattern(regexp = "^[A-Za-z][A-Za-z0-9_]{7,29}$",
            message = "8ile 30 karakter arasında bir username seçiniz")
    private String username;
    @NotEmpty(message = "password boş olamaz")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "password min 8 karakter bir sayı bir büyük karakter bir özel karakter barındırmalı")
    private String password;
    @Max(300)
    @Min(50)
    @NotEmpty(message = "height boş olamaz")
    private int height;
    @Max(300)
    @Min(10)
    @NotEmpty(message = "weight boş olamaz")
    private int weight;
    @NotEmpty(message = "birthdate boş olamaz")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;
}
