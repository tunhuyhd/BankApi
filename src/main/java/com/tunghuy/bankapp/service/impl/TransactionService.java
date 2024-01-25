package com.tunghuy.bankapp.service.impl;

import com.tunghuy.bankapp.dto.TransactionDto;
import com.tunghuy.bankapp.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
