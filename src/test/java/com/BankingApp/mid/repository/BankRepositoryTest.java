package com.BankingApp.mid.repository;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import static org.junit.jupiter.api.Assertions.*;

class BankRepositoryTest {

    @Autowired
    private BankRepository bankRepository;


    @BeforeEach
    void setUp() {
        // create data & test

    }
}