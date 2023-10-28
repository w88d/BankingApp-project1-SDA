package com.BankingApp.mid.repository;

import com.BankingApp.mid.model.Bank;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BankRepositoryTest {

    @Autowired
    BankRepository bankRepository;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAllById() {
    }

    @Test
    void findAllByAddress() {
    }

    @Test
    void findAllByName() {
    }
}