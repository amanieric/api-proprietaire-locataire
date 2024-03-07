package com.openclassroom.propriolocataire.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
public class EntityNotValidException extends RuntimeException{
    private ErrorCodes errorCodes;
    private List<String> errors = new ArrayList<>();
    public EntityNotValidException(String msg){
        super(msg);
    }
    public EntityNotValidException(String msg, Throwable cause){
        super(msg,cause);
    }
    public EntityNotValidException(String msg,Throwable cause,ErrorCodes errorCodes){
        super(msg,cause);
        this.errorCodes=errorCodes;
    }
    public EntityNotValidException(String msg,Throwable cause,ErrorCodes errorCodes,List<String> errors){
        super(msg,cause);
        this.errorCodes=errorCodes;
        this.errors=errors;
    }
    public EntityNotValidException(String msg,ErrorCodes errorCodes,List<String> errors){
        super(msg);
        this.errors=errors;
        this.errorCodes=errorCodes;
    }
}
