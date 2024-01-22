package com.tunghuy.bankapp.service.impl;

import com.tunghuy.bankapp.dto.BankResponse;
import com.tunghuy.bankapp.dto.CreditDebitRequest;
import com.tunghuy.bankapp.dto.EnquiryRequest;
import com.tunghuy.bankapp.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
}
