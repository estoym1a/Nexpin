package com.javaprojects.nexpin.repository;

import com.javaprojects.nexpin.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Long> {
    Optional<Client> findByFullName(String fullName); //The Full Name might not exist in the database. So that we use optional not to return 'NullPointerException'.
}
