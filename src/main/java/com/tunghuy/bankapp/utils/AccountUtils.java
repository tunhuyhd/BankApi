package com.tunghuy.bankapp.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account Created!!";
    public static final String ACCOUNT_CREATION_SUCCESS= "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created;";
    public static final String ACCOUNT_NOT_EXIST_CODE= "003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE= "User with the provided Account Number does not exist!!";
    public static final String ACCOUNT_FOUND_CODE= "004";
    public static final String ACCOUNT_FOUND_MESSAGE= "User account found";
    public static final String ACCOUNT_CREDITED_SUCCESS= "005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE= "User account credit success";
    public static String generateAccountNumber(){
        /*
         * 2024 + random6Digits
         */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //generate random
        int randNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);

        //convert to String
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();
    }
}
