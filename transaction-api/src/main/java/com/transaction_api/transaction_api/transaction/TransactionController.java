package com.transaction_api.transaction_api.transaction;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, Object> createTransaction(@Valid @RequestBody TransactionRequest request){
        return Map.of(
                "reference", UUID.randomUUID().toString(),
                "amount", request.amount(),
                "description", request.description(),
                "status", "SUCCESS"
        );
    }

//    $body = @{
//        amount = 2500.00
//        description = "Test transaction"
//    } | ConvertTo-Json
//
//    Invoke-RestMethod `
//            -Uri "http://localhost:8080/api/transactions" `
//            -Method Post `
//            -ContentType "application/json" `
//            -Body $body
}
