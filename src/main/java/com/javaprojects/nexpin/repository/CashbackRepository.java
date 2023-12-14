package com.javaprojects.nexpin.repository;

import com.javaprojects.nexpin.model.entity.AccountType;
import com.javaprojects.nexpin.model.entity.Cashback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashbackRepository extends JpaRepository<Cashback,Long> {
}
