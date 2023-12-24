package com.javaprojects.nexpin.repository;

import com.javaprojects.nexpin.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
