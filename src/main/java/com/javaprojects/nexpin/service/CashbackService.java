package com.javaprojects.nexpin.service;

import com.javaprojects.nexpin.model.entity.Cashback;

import java.util.List;

public interface CashbackService {
    Cashback recordCashback(Cashback cashback);

    List<Cashback> getCashbacksForTransaction(Long transactionId);
}
