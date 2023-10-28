package com.BankingApp.mid.service.impl;

import com.BankingApp.mid.model.Account;
import com.BankingApp.mid.repository.AccountRepository;
import com.BankingApp.mid.service.interfaces.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class AccountService implements IAccountService {

    @Autowired
    AccountRepository accountRepository;

    // Move logic
    public Account getAccountById( Long id){
        Optional<Account> accountOptional = accountRepository.findById(id);
        if (accountOptional.isEmpty()) return null;
        return accountOptional.get();
    }
}
