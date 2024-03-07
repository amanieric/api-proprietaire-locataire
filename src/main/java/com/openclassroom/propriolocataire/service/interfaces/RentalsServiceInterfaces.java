package com.openclassroom.propriolocataire.service.interfaces;

import com.openclassroom.propriolocataire.dto.RentalsDto;

import java.util.List;

public interface RentalsServiceInterfaces {
    List<RentalsDto> getAll();
    RentalsDto findOneRental(Integer id);
    String addRentals(RentalsDto rentalsDto);
    String updateRentals(Integer id);

}
