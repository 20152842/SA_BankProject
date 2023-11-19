package com.example.sa_bankproject.model.account;

public class AccountInfo {

    private final int accountNumber;
    private final String userName;
    private final String userPassword;

    private AccountInfo(int accountNumber, String userName, String userPassword){
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public static AccountInfo createAccountInfo(){
        return new AccountInfo();
    }


}
