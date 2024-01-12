package com.javaprojects.nexpin.service.impl;

import com.javaprojects.nexpin.exception.AccountNotFoundException;
import com.javaprojects.nexpin.model.entity.Account;
import com.javaprojects.nexpin.repository.AccountRepository;
import com.javaprojects.nexpin.service.AccountService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Secured("ROLE_ADMIN")
    @Override
    public void deleteAccount(Long accountId) {
        accountRepository.deleteById(accountId);

    }

    @Override
    public Account getAccountById(Long accountId) {
        return accountRepository.findById(accountId).orElseThrow(() -> new AccountNotFoundException("Account not found with  id " + accountId));
    }

    @Override
    public List<Account> getAllAccountsForClient(Long clientId) {
        return accountRepository.findByClientId(clientId);
    }

    //  It retrieves the account by accountId, checks if the amount is positive,
    //  updates the balance, and saves the updated account.
    @Override
    public Account deposit(Long accountId, Double amount) {

        return accountRepository.findById(accountId)
                .map(account -> {
                    // Ensure that the amount is positive for a deposit
                    if (amount > 0) {
                        account.setBalance(account.getBalance() + amount);
                        return accountRepository.save(account);
                    } else {
                        throw new IllegalArgumentException("Deposit amount must be positive");
                    }
                })
                .orElseThrow(() -> new AccountNotFoundException("Account not found with id: " + accountId));
    }

    // It retrieves the account by accountId, checks if the withdrawal amount is positive and there is sufficient balance,
    // updates the balance, and saves the updated account.
    @Override
    public Account withdraw(Long accountId, Double amount) {

        return accountRepository.findById(accountId)
                .map(account -> {
                    // Ensure that the account has sufficient balance for withdrawal
                    if (amount > 0 && account.getBalance() >= amount) {
                        account.setBalance(account.getBalance() - amount);
                        return accountRepository.save(account);
                    } else {
                        throw new IllegalArgumentException("Invalid withdrawal amount or insufficient balance");
                    }
                })
                .orElseThrow(() -> new AccountNotFoundException("Account not found with id: " + accountId));
    }


}
