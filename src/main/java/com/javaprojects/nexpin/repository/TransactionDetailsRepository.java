package com.javaprojects.nexpin.repository;

import com.javaprojects.nexpin.model.entity.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails,Long> {
}
