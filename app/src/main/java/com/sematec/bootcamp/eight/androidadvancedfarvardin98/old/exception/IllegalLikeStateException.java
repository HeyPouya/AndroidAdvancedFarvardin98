package com.sematec.bootcamp.eight.androidadvancedfarvardin98.old.exception;

public class IllegalLikeStateException extends Exception {


    @Override
    public String getMessage() {
        return " You have liked a picture that is not available ! Don't do it again!!!! ";
    }
}
