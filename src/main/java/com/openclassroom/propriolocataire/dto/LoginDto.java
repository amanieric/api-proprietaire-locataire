package com.openclassroom.propriolocataire.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoginDto {

    private String email;
    private String password;

}
