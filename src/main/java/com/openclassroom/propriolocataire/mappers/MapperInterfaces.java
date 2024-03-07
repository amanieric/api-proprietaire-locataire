package com.openclassroom.propriolocataire.mappers;

import com.openclassroom.propriolocataire.dto.MessagesDto;
import com.openclassroom.propriolocataire.dto.RentalsDto;
import com.openclassroom.propriolocataire.dto.UsersDto;
import com.openclassroom.propriolocataire.entity.Messages;
import com.openclassroom.propriolocataire.entity.Rentals;
import com.openclassroom.propriolocataire.entity.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperInterfaces {

    UsersDto entityToDto(Users users);
    Users dtoToEntity(UsersDto usersDto);
    MessagesDto entityToDto(Messages messages);
    Messages dtoToEntity(MessagesDto messagesDto);
    RentalsDto entityToDto(Rentals rentals);
    Rentals dtoToEntity(RentalsDto rentalsDto);



}
