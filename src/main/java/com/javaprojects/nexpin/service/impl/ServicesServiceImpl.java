package com.javaprojects.nexpin.service.impl;

import com.javaprojects.nexpin.model.entity.Services;
import com.javaprojects.nexpin.repository.ServicesRepository;
import com.javaprojects.nexpin.service.ServicesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ServicesServiceImpl implements ServicesService {
    private final ServicesRepository servicesRepository;
    @Override
    public List<Services> getAllServices() {
        return servicesRepository.findAll();
    }

}
