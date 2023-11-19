package com.example.sa_bankproject.model.account;

public class Account {
    private final AccountInfo accountInfo;
    private final Balance balance;

    private Account(AccountInfo accountInfo, Balance balance){
        this.accountInfo = accountInfo;
        this.balance = balance;
    }

    public Account createAccount(){
        return new Account(AccountInfo.createAccountInfo(), Balance.createBalance());
    }

}
