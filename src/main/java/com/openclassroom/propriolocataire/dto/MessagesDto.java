package com.openclassroom.propriolocataire.dto;


import com.openclassroom.propriolocataire.entity.Rentals;
import com.openclassroom.propriolocataire.entity.Users;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MessagesDto {

    private Integer id;
    private  String message;
    private Rentals rentals;
    private Users users;

}
