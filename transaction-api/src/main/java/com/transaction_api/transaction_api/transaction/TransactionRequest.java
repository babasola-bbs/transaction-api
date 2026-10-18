package com.transaction_api.transaction_api.transaction;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record TransactionRequest(
        @NotNull
        @DecimalMin("0.01")
        BigDecimal amount,

        @NotBlank
        String description
) {}
