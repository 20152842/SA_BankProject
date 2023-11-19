package com.example.sa_bankproject.config;

public enum InputMessage {
    SELECT_ITEM("원하시는 업무를 선택해주세요.\n" +
            "1. 계좌 개설\n" +
            "2. 입금\n" +
            "3. 송금\n" +
            "4. 계좌 이체\n" +
            "5. 계좌 정보 확인\n" +
            "6. 거래 내역 확인\n" +
            "해당 업무의 번호를 입력하세요.\n"),
    ASK_CONTINUE("다른 업무를 진행하시려면 1, 프로그램을 종료하시려면 2 를 입력하세요."),
    PROGRAM_CONTINUE("다른 업무를 계속 진행합니다."),
    PROGRAM_END("프로그램을 종료합니다.")
    ;
    private final String message;
    private InputMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
