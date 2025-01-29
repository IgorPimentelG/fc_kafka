package com.fullcycle.eda.infra.consumers.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

public record BalancePayloadDTO(
  @JsonProperty("account_id_from")
  UUID accountIdFrom,

  @JsonProperty("account_id_to")
  UUID accountIdTo,

  @JsonProperty("balance_account_id_from")
  Integer balanceAccountIdFrom,

  @JsonProperty("balance_account_id_to")
  Integer balanceAccountIdTo
) {}
