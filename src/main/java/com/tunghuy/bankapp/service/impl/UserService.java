package com.tunghuy.bankapp.service.impl;

import com.tunghuy.bankapp.dto.BankResponse;
import com.tunghuy.bankapp.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
