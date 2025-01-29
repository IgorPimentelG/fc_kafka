package com.fullcycle.eda.infra.services;

import com.fullcycle.eda.domain.entities.Balance;
import com.fullcycle.eda.infra.repositories.BalanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BalanceService {

    @Autowired
    private BalanceRepository balanceRepository;

    public void updateBalance(UUID accountId, Integer amount) {
        Balance balance = balanceRepository.findByAccountId(accountId).orElse(new Balance(accountId));
        balance.setBalance(amount);
        balanceRepository.save(balance);
    }

    public Balance getBalance(UUID accountId) {
        return balanceRepository.findByAccountId(accountId)
            .orElseThrow(() -> new RuntimeException("Account ID not found."));
    }
}
