package com.openclassroom.propriolocataire.controller;

import com.openclassroom.propriolocataire.dto.RentalsDto;
import com.openclassroom.propriolocataire.entity.Rentals;
import com.openclassroom.propriolocataire.service.RentalsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.beans.factory.support.ManagedList.of;

@RestController
@RequestMapping(path = "/rentals")
public class RentalsController {

    private final  RentalsService rentalsService;

    public RentalsController(RentalsService rentalsService) {
        this.rentalsService = rentalsService;
    }

    @GetMapping(path = "")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<RentalsDto> getAll(){
        return of();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    RentalsDto getOneRentals(@PathVariable Integer id){
        return RentalsDto.builder()
                .id(id)
                .build();
    }

    @PostMapping(path = "")
    @ResponseStatus(HttpStatus.CREATED)
    String createRentals(@RequestBody Rentals rentals){
        return "Rental created !";
    }

    @PutMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    String updateRentals(@PathVariable Integer id){
        return "Rental updated !";
    }
}
