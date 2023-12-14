package com.javaprojects.nexpin.repository;

import com.javaprojects.nexpin.model.entity.Account;
import com.javaprojects.nexpin.model.entity.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionTypeRepository extends JpaRepository<TransactionType,Long> {
}
