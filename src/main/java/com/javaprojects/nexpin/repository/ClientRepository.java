package com.javaprojects.nexpin.repository;

import com.javaprojects.nexpin.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
