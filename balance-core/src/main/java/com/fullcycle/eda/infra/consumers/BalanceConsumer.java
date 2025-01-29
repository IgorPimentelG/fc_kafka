package com.fullcycle.eda.infra.consumers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fullcycle.eda.infra.consumers.dtos.BalanceMessageDTO;

import com.fullcycle.eda.infra.consumers.dtos.BalancePayloadDTO;
import com.fullcycle.eda.infra.services.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BalanceConsumer {

    @Autowired
    private BalanceService balanceService;

    private final ObjectMapper mapper = new ObjectMapper();

    @KafkaListener(topics = "${topics.balances.name}", groupId = "${topics.balances.group-id}")
    public void listener(String message) {
        try {
            BalanceMessageDTO balanceMessageDTO = mapper.readValue(message, BalanceMessageDTO.class);
            BalancePayloadDTO payload = balanceMessageDTO.payload();
            balanceService.updateBalance(payload.accountIdTo(), payload.balanceAccountIdTo());
            balanceService.updateBalance(payload.accountIdFrom(), payload.balanceAccountIdFrom());
        } catch (Exception e) {
            throw new RuntimeException("Error reading message.");
        }
    }
}
