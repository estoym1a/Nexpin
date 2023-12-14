package com.javaprojects.nexpin.repository;

import com.javaprojects.nexpin.model.entity.AccountType;
import com.javaprojects.nexpin.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
