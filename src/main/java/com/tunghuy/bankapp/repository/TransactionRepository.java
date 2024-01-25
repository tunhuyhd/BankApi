package com.tunghuy.bankapp.repository;

import com.tunghuy.bankapp.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
