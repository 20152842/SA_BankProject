package com.example.sa_bankproject.view;

import com.example.sa_bankproject.config.OutputMessage;

public class OutputView {
    public void welcomeMessage(){
        System.out.println(OutputMessage.WELCOME.getMessage());
    }
    public void goodbyeMessage(){
        System.out.println(OutputMessage.GOODBYE.getMessage());
    }
}
