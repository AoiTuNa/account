package com.nhnacademy.edu.springboot.account.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.nhn.account.system")
@Getter
@Setter
public class SystemVersion {
    private String version;
}
