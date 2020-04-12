package com.gsy.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWordController {

    @Autowired
    LimitConfig mLimitConfig;

    @GetMapping("/hello")
    public String say() {
        return "index";
    }


    @GetMapping("/hello2")
    @ResponseBody
    public String say2() {
        return mLimitConfig.getDescription();
    }
}
