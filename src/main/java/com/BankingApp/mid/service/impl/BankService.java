package com.BankingApp.mid.service.impl;


import com.BankingApp.mid.controller.interfaces.IBankController;
import com.BankingApp.mid.model.Bank;
import com.BankingApp.mid.repository.BankRepository;;
import com.BankingApp.mid.service.interfaces.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class BankService implements IBankService {

    @Autowired
    BankRepository bankRepository;

    // Move logic
    @Override
    public Bank getBankById(Long bank) {
        Optional<Bank> bankOptional = bankRepository.findById(bank);
        if (bankOptional.isEmpty()) return null;
        return bankOptional.get();
    }

    @Override
    public void updateBank(Bank bank, Long id) {
        Optional<Bank> bankOptional = bankRepository.findById(id);
        if (bankOptional.isEmpty()) return;
        bank.setId(id);
        bankRepository.save(bank);
    }
}
