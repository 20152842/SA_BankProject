package com.example.sa_bankproject.model.account;

public class Balance {
    private int balance;

    private Balance(){
        this.balance = 0;
    }

    public static Balance createBalance(){
        return new Balance();
    }

}
