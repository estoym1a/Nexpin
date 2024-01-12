package com.javaprojects.nexpin.service;

import com.javaprojects.nexpin.model.entity.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(Account account);

    void deleteAccount(Long accountId);

    Account getAccountById(Long accountId);

    List<Account> getAllAccountsForClients(Long ClientId);

    Account deposit(Long accountId, Double amount);

    Account withdraw(Long accountId, Double amount);
}
