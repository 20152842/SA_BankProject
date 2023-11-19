package com.example.sa_bankproject.config;

public enum OutputMessage {
    WELCOME("어서오세요, 국민은행입니다."),
    GOODBYE("감사합니다, 안녕히 가세요.")
    ;
    private final String message;
    private OutputMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
