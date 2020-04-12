package com.gsy.luckymoney;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/hello")
    public String say() {
        return "hhhhhhhhhh";
    }
}
