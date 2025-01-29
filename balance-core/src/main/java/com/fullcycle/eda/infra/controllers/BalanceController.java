package com.fullcycle.eda.infra.controllers;

import com.fullcycle.eda.domain.entities.Balance;
import com.fullcycle.eda.infra.services.BalanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/balances")
public class BalanceController {

    @Autowired
    private BalanceService balanceService;

    @GetMapping("/{accountId}")
    public ResponseEntity<Balance> getBalanceById(@PathVariable UUID accountId) {
        return ResponseEntity.ok(balanceService.getBalance(accountId));
    }
}