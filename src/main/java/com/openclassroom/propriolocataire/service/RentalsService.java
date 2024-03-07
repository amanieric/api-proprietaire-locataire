package com.openclassroom.propriolocataire.service;

import com.openclassroom.propriolocataire.dto.RentalsDto;
import com.openclassroom.propriolocataire.repository.RentalsRepository;
import com.openclassroom.propriolocataire.service.interfaces.RentalsServiceInterfaces;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalsService implements RentalsServiceInterfaces {
    private final RentalsRepository rentalsRepository;

    public RentalsService(RentalsRepository rentalsRepository) {
        this.rentalsRepository = rentalsRepository;
    }

    @Override
    public List<RentalsDto> getAll() {
        return null;
    }

    @Override
    public RentalsDto findOneRental(Integer id) {
        return null;
    }

    @Override
    public String addRentals(RentalsDto rentalsDto) {
        return null;
    }

    @Override
    public String updateRentals(Integer id) {
        return null;
    }
}
