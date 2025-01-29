package com.fullcycle.eda.infra.consumers.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record BalanceMessageDTO(
  @JsonProperty("Name")
  String name,

  @JsonProperty("Payload")
  BalancePayloadDTO payload
) {}
