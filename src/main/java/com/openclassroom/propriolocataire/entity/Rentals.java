package com.openclassroom.propriolocataire.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Rentals extends AbstractEntity{

    private String name;
    private Double surface;
    private Float price;
    private String picture;
    @Column(length = 2000)
    private String description;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private Rentals ownerId;

    @OneToMany(mappedBy = "rentals",cascade = CascadeType.ALL)
    private List<Messages> messages;



}
