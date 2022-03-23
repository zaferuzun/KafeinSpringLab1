package com.kafein.rest;

import com.kafein.config.AppConfiguration;
import com.kafein.dto.app.ApplicationInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/v1/application/info")
public class ApplicationInfoController {

    @Autowired
    AppConfiguration appConfiguration;

    @GetMapping("app-info")
    public ApplicationInfoDto getApplicationInfo(){
        return appConfiguration.getApplicationInfoDto();
    }
}
