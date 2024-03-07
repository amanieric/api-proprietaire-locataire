package com.openclassroom.propriolocataire.service;

import com.openclassroom.propriolocataire.dto.UsersDto;
import com.openclassroom.propriolocataire.repository.UsersRepository;
import com.openclassroom.propriolocataire.service.interfaces.UsersServiceInterfaces;
import org.springframework.stereotype.Service;


@Service
public class UsersService implements UsersServiceInterfaces {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UsersDto addUser(UsersDto usersDto) {
        return UsersDto.builder()
                .id(1)
                .name("Owner Name")
                .email("test@test.com")
                .build();
    }
}

