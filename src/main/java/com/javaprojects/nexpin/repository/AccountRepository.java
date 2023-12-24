package com.javaprojects.nexpin.repository;

import com.javaprojects.nexpin.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
