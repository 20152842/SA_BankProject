package com.example.sa_bankproject.controller;

import com.example.sa_bankproject.utils.Console;
import com.example.sa_bankproject.view.InputView;
import com.example.sa_bankproject.view.OutputView;

public class BankProcessor {
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();

    public void runBank(){
        welcomeMessage();
        do {
            selectItem();
        }while (askContinue());
        goodbyeMessage();
    }

    private void selectBehavior(){

    }

    private void welcomeMessage(){
        outputView.welcomeMessage();
    }
    private void goodbyeMessage(){
        outputView.goodbyeMessage();
    }

    private void selectItem(){
        inputView.selectItem();
    }

    private boolean askContinue(){
        return inputView.askContinue(Console.readLine());
    }

}
