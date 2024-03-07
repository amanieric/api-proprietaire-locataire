package com.openclassroom.propriolocataire.controller;

import com.openclassroom.propriolocataire.entity.Messages;
import com.openclassroom.propriolocataire.service.MessagesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/messages")
public class MessagesController {


    private final MessagesService messagesService;

    public MessagesController(MessagesService messagesService) {
        this.messagesService = messagesService;
    }

    @PostMapping(path = "")
    @ResponseStatus( HttpStatus.ACCEPTED)
    public String messages(@RequestBody Messages messages){
        return "messages";
    }
}
