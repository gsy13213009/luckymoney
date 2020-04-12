package com.gsy.luckymoney.repository;

import com.gsy.luckymoney.domain.Luckymoney;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LuckymoneyRepository extends JpaRepository<Luckymoney, Integer> {

}
