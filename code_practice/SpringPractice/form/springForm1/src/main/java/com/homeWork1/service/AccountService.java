package com.homeWork1.service;

public class AccountService {
    private final Account account;

    public AccountService(Account account) {
        this.account = account;
    }

    public Account getAccountDetails(){
        return this.account;
    }

}
