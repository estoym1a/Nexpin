package com.javaprojects.nexpin.service;

import com.javaprojects.nexpin.model.entity.Services;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface ServicesService {

    List<Services> getAllServices();
}