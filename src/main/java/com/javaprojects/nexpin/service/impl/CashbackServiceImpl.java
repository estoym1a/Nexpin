package com.javaprojects.nexpin.service.impl;

import com.javaprojects.nexpin.model.entity.Cashback;
import com.javaprojects.nexpin.repository.CashbackRepository;
import com.javaprojects.nexpin.service.CashbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CashbackServiceImpl implements CashbackService {

    private final CashbackRepository cashbackRepository;
    @Override
    public Cashback recordCashback(Cashback cashback) {
        return null;
    }

    @Override
    public List<Cashback> getCashbacksForTransaction(Long transactionId) {
        return null;
    }
}
