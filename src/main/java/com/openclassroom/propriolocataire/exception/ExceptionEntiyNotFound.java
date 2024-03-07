package com.openclassroom.propriolocataire.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionEntiyNotFound extends  RuntimeException{

    private ErrorCodes errorCodes;

    public  ExceptionEntiyNotFound(String msg){
        super(msg);
    }
    public ExceptionEntiyNotFound(String msg,Throwable cause){
        super(msg,cause);
    }

    public ExceptionEntiyNotFound(String msg,Throwable cause,ErrorCodes errorCodes){
        super(msg,cause);
        this.errorCodes=errorCodes;
    }

    public ExceptionEntiyNotFound(String msg,ErrorCodes errorCodes){
        super(msg);
        this.errorCodes=errorCodes;
    }
}
