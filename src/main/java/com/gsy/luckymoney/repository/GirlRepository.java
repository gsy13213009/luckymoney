package com.gsy.luckymoney.repository;

import com.gsy.luckymoney.domain.Girl;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 廖师兄
 * 2016-11-03 23:17
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
