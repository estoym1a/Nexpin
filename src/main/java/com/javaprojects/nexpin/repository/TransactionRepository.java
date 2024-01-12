package com.javaprojects.nexpin.repository;

import com.javaprojects.nexpin.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    List<Transaction> findByAccountId(Long accountId);
}
