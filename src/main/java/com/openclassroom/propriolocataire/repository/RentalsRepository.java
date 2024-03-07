package com.openclassroom.propriolocataire.repository;

import com.openclassroom.propriolocataire.entity.Rentals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalsRepository extends JpaRepository<Rentals,Integer> {
}
