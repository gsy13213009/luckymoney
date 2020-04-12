package com.gsy.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWordController {

    @Autowired
    LimitConfig mLimitConfig;

    @GetMapping("/hello")
    public String say() {
//        return mLimitConfig.getDescription();
        return "index";
    }
}
