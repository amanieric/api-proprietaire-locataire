package com.openclassroom.propriolocataire.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Messages extends AbstractEntity{

    @Column(length = 2000)
    private  String message;

    @ManyToOne
    @JoinColumn(name = "rental_id")
    private Rentals rentals;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
}
