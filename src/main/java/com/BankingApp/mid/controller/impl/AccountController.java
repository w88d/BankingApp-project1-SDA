package com.BankingApp.mid.controller.impl;

import com.BankingApp.mid.controller.interfaces.IAccountController;
import com.BankingApp.mid.model.Account;
import com.BankingApp.mid.repository.AccountRepository;
import com.BankingApp.mid.service.impl.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class AccountController implements IAccountController {
    // controller impl files one by one

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountService accountService;

    // **** GET ****
    // GET Operation retrieve all accounts info
    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    // GET Operation retrieve account by id
    @GetMapping("/accounts/{id}")
    public Account getAccountById(@PathVariable Long id){
        return accountService.getAccountById(id);
    }

    // **** POST ****








    }





