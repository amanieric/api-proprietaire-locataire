package com.openclassroom.propriolocataire.handlerException;

import com.openclassroom.propriolocataire.exception.ErrorCodes;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class ErrorDto {

    private String message;
    private Date dateError;
    private ErrorCodes errorCodes;
    private Integer httpCode;
    private List<String> errors;

}
