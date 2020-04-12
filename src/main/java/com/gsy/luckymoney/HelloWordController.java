package com.gsy.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloWordController {

    @Autowired
    LimitConfig mLimitConfig;

    @GetMapping("/hello")
    public String say() {
        return "index";
    }


    @GetMapping({"/hello2", "hi"})
    @ResponseBody
    public String say2() {
        return mLimitConfig.getDescription();
    }
}
