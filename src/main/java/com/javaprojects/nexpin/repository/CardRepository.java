package com.javaprojects.nexpin.repository;

import com.javaprojects.nexpin.model.entity.AccountType;
import com.javaprojects.nexpin.model.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Long> {
}
