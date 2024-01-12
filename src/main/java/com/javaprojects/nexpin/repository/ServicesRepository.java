package com.javaprojects.nexpin.repository;

import com.javaprojects.nexpin.model.entity.Services;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ServicesRepository extends JpaRepository<Services,Long> {

}
