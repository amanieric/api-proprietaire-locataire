package com.openclassroom.propriolocataire.dto;
import com.openclassroom.propriolocataire.entity.Messages;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class UsersDto {

    private Integer id;
    private String name;
    private String email;
    private String password;
    private List<Messages> messages;

}
