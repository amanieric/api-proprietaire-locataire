package com.openclassroom.propriolocataire.repository;

import com.openclassroom.propriolocataire.entity.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends JpaRepository<Messages,Integer> {
}
