package com.gsy.luckymoney.controller;

import com.gsy.luckymoney.properties.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


    @GetMapping("/hello/{id}")
    @ResponseBody
    public String say2(@PathVariable("id") Integer id) {
        return "id: " + id;
    }

    @GetMapping("/hello3")
    @ResponseBody
    public String say3(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        return "id: " + myId;
    }
}
