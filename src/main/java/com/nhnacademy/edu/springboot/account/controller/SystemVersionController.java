package com.nhnacademy.edu.springboot.account.controller;

import com.nhnacademy.edu.springboot.account.config.SystemVersion;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController//json반환시 사용
@RequiredArgsConstructor
public class SystemVersionController {

    private final SystemVersion systemVersion;

    @GetMapping("/system/version")
    public Map<String ,String > getVersion(){
        return Map.of("version",systemVersion.getVersion());
    }

}
