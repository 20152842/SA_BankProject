package com.example.sa_bankproject;


import com.example.sa_bankproject.controller.BankProcessor;

public class SaBankProjectApplication {
    public static void main(String[] args) {
        BankProcessor bankProcessor = new BankProcessor();
        bankProcessor.runBank();
    }

}
