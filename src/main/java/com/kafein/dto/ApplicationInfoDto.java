package com.kafein.dto;

import lombok.Data;

import java.util.List;

@Data
public class ApplicationInfoDto {
    private String description;
    private String version;
    private String syncPeriod;
    private String allowedTPS1;
    private String retryEnabled;
    private List<CustomerDto> defaultCustomerDtos;
}
