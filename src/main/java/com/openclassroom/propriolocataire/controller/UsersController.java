package com.openclassroom.propriolocataire.controller;

import com.openclassroom.propriolocataire.dto.LoginDto;
import com.openclassroom.propriolocataire.dto.UsersDto;
import com.openclassroom.propriolocataire.service.UsersService;
import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/auth")
@Builder
public class UsersController {
    private final  UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping(path = "/register")
    @ResponseStatus(HttpStatus.CREATED)
    public String register(@RequestBody UsersDto users){
        return "jwt";
    }

    @PostMapping(path = "/login")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String login(@RequestBody LoginDto loginDto) {
        return "jwt";
    }

    @GetMapping(path = "/me")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public UsersDto me(){

        return UsersDto.builder().id(1).build();
    }



}
