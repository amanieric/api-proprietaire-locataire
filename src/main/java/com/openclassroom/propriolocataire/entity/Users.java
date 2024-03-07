package com.openclassroom.propriolocataire.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Users extends AbstractEntity{

    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private List<Messages> messages;

}
