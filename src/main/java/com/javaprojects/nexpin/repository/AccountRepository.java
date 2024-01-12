package com.javaprojects.nexpin.repository;

import com.javaprojects.nexpin.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {
    List<Account> findByClientId(Long clientId);
}
