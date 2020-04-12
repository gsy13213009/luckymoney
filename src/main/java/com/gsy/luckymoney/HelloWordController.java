package com.gsy.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @Autowired
    LimitConfig mLimitConfig;

    @GetMapping("/hello")
    public String say() {
        return mLimitConfig.getDescription();
    }
}
