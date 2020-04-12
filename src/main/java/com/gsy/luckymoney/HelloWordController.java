package com.gsy.luckymoney;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @Value("${minMoney}")
    private BigDecimal minMoney;

    @Value("${description}")
    private String description;

    @GetMapping("/hello")
    public String say() {
        return "minMoney:" + minMoney + ", 说明：" + description;
    }
}
