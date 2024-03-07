package com.openclassroom.propriolocataire.exception;

public enum ErrorCodes {
    MESSAGE_NOT_FOUND(100),
    MESSAGE_NOT_VALID(101),
    RENTAL_NOT_FOUND(200),
    RENTAL_NOT_VALID(201),
    USER_NOT_FOUND(300),
    USER_NOT_VALID(301);
    private int code;
    ErrorCodes(int code){
        this.code = code;
    }
    public int getCode(){
        return this.code;
    }
}
