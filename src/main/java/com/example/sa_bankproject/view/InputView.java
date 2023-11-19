package com.example.sa_bankproject.view;

import com.example.sa_bankproject.config.InputMessage;
import com.example.sa_bankproject.validate.Validator;

public class InputView {
    public boolean askContinue(String userInput) {
        Validator.userInputValidator(userInput);
        System.out.println(InputMessage.ASK_CONTINUE.getMessage());
        if (Integer.parseInt(userInput) == 1) {
            System.out.println(InputMessage.PROGRAM_CONTINUE.getMessage());
            return true;
        }
        if (Integer.parseInt(userInput) == 2) {
            System.out.println(InputMessage.PROGRAM_END.getMessage());
            return false;
        }
        return false;
    }

    public void selectItem() {
        System.out.println(InputMessage.SELECT_ITEM.getMessage());
    }
}
