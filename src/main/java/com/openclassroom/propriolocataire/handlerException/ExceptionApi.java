package com.openclassroom.propriolocataire.handlerException;


import com.openclassroom.propriolocataire.exception.EntityNotValidException;
import com.openclassroom.propriolocataire.exception.ExceptionEntiyNotFound;
import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
@RestControllerAdvice
@Builder
public class ExceptionApi {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ExceptionEntiyNotFound.class)
    public ErrorDto handlerException(ExceptionEntiyNotFound e, WebRequest webRequest){
      final Integer statusCode = HttpStatus.NOT_FOUND.value();
        return ErrorDto.builder()
              .errorCodes(e.getErrorCodes())
              .dateError(new Date())
              .message(e.getMessage())
              .httpCode(statusCode)
              .build();

    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(EntityNotValidException.class)
    public ErrorDto handlerException(EntityNotValidException i, WebRequest webRequest){
        final Integer statusCode = HttpStatus.BAD_REQUEST.value();
        return ErrorDto.builder()
                .errors(i.getErrors())
                .errorCodes(i.getErrorCodes())
                .httpCode(statusCode)
                .message(i.getMessage())
                .dateError(new Date())
                .build();

    }

}
