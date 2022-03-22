package com.kafein.rest;

import com.kafein.config.AppConfiguration;
import com.kafein.dto.ApplicationInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationInfoController {

    @Autowired
    AppConfiguration appConfiguration;

    @GetMapping("app-info")
    public ApplicationInfoDto getApplicationInfo(){
        return appConfiguration.getApplicationInfoDto();
    }
}
