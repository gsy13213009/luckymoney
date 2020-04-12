package com.gsy.luckymoney;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LuckymoneyService {

    @Autowired
    private LuckymoneyRepository repository;

    /**
     * 添加Transactional即可实现事务操作
     * 事务，指的是数据库的事务(MySAM不支持事务，需要改成Innodb)
     */
    @Transactional
    public void createTwo() {
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("郭思义");
        luckymoney1.setMoney(new BigDecimal("520"));
        repository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("郭思义");
        luckymoney2.setMoney(new BigDecimal("1314"));
        repository.save(luckymoney2);
    }

}
