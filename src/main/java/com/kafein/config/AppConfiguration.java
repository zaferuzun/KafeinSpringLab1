package com.kafein.config;

import com.kafein.dto.app.ApplicationInfoDto;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "application.info")
@Data
public class AppConfiguration {

    private ApplicationInfoDto applicationInfoDto;

}
