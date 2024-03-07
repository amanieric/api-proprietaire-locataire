package com.openclassroom.propriolocataire.dto;


import com.openclassroom.propriolocataire.entity.Messages;
import com.openclassroom.propriolocataire.entity.Rentals;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class RentalsDto {

    private Integer id;
    private String name;
    private Double surface;
    private Float price;
    private String picture;
    private String description;
    private Rentals ownerId;
    private List<Messages> messages;
}
