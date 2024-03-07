package com.openclassroom.propriolocataire.service;

import com.openclassroom.propriolocataire.entity.Messages;
import com.openclassroom.propriolocataire.exception.EntityNotValidException;
import com.openclassroom.propriolocataire.repository.MessagesRepository;
import com.openclassroom.propriolocataire.service.interfaces.MessagesServiceInterfaces;
import org.springframework.stereotype.Service;

@Service
public class MessagesService implements MessagesServiceInterfaces {
    private final MessagesRepository messagesRepository;

    public MessagesService(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    @Override
    public String addMessage(Messages messages) {
        if(messages==null){
            throw new EntityNotValidException("Le message est null");
        }
        messagesRepository.save(messages);
        return "Message send with success";
    }
}
