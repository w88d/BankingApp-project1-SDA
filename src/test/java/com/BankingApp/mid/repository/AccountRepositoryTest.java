package com.BankingApp.mid.repository;

import com.BankingApp.mid.model.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    void findAllById() {
        //add new account and testing
        Account account1 = new Account();
        account1.setName("Bob");
        account1.setAccountNum("123456");
        accountRepository.save(account1);

        Account account2 = new Account();

        account2.setName("Jane");
        account2.setAccountNum("798012");
        accountRepository.save(account2);

        List<Account> accounts = accountRepository.findAllById(account1.getId());
        assertEquals(1, accounts.size());
    }

    @Test
    void findAllByName() {
    }

    @Test
    void findByAccountNum() {
    }


}