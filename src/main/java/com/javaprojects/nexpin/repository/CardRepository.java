package com.javaprojects.nexpin.repository;

import java.util.List;

import com.javaprojects.nexpin.model.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findByClientId(Long clientId);
}