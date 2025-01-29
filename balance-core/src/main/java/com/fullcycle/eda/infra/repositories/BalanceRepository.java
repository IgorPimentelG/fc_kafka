package com.fullcycle.eda.infra.repositories;

import com.fullcycle.eda.domain.entities.Balance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BalanceRepository extends JpaRepository<Balance, UUID> {
    Optional<Balance> findByAccountId(UUID accountId);
}
