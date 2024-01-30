package com.tunghuy.bankapp.service.impl;

import com.tunghuy.bankapp.entity.Transaction;
import com.tunghuy.bankapp.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
@AllArgsConstructor
public class BankStatement {
    private TransactionRepository transactionRepository;
    public List<Transaction> generateStatement(String accountNumber, String startDate, String endDate){
        LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        return transactionRepository.findAll().stream()
                .filter(transaction -> transaction.getAccountNumber().equals(accountNumber))
                .filter(transaction -> transaction.getCreateAt().isEqual(start))
                .filter(transaction -> transaction.getCreateAt().isEqual(end))
                .toList();
    }

}
